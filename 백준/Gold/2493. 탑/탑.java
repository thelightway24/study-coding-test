import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<int[]> stack = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int index = 0;
		while (n-- > 0) {
			index++;
			int topH = Integer.parseInt(st.nextToken());
			int temp = 0;
			boolean found = false;

			while(!stack.isEmpty()) {
				if(topH <= stack.peek()[0]){
					sb.append(stack.peek()[1]).append(" ");
					found = true;
					break;
				} else {
					stack.pop();
				}
			}
			if(!found){
				sb.append(0).append(" ");
			}

			stack.push(new int[]{topH, index});

		}
		System.out.println(sb);
	}
}