import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> a = new LinkedList<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());
		int pollIndex = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= count; i++) {
			a.add(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for (int i = 1; i < pollIndex; i++) {
			a.offerLast(a.pollFirst());
		}
		sb.append(a.pollFirst());
		while (!a.isEmpty()) {
			sb.append(", ");
			for (int i = 1; i < pollIndex; i++) {
				a.offerLast(a.pollFirst());
			}
			sb.append(a.pollFirst());
		}
		sb.append(">");
		System.out.println(sb);

	}
}