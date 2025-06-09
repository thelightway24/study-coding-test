import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = -1_000_000;
        int min = 1_000_000;
        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            if(a > max){
                max = a;
            } 
            if (a < min){
                min = a;
            }
        }
        System.out.printf("%d %d", min, max);
    }
}