import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        while(n-- > 0){
            StringBuilder result = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            char[] text = st.nextToken().toCharArray();
            for(char c : text){
                result.append(String.valueOf(c).repeat(r));
            }
            System.out.println(result);
        }
        
    }
}