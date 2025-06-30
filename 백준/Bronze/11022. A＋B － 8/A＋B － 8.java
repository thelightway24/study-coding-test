import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main (String[] a) throws Exception {
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder result = new StringBuilder();
        for(int i=1; i < T+1; i++){
            solve(result, i);
        }
        System.out.println(result);
        
    }
    private static void solve(StringBuilder result, int i) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        result.append("Case #").append(i).append(": ")
              .append(a).append(" + ").append(b).append(" = ")
              .append(a+b).append("\n");
    }
}