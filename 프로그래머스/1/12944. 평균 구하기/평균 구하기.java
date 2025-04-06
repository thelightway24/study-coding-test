class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        
        for(int num : arr){
            sum += num;
        }
        
        double answer = sum/arr.length;
        return answer;
    }
}