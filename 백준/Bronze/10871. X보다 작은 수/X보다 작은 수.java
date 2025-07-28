import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] sa) throws IOException{
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(
                            System.in));
    StringTokenizer conditionToken = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(conditionToken.nextToken());
    int X = Integer.parseInt(conditionToken.nextToken());

    StringJoiner result = new StringJoiner(" ");
    StringTokenizer numberToken = new StringTokenizer(br.readLine());
    while(N-- > 0){
      int num = Integer.parseInt(numberToken.nextToken());
      if(X<=num) continue;
      result.add(String.valueOf(num));
    }
    System.out.print(result);
  }
}