import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        int n = Integer.parseInt(br.readLine());
        System.out.print(c[n-1]);
    }
}