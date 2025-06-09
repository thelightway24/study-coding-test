import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(br.readLine());
		m += d;
		while(m>=60){
			m -= 60;
			h += 1;
			if(h>=24){
				h -= 24;
			}
		}
		System.out.println(h + " " + m);
	}
}