import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String p : participant) {
            countMap.put(p, countMap.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            countMap.put(c, countMap.get(c) - 1);
        }
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        return "";
    }
}