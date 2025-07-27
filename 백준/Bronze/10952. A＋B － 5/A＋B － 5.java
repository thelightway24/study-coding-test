import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] s) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder result = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0){
                break;
            }
            result.append(a+b);
            result.append("\n");
        }
        System.out.println(result);
    }
}