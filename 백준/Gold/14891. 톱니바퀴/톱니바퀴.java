import java.io.*;
import java.util.*;
class Main {
	static class Circle {
		int[] s;
		int head;

		public Circle(char[] stat){
			s = new int[9];
			int temp = 1;
			for (char c : stat){
				s[temp++] = c - '0';
			}
			head = 1;
		}

		public void clock(){
			head = head-1;
			if(head < 1){
				head = 8;
			}
		}

		public void reverseClock(){
			head = head+1;
			if(head > 8){
				head = 1;
			}
		}

		public int right(){
			int rHead = head+2;
			if(rHead > 8){
				rHead = rHead - 8;
			}
			return s[rHead];
		}

		public int left(){
			int lHead = head-2;
			if(lHead < 1){
				lHead = lHead + 8;
			}
			return s[lHead];
		}
	}

	static Circle[] circleArr;
	public static void main (String[] args) throws Exception {
		//톱니바퀴 4개, 톱니 8개
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//1번째 톱니바퀴
		char[] stat1 = br.readLine().toCharArray();
		Circle c1 = new Circle(stat1);

		char[] stat2 = br.readLine().toCharArray();
		Circle c2 = new Circle(stat2);

		char[] stat3 = br.readLine().toCharArray();
		Circle c3 = new Circle(stat3);

		char[] stat4 = br.readLine().toCharArray();
		Circle c4 = new Circle(stat4);

		circleArr = new Circle[5];
		circleArr[1] = c1;
		circleArr[2] = c2;
		circleArr[3] = c3;
		circleArr[4] = c4;

		int rotateCount = Integer.parseInt(br.readLine());
		while(rotateCount-- > 0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int circleSel = Integer.parseInt(st.nextToken());
			int rNumber = Integer.parseInt(st.nextToken());
			int[] rotateNumber = checkRotate(circleSel, rNumber);
			for(int i = 1; i < 5; i++){
				if(rotateNumber[i] == 1){
					circleArr[i].clock();
				} else if(rotateNumber[i] == -1) {
					circleArr[i].reverseClock();
				}
			}
		}
		System.out.println(calcPoint());
	}
	
	static int[] checkRotate(int circleSel, int rNumber){
		int[] result = new int[5];
		result[circleSel] = rNumber;

		int curCircleNum = circleSel;
		while(curCircleNum < 4){
			int nextCircleNum = curCircleNum+1;
			Circle curCircle = circleArr[curCircleNum];
			Circle nexCircle = circleArr[nextCircleNum];
			if(curCircle.right() != nexCircle.left()){
				result[nextCircleNum] = result[curCircleNum] * -1;
			} else {
				break;
			}
			curCircleNum++;
		}


		curCircleNum = circleSel;
		while(curCircleNum > 1){
			int preCircleNum = curCircleNum-1;
			Circle curCircle = circleArr[curCircleNum];
			Circle preCircle = circleArr[preCircleNum];
			if(curCircle.left() != preCircle.right()){
				result[preCircleNum] = result[curCircleNum] * -1;
			} else {
				break;
			}
			curCircleNum--;
		}
		return result;
	}


	// 점수계산
	static int calcPoint(){
		int sum = 0;
		sum += circleArr[1].s[circleArr[1].head];
		sum += circleArr[2].s[circleArr[2].head]*2;
		sum += circleArr[3].s[circleArr[3].head]*4;
		sum += circleArr[4].s[circleArr[4].head]*8;
		return sum;
	}

}