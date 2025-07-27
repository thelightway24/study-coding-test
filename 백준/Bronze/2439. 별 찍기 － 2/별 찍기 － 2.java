import java.io.*;
class Main{
    public static void main(String[] s) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        for(int i=1; i<n+1; i++){
            result.append(String.format("%" + n + "s", "*".repeat(i)));
            result.append("\n");
        }
        System.out.println(result);
    }
}