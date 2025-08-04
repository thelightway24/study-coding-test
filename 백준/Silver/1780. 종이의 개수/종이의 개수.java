import java.io.*;
import java.util.*;

public class Main {
	static int[][] map;
	static int[] count = new int[3];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		for (int i = 0; i < n; i++) {
			int[] inputArr = Arrays.stream(br.readLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
			System.arraycopy(inputArr, 0, map[i], 0, n);
		}
		solve(0, 0, n);
		System.out.println(count[0]);
		System.out.println(count[1]);
		System.out.println(count[2]);
	}

	static void solve(int x, int y, int size) {
		int v = map[x][y];
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (map[i][j] != v) {
					int newSize = size / 3;
					for (int dx = 0; dx < 3; dx++) {
						for (int dy = 0; dy < 3; dy++) {
							solve(x + dx * newSize, y + dy * newSize, newSize);
						}
					}
					return;
				}
			}
		}
		count[v + 1]++;
	}
}