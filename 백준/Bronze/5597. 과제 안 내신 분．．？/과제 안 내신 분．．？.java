import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        boolean[] v = new boolean[31];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<28; i++){
            int n = Integer.parseInt(br.readLine());
            v[n] = true;
        }
        for(int i=1; i<31; i++){
            if(!v[i]){
                System.out.println(i);
            }
        }
    }
}