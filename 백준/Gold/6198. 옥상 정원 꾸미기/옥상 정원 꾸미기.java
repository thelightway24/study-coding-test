import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] heights = new int[n];

		for(int i = 0; i < n; i++){
			heights[i] = Integer.parseInt(br.readLine());
		}

		long sum = 0;
		Deque<Integer> stack = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			int h = heights[i];
			while (!stack.isEmpty() && stack.peek() <= h) {
				stack.pop();
			}
			sum += stack.size();
			stack.push(h);
		}
		System.out.println(sum);
	}
}