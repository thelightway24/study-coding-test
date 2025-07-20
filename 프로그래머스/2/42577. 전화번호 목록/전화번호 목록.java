import java.util.*;
class Solution {
    //해시 활용
    public boolean solution(String[] phone_book) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (String s : phone_book) {
            map.computeIfAbsent(s.length(), k -> new HashSet<>()).add(s);
        }

        for (String s : phone_book) {
            for (int i = 1; i < s.length(); i++) {
                Set<String> set = map.get(i);
                if (set != null && set.contains(s.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }
}

class Solution2 {
    public boolean solution(String[] phone_book) {
        //인접값 비교 방법
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}
