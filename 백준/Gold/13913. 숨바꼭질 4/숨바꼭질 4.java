import java.io.*;
import java.util.*;

public class Main {
	static final int MAX = 100_000;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int start = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());

		if (start == target) {
			System.out.println(0);
			System.out.println(start);
			return;
		}

		int[] dist = new int[MAX + 1];
		int[] prev = new int[MAX + 1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		Arrays.fill(prev, Integer.MAX_VALUE);

		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.add(start);
		dist[start] = 0;
		prev[start] = -1; // 시작이 끝지점

		while (!q.isEmpty()) {
			int cur = q.poll();
			int[] nexts = {cur - 1, cur + 1, cur * 2};
			for (int nx : nexts) {
				if (nx < 0 || nx > MAX) continue;

				if (dist[cur] + 1 < dist[nx]) {
					dist[nx] = dist[cur] + 1;
					prev[nx] = cur;
					q.add(nx);

					if (nx == target) {
						q.clear();
						break;
					}
				}
			}
		}

		int len = dist[target] + 1;
		int[] path = new int[len];
		int v = target;
		for (int i = len - 1; i >= 0; i--) {
			path[i] = v;
			v = prev[v];
		}

		StringBuilder sb = new StringBuilder();
		sb.append(dist[target]).append('\n');
		for (int i = 0; i < len; i++) {
			if (i > 0) sb.append(' ');
			sb.append(path[i]);
		}
		System.out.println(sb);
	}
}