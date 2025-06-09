import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int[] arr = new int[n+1];
		while(n > 0){
			arr[n] = n;
			n--;
		}

		int m = Integer.parseInt(st.nextToken());
		while(m-- > 0){
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int c1 = Integer.parseInt(st2.nextToken());
			int c2 = Integer.parseInt(st2.nextToken());

			int temp = arr[c2];
			arr[c2] = arr[c1];
			arr[c1] = temp;
		}

		Arrays.stream(arr).skip(1).forEach(p -> System.out.print(p + " "));
	}
}