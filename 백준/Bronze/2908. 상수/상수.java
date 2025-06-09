import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] c1 = st.nextToken().toCharArray();
        char[] c2 = st.nextToken().toCharArray();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i = 2; i>-1; i--){
            s1.append(c1[i]);
            s2.append(c2[i]);
        }
        int a = Integer.parseInt(s1.toString());
        int b = Integer.parseInt(s2.toString());
        System.out.println(Math.max(a, b));
        
    }
}