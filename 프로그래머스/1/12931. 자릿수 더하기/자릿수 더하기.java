import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        
        while(n>0){
            int temp = n/10;
            sum += n-(temp*10);
            n = temp;
        }
        return sum;
    }
}