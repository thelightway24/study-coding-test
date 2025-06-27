import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] a) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int screenSize = Integer.parseInt(st.nextToken());
		int basketSize = Integer.parseInt(st.nextToken());
		//스크린에 배열 위치 정보 추가
		LinkedList<Integer> screen = new LinkedList<>();
		for (int i = 1; i <= screenSize; i++) {
			screen.offerLast(i);
		}

		for (int i = 0; i < basketSize - 1; i++) {
			screen.offerLast(screen.pollFirst());
		}
		int gameCount = Integer.parseInt(br.readLine());

		int result = 0;
		int basketIndex = 1;
		while (gameCount-- > 0) {
			int n = Integer.parseInt(br.readLine());
			if (basketIndex == 1) {
				while (n != basketIndex && n > basketIndex + basketSize - 1) {
					screen.offerLast(screen.pollFirst());
					basketIndex++;
					result++;
				}
			} else if (basketIndex == screenSize) {
				while (n != basketIndex && !(basketIndex < n && n < basketIndex + basketSize - 1)) {
					screen.offerFirst(screen.pollLast());
					basketIndex--;
					result++;
				}
			} else {
				int left = Math.abs(basketIndex - n);
				int right = Math.abs(basketIndex + basketSize - 1 - n);

				if (left > right) {
					while (n != basketIndex && n > basketIndex + basketSize - 1) {
						screen.offerLast(screen.pollFirst());
						basketIndex++;
						result++;
					}
				} else {
					while (n != basketIndex && !(basketIndex < n && n < basketIndex + basketSize - 1)) {
						screen.offerFirst(screen.pollLast());
						basketIndex--;
						result++;
					}
				}

			}
		}
		System.out.println(result);
	}
}