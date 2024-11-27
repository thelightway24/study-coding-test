import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Main {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] numberArray = new int[n];
		
		for(int i=0; i<n; i++) {
			String userInput = br.readLine();
			numberArray[i] = Integer.parseInt(userInput);
		}
		Arrays.sort(numberArray);
		for(int i : numberArray) {
			System.out.println(i);
		}
	}
}
