import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			// 수열 길이 입력받기
			String inputLength = br.readLine();

			// 전체 수열 입력 받기
			String inputNumbers = br.readLine();
			StringTokenizer st = new StringTokenizer(inputNumbers);

			// 수열 배열 만들고 값 넣기
			int[] numbers = new int[Integer.parseInt(inputLength)];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = Integer.parseInt(st.nextToken());
			}

			// 조건 값 입력 받기
			int condition = Integer.parseInt(br.readLine());

			// 전체 수열 정렬
			Arrays.sort(numbers);

			// 왼쪽 + 오른쪽
			// 두 포인터 만날 때 까지
			int leftPoint = 0;
			int rightPoint = numbers.length - 1;

			int count = 0;
			while (leftPoint != rightPoint) {
				if (numbers[leftPoint] + numbers[rightPoint] == condition) {
					count++;
					leftPoint++;
					continue;
				}

				if (numbers[leftPoint] + numbers[rightPoint] > condition) {
					rightPoint--;
					continue;
				}

				if (numbers[leftPoint] + numbers[rightPoint] < condition) {
					leftPoint++;
					continue;
				}
			}
			System.out.println(count);
		}
	}
}
