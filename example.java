package example;

import java.util.Scanner; //��ĳ�� ���� �ʿ��� ��ó��

public class example {

	public static void main(String[] args) {
		String[] name = {"��â��", "ȫ����", "������", "�赵��", "���ο�"};
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in); 
		System.out.printf("%s�� ������ �Է��ϼ��� : ",name[0]);
		score[0] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��ϼ��� : ",name[1]);
		score[1] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��ϼ��� : ",name[2]);
		score[2] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��ϼ��� : ",name[3]);
		score[3] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��ϼ��� : ",name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s ���� : %.2f\n", name[0], (double)score[0]);
		System.out.printf("%s ���� : %.2f\n", name[1], (double)score[1]);
		System.out.printf("%s ���� : %.2f\n", name[2], (double)score[2]);
		System.out.printf("%s ���� : %.2f\n", name[3], (double)score[3]);
		System.out.printf("%s ���� : %.2f\n", name[4], (double)score[4]);
		
		double ave = (double)(score[0] + score[1] + score[2] + score[3] +score[4])/5;
		System.out.printf("----------------\n���� : \t %.2f",ave);
		
		scanner.close(); //Scanner�� ����ϰ� �ݾ��־� ���� ���־����
	
	
		
//swith��
		
		System.out.print("������ �Է��ϼ���. : ");
		Scanner inputNum = new Scanner(System.in);
		int score2 = inputNum.nextInt(); 
				
		switch (score2) {
			case 100:
			case 90: //������ ��ĥ��
				System.out.println("��"); //��Ȯ�� 90�϶���				break;
			case 80:
				System.out.println("��");
				break;
			case 70:
				System.out.println("��");
				break;
				
			default: //��� �׸��� case�� ��ġ���� ������.
				System.out.println("try again!!");
				break;
				}		
				
		
			
	
	
	
	}
}
