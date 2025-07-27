const fs = require('fs');
const path = require('path');

const ROOTS = [
  { platform: '백준',        path: '백준' },
  { platform: '프로그래머스', path: '프로그래머스' }
];

const BJ_LEVELS = [
  'Unrated',
  'Bronze',
  'Silver',
  'Gold',
  'Platinum',
  'Diamond',
  'Ruby',
  'Master'
];

const EXT_CATEGORIES = [
  { name: '알고리즘', exts: ['.java', '.c'] },
  { name: 'SQL',     exts: ['.sql'] }
];

function getLevelDirs(basePath) {
  if (!fs.existsSync(basePath)) return [];
  return fs.readdirSync(basePath)
    .filter(n => fs.statSync(path.join(basePath, n)).isDirectory());
}

function getOrderedLevels(platform, basePath) {
  if (platform === '백준') {
    return BJ_LEVELS.filter(lv => fs.existsSync(path.join(basePath, lv)));
  }
  return getLevelDirs(basePath);
}

function getProblemDirs(levelPath) {
  if (!fs.existsSync(levelPath)) return [];
  return fs.readdirSync(levelPath)
    .filter(n => fs.statSync(path.join(levelPath, n)).isDirectory());
}

function parseProblemDirName(dirName) {
  const m = dirName.match(/^(\d+)\.\s*(.+)$/);
  return m ? { no: m[1], title: m[2] } : { no: '', title: dirName };
}

function makeLink(basePath, level, dir) {
  const rel = path.join(level, dir).replace(/\\/g, '/');
  return `[${dir}](${encodeURI(`./${basePath}/${rel}`)})`;
}

function createTableHeader() {
  return `| 레벨 | 문제 번호 | 문제 이름 |\n` +
         `|:----:|:--------:|:----------|\n`;
}

function getFileTable(platform, basePath) {
  const levels = getOrderedLevels(platform, basePath);
  if (!levels.length) return '';

  let md = `### ${platform}\n\n`;

  EXT_CATEGORIES.forEach(cat => {
    let section = '';

    levels.forEach(level => {
      const levelPath = path.join(basePath, level);
      const problems = getProblemDirs(levelPath);

      let rows = '';
      problems.forEach(dir => {
        const files = fs.readdirSync(path.join(levelPath, dir));
        if (!files.some(f => cat.exts.includes(path.extname(f).toLowerCase()))) return;
        const { no } = parseProblemDirName(dir);
        const link = makeLink(basePath, level, dir);
        rows += `| ${level} | ${no} | ${link} |\n`;
      });

      if (rows) {
        section += `<details>\n`;
        section += `<summary>${level}</summary>\n\n`;
        section += createTableHeader();
        section += rows;
        section += `</details>\n\n`;
      }
    });

    if (section) {
      md += `#### ${cat.name} 문제\n\n`;
      md += section;
    }
  });

  return md;
}

let content = `
# 🧠 코딩 테스트 문제 풀이
이 레포지토리는 다양한 플랫폼(백준, 프로그래머스)에서 코딩 테스트 문제를 풀고 정리한 공간입니다.

---

## 📌 Directory 구조
플랫폼 분류 > 레벨 분류로 구조화 되어있습니다.

\`\`\`bash
├── 백준/
│   ├── Unrated
│   ├── Bronze
│   └── ...
├── 프로그래머스/
│   ├── 0
│   └── 1
└── README.md
\`\`\`

`;

ROOTS.forEach(({ platform, path: basePath }) => {
  content += getFileTable(platform, basePath);
});

fs.writeFileSync('README.md', content, 'utf8');
console.log('README.md가 생성되었습니다.');
console.log(content);
