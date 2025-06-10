import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int assertTotal = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        while(n-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            sum += ( price * count );
        }
        if(assertTotal != sum){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}