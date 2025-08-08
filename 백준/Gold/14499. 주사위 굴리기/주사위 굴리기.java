import java.io.*;
import java.util.*;
class Main {
	static class Pos {
		int x;
		int y;
		int limitX;
		int limitY;
	}
	static class Dice {
		int up;
		int down;
		int e;
		int w;
		int s;
		int n;

		void goS(){
			//남쪽 -> 바닥 -> 북 -> 위 -> 남
			//남->바닥
			int tempS = s;
			s = down;

			// 바닥 -> 북
			down = n;

			// 북 -> 위
			n = up;

			// 위 -> 남
			up = tempS;
		}

		void goN(){
			// 남 > 위 > 북 > 아래 > 남
			int tempS  = s;
			s = up;
			up = n;
			n = down;
			down = tempS;
		}

		void goW(){
			// 동 -> 위 -> 서 -> 아래 -> 동
			int tempE = e;
			e = up;
			up = w;
			w = down;
			down = tempE;
		}
		void goE(){
			// 동 -> 아래 -> 서 -> 위 -> 동
			int tempE = e;
			e = down;
			down = w;
			w = up;
			up = tempE;
		}
	}

	static Pos dicePos = new Pos();
	static Dice dice = new Dice();
	static int[][] map;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] condition = Arrays.stream(br.readLine().split(" "))
						  .mapToInt(Integer::parseInt)
						  .toArray();
		dicePos.limitY = condition[0];
		dicePos.limitX = condition[1];
		dicePos.y = condition[2] + 1;
		dicePos.x = condition[3] + 1;
		int commandN = condition[4];

		map = new int[dicePos.limitX+1][dicePos.limitY+1];
		// 맵 만듬
		for(int i=0; i < dicePos.limitY; i++){
			int[] inputNums = Arrays.stream(br.readLine().split(" "))
							  .mapToInt(Integer::parseInt)
			 				  .toArray();
			for(int j=0; j < inputNums.length; j++){
				map[j+1][i+1] = inputNums[j];
			}
		}

		// 명령 시작
		int[] commands = Arrays.stream(br.readLine().split(" "))
								.mapToInt(Integer::parseInt)
								.toArray();

		StringBuilder result = new StringBuilder();

		for(int com : commands){
			int r = resolve(com);
			if(r!=-1){
				result.append(r);
				result.append("\n");
			}
		}
		System.out.println(result);
	}

	static int resolve(int command){
		if(!주사위_이동(command)){
			return -1;
		};
		맵_변경();
		return dice.up;
	}

	static boolean 주사위_이동(int command){
		if(command == 1){ //동
			int nextX = dicePos.x+1;
			if(0<nextX && nextX < dicePos.limitX+1){
				dicePos.x = nextX;
				dice.goE();
			} else {
				return false;
			}
		}
		if(command == 2){ //서
			int nextX = dicePos.x-1;
			if(0<nextX && nextX < dicePos.limitX+1){
				dicePos.x = nextX;
				dice.goW();
			} else {
				return false;
			}
		}
		if(command == 3){ //북
			int nextY = dicePos.y-1;
			if(0<nextY && nextY < dicePos.limitY+1){
				dicePos.y = nextY;
				dice.goN();
			} else {
				return false;
			}
		}
		if(command == 4){ //남
			int nextY = dicePos.y+1;
			if(0<nextY && nextY < dicePos.limitY+1){
				dicePos.y = nextY;
				dice.goS();
			} else {
				return false;
			}
		}
		return true;
	}

	static void 맵_변경(){
		if(map[dicePos.x][dicePos.y] == 0){
			map[dicePos.x][dicePos.y] = dice.down;
		} else {
			dice.down = map[dicePos.x][dicePos.y];
			map[dicePos.x][dicePos.y] = 0;
		}
	}
}