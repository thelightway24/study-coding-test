import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main (String[] a) throws Exception {
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder result = new StringBuilder();
        for(int i=1; i < T+1; i++){
            result.append("Case #").append(i).append(": ")
                .append(solve())
                .append("\n");
        }
        System.out.println(result);
        
    }
    private static int solve() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        return a + b;
    }
}