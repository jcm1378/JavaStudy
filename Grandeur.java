package pjtTest; //package = ������� �����ϸ� �� 

public class Grandeur { //Ŭ���� �̸� ù���ڴ� �빮��
	
	//�Ӽ�
	public String color;
	public String gear;
	public int price;
	
	public Grandeur() { //������ = Ŭ���� �̸��� ���� �Լ����� ��ü�� �����Ҷ� �����
		System.out.println("Classlecture constructor");
	}
	
	//�޼��� (���) �Լ���� �̷���� ����
	public void run() {
	/*�ۺ�  = ������ �ٸ� ������ ���� �����ϰ� �ϴ� ���� public
	 * void = ��ȯ��, �ַ� ��ȯ�� �����Ͱ� ������ void�����
	 * run = �޼��� �̸�
	 * ()�Ű����� */
		System.out.println("-- run --");
	}
	
	public void stop() {
		System.out.println("-- stop --");
	}
	
	public void info() {
		System.out.println("-- info --\n" + color);
	}
	
}
