import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] height = new int[n];
		Queue<Integer> queue = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			height[i] = Integer.parseInt(br.readLine());
			queue.add(i);
		}

		long sum = 0L;
		while(!queue.isEmpty()) {
			int index = queue.poll();
			int s = height[index];
			for(int i = index + 1; i < n; i++) {
				if(height[i] < s) {
					sum++;
				} else {
					break;
				}
			}
		}
		System.out.println(sum);
	}
}