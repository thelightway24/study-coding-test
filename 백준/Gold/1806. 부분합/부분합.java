import java.io.*;
import java.util.*;

public class Main{
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in)
		);

		StringTokenizer condition = new StringTokenizer(br.readLine());
		int numberCount = Integer.parseInt(condition.nextToken());
		int expectValue = Integer.parseInt(condition.nextToken());

		int[] numArr = new int[numberCount];
		StringTokenizer numbers = new StringTokenizer(br.readLine());
		for(int i=0; i<numberCount; i++){
			numArr[i] = Integer.parseInt(numbers.nextToken());
		}

		int len = 0;
		int left = 0;
		int sum = 0;
		for(int right = 0; right<numberCount; right++){
			sum += numArr[right];

			while(sum >= expectValue){
				int c = right - left + 1;
				if(len == 0 || len > c){
					len = c;
				}
				sum -= numArr[left++];
			}
		}
		System.out.println(len);
	}
}