import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfSubject = Integer.parseInt(br.readLine());
		StringTokenizer scoreOfInputString = new StringTokenizer(br.readLine());
		double[] scoreArray = new double[numberOfSubject];
		double maxScore = 0;
		double sum = 0;

		for(int i=0; i<numberOfSubject; i++) {
			double score = Double.parseDouble(scoreOfInputString.nextToken());
			if(score > maxScore) {
				maxScore = score;
			}
			scoreArray[i] = score;
		}
		
		for(int i = 0; i<numberOfSubject; i++) {
			sum += (scoreArray[i]/maxScore) * 100; 
		}
		double result = sum/numberOfSubject;
		System.out.println(result);
	}
}