import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputByte = Integer.parseInt(br.readLine());
        int longCount = (inputByte + 1) / 4;
        System.out.println("long ".repeat(longCount) + "int");
    }
}