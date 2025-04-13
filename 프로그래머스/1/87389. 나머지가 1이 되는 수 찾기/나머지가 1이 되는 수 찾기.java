class Solution {
    public int solution(int n) {
        int count = 2;
        while(true){
            if((n-1) % count == 0){
                return count;
            }
            count++;
        }
    }
}