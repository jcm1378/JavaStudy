package pjtTest;

import java.util.Arrays;

public class lecture2 {
	public static void main(String[] args) {
		//�迭�� �޸�
		
		int[] arrAtt1 = {10, 20, 30, 40, 50};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		//�迭�� ����
		System.out.println("arrAtt.length :" + arrAtt1.length);
		
		//�迭�� ��� ���
		System.out.println("arrAtt1 : "+ Arrays.toString(arrAtt1)); //Arrays��ü �ȿ� �ִ� �Լ� toString(����� �迭)
		
		//�迭 ����� ���� (arrAtt1�� ����Ű�� �迭 �ּҸ� ����Ű�� ���� �ƴ϶� ������ ���� ������ �ٸ� �迭�� ����Ű�� ��)
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length); //Arrays = �迭�� ���� �͵��� �ִ� ���ε� (�Լ� )copyOF(������ ����, ������ �迭�� ����)
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		
		//�迭 ���۷��� (arrAtt1�� ���� �迭�� �ּҸ� ���ÿ� ����Ű�� ����
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
		
		
		//2���� �迭
		int[][] arrMul = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0])); //toString����Լ��� ù��° ���� ����Ű�� �� ���� ���� �����
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[1]));
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[2]));
		
	}
	


}
