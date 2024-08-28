import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        
        int previousNum = -1;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(previousNum != arr[i]){
                temp.add(arr[i]);
                previousNum = arr[i];
            }
        }
        
        int[] answer = new int[temp.size()];
        for(int i=0; i < answer.length; i++){
            answer[i] = temp.get(i);
        }


        return answer;
    }
}