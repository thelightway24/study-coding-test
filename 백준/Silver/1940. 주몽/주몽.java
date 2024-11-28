import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] intArray = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			intArray[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(intArray);
		int startPoint = 0;
		int endPoint = n - 1;
		int count = 0;
		int sum = 0;

		while (startPoint < endPoint) {
			sum = intArray[endPoint] + intArray[startPoint];
			if (sum > m) {
				endPoint--;
			} else if (sum < m) {
				startPoint++;
			} else if (sum == m) {
				endPoint--;
				startPoint++;
				count++;
			}

		}

		System.out.println(count);

	}

}
