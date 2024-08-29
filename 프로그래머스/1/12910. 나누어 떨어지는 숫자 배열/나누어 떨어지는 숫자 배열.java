import java.util.TreeSet;
class Solution {
    public int[] solution(int[] arr, int divisor) {

        TreeSet<Integer> tempInt = new TreeSet<>();
        for (int i = 0; i < arr.length; i++){
            if(isMultiple(arr[i], divisor) > 0){
                tempInt.add(arr[i]);
            }
        }
        int intSize = tempInt.size();
        if ( tempInt.size() == 0 ) intSize++;
        
        int[] answer = new int[intSize];

        if(tempInt.size()>0){
            answer = tempInt.stream().mapToInt(i -> i).toArray(); // 고급 for문과 효율성 차이가 크지 않음
        } else answer[0] = -1;
        return answer;
    }

    private int isMultiple(int num, int divisor){
        int multi = divisor;
        while(true){
            if(num == multi){
                return num;
            } else {
                if(num > multi){
                    multi += divisor;
                } else {
                    return -1;
                }
            }
        }
    }
}
