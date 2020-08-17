/*
 * package pjtTest;

import java.util.Arrays;
import java.util.Scanner;

 public class lecture2 {
	public static void main(String[] args) {
		
	
		//배열과 메모리
		
		int[] arrAtt1 = {10, 20, 30, 40, 50};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		//배열의 길이
		System.out.println("arrAtt.length :" + arrAtt1.length);
		
		//배열의 요소 출력
		System.out.println("arrAtt1 : "+ Arrays.toString(arrAtt1)); //Arrays객체 안에 있는 함수 toString(출력할 배열)
		
		//배열 요소의 복사 (arrAtt1이 가르키는 배열 주소를 가르키는 것이 아니라 동일한 값을 저장한 다른 배열을 가르키는 것)
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length); //Arrays = 배열에 관한 것들이 있는 곳인듯 (함수 )copyOF(복사할 값과, 생성할 배열의 길이)
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		
		//배열 레퍼런스 (arrAtt1과 같은 배열의 주소를 동시에 가르키고 있음
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
		
		
		//2차원 배열
		int[][] arrMul = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0])); //toString출력함수는 첫번째 행을 가르키면 그 행의 열을 출력함
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[1]));
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[2]));
		
		//반복문 for
		System.out.print("INPUT NUMBER : ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		for(int i =1; i<10; i++) {
			System.out.printf("%d * %d = %d\n",inputNum,i,(inputNum*i));
		}
		
		//반복문 while
		
	System.out.print("INPUT NUMBER : "	);
	int num = scanner.nextInt();
	int i =1;
	while(i<10) {
		System.out.printf("%d * %d = %d\n", num,i,(num*i));
		i++;
	}
		
	
	//do while = 최소한 한번은 실행한다.
	do {
		System.out.println("무조건 1번은 실행합니다.");
	} while (false);

	}
}
*/

