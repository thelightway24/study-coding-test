import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int answer = 0;
        for(int i=0; i<5; i++){
            int num = Integer.parseInt(st.nextToken());
            answer += (num * num);
        }
        answer = answer % 10;
        System.out.println(answer);
    }
}