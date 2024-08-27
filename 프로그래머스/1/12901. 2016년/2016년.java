class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] mon = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int maxDay = a-1;
        int monToDay = 0;
        for (int i=0; i < a-1; i++){
            monToDay += mon[i];
        }
        monToDay += b;
        
        int offset = (monToDay%7) + 4;
        if(offset > 6) offset -= 7;
        answer = week[offset];
        return answer;
    }
}