package pjtTest;

public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	
	public ChildClass() {
		System.out.println("---construct");
	}
	
	

	//�ߺ��� �޼���(over roading) == �Ķ���Ͱ� �޶���� �׷��� �ߺ� �̸����ε� �޼��带 ����� �� ���� 
	public void getInfo() {
		System.out.println("getInfo- I ---");
	}

	public void getInfo(int x, int y) {
		System.out.println("---getInfo -II--");
		System.out.printf("parameter --> x : %d, y : %d\n",x,y);
	}
	
	public void getInfo(String s1, String s2) {
		System.out.println("--getInfo- III--");
		System.out.printf("parameter --> s1 : %s, s2 : %s\n",s1,s2);
	}
	
	private void mySeceret() { // �����ڰ� private �϶� ��ü �ȿ����� ��� �����ϰ� �ܺο����� ��� �Ұ����ϴ�.
		System.out.println("Seceret");
	}
}
