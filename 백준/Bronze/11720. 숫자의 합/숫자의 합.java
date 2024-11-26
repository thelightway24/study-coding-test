import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfItem = Integer.parseInt(br.readLine());
		
		char[] numberArray = br.readLine().toCharArray();
		
		int sum = 0;
		
		for(int i=0; i<numberOfItem; i++) {
			sum+= numberArray[i] - 48;
		}
		System.out.println(sum);
	}

}