import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> max = new HashSet<Integer>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));
        int selNum = nums.length / 2;
        int selMax = max.size();
        if(selNum >= selMax) answer = selMax;
        else answer = selNum;
        return answer;
    }
}