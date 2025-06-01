import java.io.*;
import java.util.StringTokenizer;

public class Main {
	/**
	 * 남 여 가르기
	 * 한 방에 같은 학년
	 *
	 * 한방에 배정할 수 있는 최대 인원 K
	 *
	 * 참가자수 N
	 * 다음 N개의 각 줄
	 * 성별 학년
	 */
	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			//전체 인원수 V 한방에 배정할 수 있는 최대 인원수
			StringTokenizer tokenizer = inputRead(br);
			int peopleCount = toTokenGetInt(tokenizer);
			int roomSize = toTokenGetInt(tokenizer);

			int[][] room = new int[7][2];

			int roomCount = 0;
			for(int i = 0; i < peopleCount; i++){
				tokenizer = inputRead(br);
				int gender = toTokenGetInt(tokenizer);
				int grade = toTokenGetInt(tokenizer);
				if(room[grade][gender] == 0 || room[grade][gender] % roomSize == 0){
					roomCount++;
				}
				room[grade][gender]++;
			}
			System.out.println(roomCount);
		}

	}

	private static int toTokenGetInt(StringTokenizer tokenizer) {
		return Integer.parseInt(tokenizer.nextToken());
	}

	private static StringTokenizer inputRead(BufferedReader br) throws IOException {
		String userInputRoomCondition = br.readLine();
		StringTokenizer tokenizer = new StringTokenizer(userInputRoomCondition, " ");
		return tokenizer;
	}
}
