
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<String> input = new LinkedList<>();

		String s = br.readLine();
		for(int i = 0; i < s.length(); i++){
			input.add(s.substring(i, i+1));
		}

		int commandCount = Integer.parseInt(br.readLine());

		ListIterator<String> iterator = input.listIterator(input.size());
		for(int i = 0; i < commandCount; i++){
			String command = br.readLine();
			if(command.length() > 1){
				String text = command.substring(2);
				iterator.add(text);
			} else {
				if("L".equals(command)){
					if(iterator.hasPrevious()) iterator.previous();
				} else if("D".equals(command)){
					if(iterator.hasNext()) iterator.next();
				} else if("B".equals(command)){
					if(iterator.hasPrevious()){
						iterator.previous();
						iterator.remove();
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder(input.size());
		input.forEach(sb::append);
		System.out.println(sb);
	}
}