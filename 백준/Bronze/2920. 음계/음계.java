import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int n1 = Integer.parseInt(st.nextToken());
		int type = n1 - n;

		if(type!=1&&type!=-1){
			System.out.println("mixed");
		} else {
			for(int i=2; i<8; i++){
				int expect = n1 + type;
				if(expect != Integer.parseInt(st.nextToken())){
					System.out.println("mixed");
					break;
				}
				n1 = expect;
				if(i==7){
					if(type > 0){
						System.out.println("ascending");
					} else {
						System.out.println("descending");
					}
				}
			}
		}

	}
}