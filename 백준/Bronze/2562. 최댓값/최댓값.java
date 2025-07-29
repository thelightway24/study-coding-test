import java.io.*;
class Main{
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxNum = 0;
        int maxIndex = 0;
        for(int i=0; i<9; i++){
            int number = Integer.parseInt(br.readLine());
            if(number > maxNum){
                maxNum = number;
                maxIndex = i+1;
            }
        }
        System.out.println(maxNum);
        System.out.println(maxIndex);
    }
}