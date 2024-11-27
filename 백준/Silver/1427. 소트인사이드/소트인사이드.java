import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;

public class Main {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userInput = br.readLine();
		int inputLength = userInput.length();
		Integer[] numberArray = new Integer[inputLength];
		
		for(int i=0; i<inputLength; i++) {
			numberArray[i] = Integer.parseInt(String.valueOf(userInput.charAt(i)));
		}
		
		Arrays.sort(numberArray, new NumberDesc());
		for(int i : numberArray) {
			System.out.print(i);
		}
	}
	
	static class NumberDesc implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1 > o2 ? -1 : o1 == o2 ? 0 : 1;
		}
		
	}
}