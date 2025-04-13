import java.util.*;

class Solution {
    public int solution(int n) {
        if(n == 0){
            return 0;
        }
        
        if(n == 1){
            return 1;
        }
        
        int count = 1;
        int answer = 0;
        while(count * count <= n){
            if(n%count==0){
                int num = n/count;
                answer += count;
                
                if(count != num){
                    answer += num;
                }
            }
            count++;
        }
        
        return answer;
    }
}