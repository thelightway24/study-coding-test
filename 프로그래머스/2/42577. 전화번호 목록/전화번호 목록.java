import java.util.*;
class Solution {
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