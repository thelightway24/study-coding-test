import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String as = br.readLine();
        String bs = br.readLine();
        String cs = br.readLine();
        int ab = Integer.parseInt(as+bs);
        int a = Integer.parseInt(as);
        int b = Integer.parseInt(bs);
        int c = Integer.parseInt(cs);
        System.out.println(a+b-c);
        System.out.println(ab-c);
        
    }
}