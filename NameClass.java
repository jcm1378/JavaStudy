package pjtTest;


public class NameClass {
	
	//���θ޽�� �����Ҷ� �������α׷��� ���� ���� ������ 
	public static void main(String[] args) {
		
		 
		//sysout ġ�� ctrl + space = system.out.println("���string")
		//ctrl + s = ����� ������ �Ѵ� ��
		//crtl + space = assist code
		//run = ctrl + f11 
		System.out.println("Hello Java World!!!!!!!!!!!");
		
		int i =10; //���� ����� �ʱ�ȭ
		int j; // ��������
		j =100; // ���� �ʱ�ȭ
		
		System.out.println("i+j=" + (i+j)); // string i+j =��  + ���� �� �� �̾�ٿ� ���
		
		i=100;
		System.out.println("i ="+ i);
		
		i=50;
		System.out.println("i ="+ i);
		
		i=200;
		System.out.println("i ="+ i); //������ �����ؼ� ����� �� �ִ�.
		
		
		char c = 'a'; //������ �̸鼭 ����
		System.out.println("c = " + c);
		
		double d =10.258; //�Ǽ��� 8byte, float = 4byte
		System.out.println("d = "+ d);
		
		boolean b = false;//���� �ڷ���
		System.out.println("b = "+ b);
		
		String s = "Hello Java World!"; //String �ڷ���(��ü �ڷ������� ��������) ���Ÿ� �빮�� S
		System.out.println("s = "+s);
		
		//����ȯ
		
		//�ڵ�(������) ����ȯ = ���� ������ �޸𸮿��� ū ������ �޸𸮷� �̵�
		byte by =10; //�������� 1 byte
		int in = by;// 4byte 
		System.out.println("in = "+in);
		
		//����� �� ��ȯ = ū ������ �޸𸮿��� ���� ������ �޸𸮷� �̵�
		int iVar = 100;
		byte bVar = (byte)iVar; //������ �� (��ȯ���� ���Է�)
		System.out.println("bVar = " +bVar);
		
		//����� ����ȯ�� �����Ͱ� ���� �� �� �ִ�.
		iVar =123456;
		bVar = (byte)iVar;
		System.out.println("bVar =" +bVar); 
		
		//����ȯ�� ū ���ľȿ� ���������� ���� �� �ݴ�Ǹ� ������ ���ǵ� (ä�ﶧ������ ä��� ����)
		
		
		//���Ĺ��� C�� ���� ���ڿ��� �����ϰ�
		
		//���� ''�� ǥ���ϱ� ���ؼ� \\�� ������ �׸��� ���� �Ѱ�,�� ''���� �ٿ�ǥ ��� 
		System.out.printf("�ҹ��� \'%c\' �Ǵ빮�ڴ� \'%c\' �Դϴ�", 'a', 'A');
		
		//���ڿ� String�� ����ϱ� ���ؼ��� ""�� ���
		System.out.printf("�빮�� '/%s'/�� �ҹ��ڷ� �ٲٸ� '/%s'/ �Դϴ�", "java", "JAVA");
		
		// printf�� println == printf�� C��� ó�� %d, %c %f %s ���� println��  +������+ ���� �����ȿ� ���� �ʱ�ȭ �Ǿ� �־����, �ڷ����� ��� ���µ�
		
		
		
		//���׿����� ���ǽ� ? ��1 : ��2 ���ǽ��� ���̸� ��1�� ���� ���ǽ��� �����̸� ��2 ����
		
		int x,y;
		x =10; y=20;
		int result =0;
		result = (x>y) ? 100 : 200; //x y�� ���Ͽ� ���̸� result�� 100�� �����ϰ� �����̸� 200�� �����϶�
		System.out.println("result = "+ result);
		
		result = (x==y) ? 100:200;
		System.out.println("result =" + result); // x�� y�� ������ 100 �ٸ��� 200 x(==�� ������)y
		
		//�迭 [index]
		int[] arr1 = new int[2]; //�迭 ���� new�� ��ü�� �����ϱ� ����
		arr1[0] = 100; // �迭 �ʱ�ȭ
		arr1[1] = 200;
		System.out.println("arr1 =" + arr1[0]);
		System.out.println("arr1 =" + arr1[1]);
		
		
		//�迭 ����� �ʱ�ȭ
		int[] arr2 = {10, 20, 30, 40, 50};
		System.out.println("arr2 =" + arr2[0]);
		System.out.println("arr2 =" + arr2[1]);
		System.out.println("arr2 =" + arr2[2]);
		System.out.println("arr2 =" + arr2[3]);
		System.out.println("arr2 =" + arr2[4]);
		
		
	
		
	}
	
}
