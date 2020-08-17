package example;

import java.util.Scanner; //스캐너 쓸때 필요한 전처리

public class example {

	public static void main(String[] args) {
		String[] name = {"장창민", "홍문택", "나동빈", "김도현", "오민욱"};
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in); 
		System.out.printf("%s의 점수를 입력하세요 : ",name[0]);
		score[0] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하세요 : ",name[1]);
		score[1] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하세요 : ",name[2]);
		score[2] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하세요 : ",name[3]);
		score[3] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하세요 : ",name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s 점수 : %.2f\n", name[0], (double)score[0]);
		System.out.printf("%s 점수 : %.2f\n", name[1], (double)score[1]);
		System.out.printf("%s 점수 : %.2f\n", name[2], (double)score[2]);
		System.out.printf("%s 점수 : %.2f\n", name[3], (double)score[3]);
		System.out.printf("%s 점수 : %.2f\n", name[4], (double)score[4]);
		
		double ave = (double)(score[0] + score[1] + score[2] + score[3] +score[4])/5;
		System.out.printf("----------------\n평점 : \t %.2f",ave);
		
		scanner.close(); //Scanner은 사용하고 닫아주어 해제 해주어야함
	
	
		
//swith문
		
		System.out.print("점수를 입력하세요. : ");
		Scanner inputNum = new Scanner(System.in);
		int score2 = inputNum.nextInt(); 
				
		switch (score2) {
			case 100:
			case 90: //조건이 겹칠때
				System.out.println("수"); //정확히 90일때만				break;
			case 80:
				System.out.println("우");
				break;
			case 70:
				System.out.println("미");
				break;
				
			default: //모든 항목이 case와 일치하지 않을때.
				System.out.println("try again!!");
				break;
				}		
				
		
			
	
	
	
	}
}
