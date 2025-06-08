import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    if(a > 79){
        System.out.println(
            a > 89 ? "A" : "B"
        );
    } else {
        System.out.println(
            a > 69 ? "C" :
            (a > 59 ? "D" : "F")
        );
    }
  }
}