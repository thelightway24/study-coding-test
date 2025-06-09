import java.io.*;
import java.util.*;
public class Main{
    public static void main (String[] args) throws Exception {
        int[] result = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                        -1, -1, -1, -1, -1, -1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray();
        for(int i=0; i<text.length; i++){
            if(result[text[i] - 'a'] == -1){
                result[text[i] - 'a']= i;
            }
        }
        Arrays.stream(result).forEach(i -> System.out.print(i + " "));
    }
}