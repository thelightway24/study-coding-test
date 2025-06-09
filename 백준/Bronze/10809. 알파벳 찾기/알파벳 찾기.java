import java.io.*;
import java.util.*;
public class Main{
    public static void main (String[] args) throws Exception {
        int[] result = new int[26];
        Arrays.fill(result, -1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray();
        for(int i=0; i<text.length; i++){
            if(result[text[i] - 'a'] == -1){
                result[text[i] - 'a']= i;
            }
        }
        StringBuilder pr = new StringBuilder();
        for(int i=0; i<result.length; i++){
            pr.append(result[i])
              .append(" ");    
        }
        System.out.print(pr);
    }
}