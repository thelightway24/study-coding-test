import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer one = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(one.nextToken()); // 바구니
        int m = Integer.parseInt(one.nextToken()); // 회차
        int[] arr = new int[n];
        
        for(int i=0; i<m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            for(int j=start; j<end; j++){
                arr[j] = num;
            }
        }
        for(int res : arr){
            System.out.print(res + " ");
        }
        
    }
}