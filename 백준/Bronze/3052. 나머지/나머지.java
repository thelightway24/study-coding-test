import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception {
        int m = 10;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> result = new HashSet<>();
        while (m-- > 0){
            Integer a = Integer.parseInt(br.readLine()) % 42;
            result.add(a);
        }
        System.out.println(result.size());
    }
}