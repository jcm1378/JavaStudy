package pjtTest;

public class Bicycle {
	
	public String color;
	public int price;
	
	//�Ķ���Ͱ� ���� ������ ==> ����Ʈ ������ => Ŭ������ �����ڸ� ������ �ʰ� �ٸ� ������ ��ü�� �����ϰԵǸ� �����Ϸ��� ����Ʈ �����ڸ� �������
	public Bicycle() {
		System.out.println("Bicycle constructor - I");
	}
	
	//�Ķ���Ͱ� �ִ� ������ ==> ����� ���� ������
	public Bicycle(String c, int p) { //�����ڿ� �Ű�����(�Ķ����)�� �־� �� ��� �����ڸ� �ΰ� ����ص��� �Ű������� �ٸ��� �������� - �������̵�.
		System.out.println("Bicycle constructor - II");
		
		color =c;
		price =p;
	}

	public void info() { //�޼��忡 �̸��� ǥ���Ҷ��� ��Ÿǥ�����
		System.out.println("--info--");
		System.out.println("color :"+color);
		System.out.println("price : "+price);
	}
}
