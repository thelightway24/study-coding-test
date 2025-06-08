import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if(b < 45){
			a -= 1;
			b += 60;
		}
		b -= 45;
		if(a<0){
			a += 24;
		}
		System.out.printf("%d %d", a, b);
	}
}