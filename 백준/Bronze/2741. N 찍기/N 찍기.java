import java.io.*;
class Main{
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<n+1; i++){
            sb.append(i);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}