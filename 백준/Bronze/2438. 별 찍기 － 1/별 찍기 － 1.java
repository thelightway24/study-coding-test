import java.io.*;
class Main {
    public static void main(String[] s) throws Exception{
        int n;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            n = Integer.parseInt(br.readLine());
        }
        StringBuilder result = new StringBuilder();
        for(int i=1; i<n+1; i++){
            result.append("*".repeat(i));
            result.append("\n");
        }
        System.out.println(result);
    }
}