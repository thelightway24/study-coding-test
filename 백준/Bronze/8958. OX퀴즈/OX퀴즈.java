import java.io.*;

class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		while(testCase-- > 0){
			st.append(solve(br.readLine()));
			st.append("\n");
		}
		System.out.println(st);
	}

	static int solve(String input){
		char[] cArr = input.toCharArray();

		int chain = 1;
		int sum = 0;
		for(char c : cArr){
			if(c == 'O'){
				sum += chain;
				chain++;
			} else {
				chain = 1;
			}
		}
		return sum;
	}
}