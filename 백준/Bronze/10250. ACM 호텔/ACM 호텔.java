import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(testCase-- > 0){
			sb.append(solve(br.readLine()));
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static String solve(String input){
		int[] numArr = Arrays.stream(input.split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();
		int h = numArr[0];
		int w = numArr[1];
		int chance = numArr[2];
		int count = 0;
		int curH = 0;
		int curW = 1;
		while(chance != count){
			count++;
			if(curH == h){
				curH = 0;
				curW++;
			}
			curH++;
		}

		return curH + String.format("%02d", curW);
	}
}