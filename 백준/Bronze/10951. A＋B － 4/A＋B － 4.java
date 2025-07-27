import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] sa) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String in = "";
        while((in = br.readLine()) != null && !in.isEmpty()){
            StringTokenizer t = new StringTokenizer(in);
            int a = Integer.parseInt(t.nextToken());
            int b = Integer.parseInt(t.nextToken());
            result.append(a+b);
            result.append("\n");
        }
        System.out.println(result);
    }
}