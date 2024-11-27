import java.io.IOException;
public class Main {
	private static int input(){
		try {
			int a, b = System.in.read() & 15;
			while((a = System.in.read())>32) {
				b = (b<<3) + (b<<1) + (a&15);
			}
			return b;
		} catch (IOException e) {
			return 0;
		}
		
	}
	public static void main(String args[]) {
		int n = input();
		int start = 1;
		int   end = 1;
		int count = 1;
		int   sum = 1;
		
		while(end !=n) {
			if(sum < n) {
                end++; 
				sum += end;
			}
			else if(sum > n) {
				sum -= start;
				start++;
			}
			else if(sum==n) {
				end++;                
				sum += end;
				count++;
			} 
		}
		System.out.println(count);
	}
}
