import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] a) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		Map<Integer, Integer> freq = new LinkedHashMap<>();
		Map<Integer, List<Integer>> resultMap = new HashMap<>();

		StringTokenizer numbersToken = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int number = Integer.parseInt(numbersToken.nextToken());
			int putValue = freq.getOrDefault(number, 0) + 1;
			freq.put(number, putValue);
		}
		freq.forEach((k, v) -> {
			List<Integer> list = resultMap.get(v);
			if(list == null) {
				List<Integer> l  = new ArrayList<>();
				for(int i=0; i<v; i++){
					l.add(k);
				}
				resultMap.put(v, l);
			} else {
				for(int i=0; i<v; i++){
					list.add(k);
				}
			}
		});

		StringBuilder sb = new StringBuilder();
		for(int i = n; i > 0; i--) {
			List<Integer> list = resultMap.get(i);
			if(list == null) continue;
			for (int j : list) {
				sb.append(j).append(" ");
			}
		}
		System.out.println(sb);
	}
}