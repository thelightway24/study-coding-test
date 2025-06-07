
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int a_c = a%c;
		int b_c = b%c;
		System.out.printf("%s\n%s\n%s\n%s",
			(a+b)%c,
			(a_c + b_c) % c,
			(a*b) % c,
			(a_c * b_c)%c
		);

	}
}