const fs = require('fs');
const path = require('path');

const ROOTS = [
  { platform: '백준', path: '백준' },
  { platform: '프로그래머스', path: '프로그래머스' }
];

function getFilesDfs(dir, basePath) {
  let results = [];
  const list = fs.readdirSync(dir);

  list.forEach(file => {
    const fullPath = path.join(dir, file);
    const relPath = path.relative(basePath, fullPath);
    const stat = fs.statSync(fullPath);
    if (stat && stat.isDirectory()) {
      results = results.concat(getFilesDfs(fullPath, basePath));
    } else if (stat && stat.isFile()) {
      results.push(relPath);
    }
  });

  return results;
}

function getFileTable(platform, basePath) {
  if (!fs.existsSync(basePath)) return '';
  const levels = fs.readdirSync(basePath).filter(x => fs.statSync(path.join(basePath, x)).isDirectory());
  let table = `### ${platform}\n\n| 레벨 | 문제 파일 |\n|:----:|:---------|\n`;

  levels.forEach(level => {
    const levelPath = path.join(basePath, level);
    if (!fs.existsSync(levelPath) || !fs.statSync(levelPath).isDirectory()) return;

    const files = getFilesDfs(levelPath, levelPath)
      .map(relPath =>
        `[${relPath.replace(/\\/g, '/')}](${encodeURI('./' + basePath + '/' + level + '/' + relPath).replace(/\\/g, '/')})`
      );
    table += `| ${level} | ${files.join('<br>')} |\n`;
  });
  return table + '\n';
}

let content = `
# 🧠 코딩 테스트 문제 풀이
이 레포지토리는 다양한 플랫폼(백준, 프로그래머스)에서 코딩 테스트 문제를 풀고 정리한 공간입니다.

---

## 📌 Directory 구조
플랫폼 분류 > 레벨 분류로 구조화 되어있습니다.

\`\`\`bash
├── 백준/          # 백준 문제 풀이
│   ├── Bronze
│   └── Sliver
├── 프로그래머스/       # 프로그래머스 문제 풀이
│   ├── 0
│   └── 1
│   └── 2
└── README.md
\`\`\`


`;
ROOTS.forEach(({ platform, path: basePath }) => {
  content += getFileTable(platform, basePath);
});

fs.writeFileSync('README.md', content, 'utf8');
console.log('README.md가 생성되었습니다.');
console.log(content);