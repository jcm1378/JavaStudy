package pjtTest;

public class ThisClass {

	public int x;
	public int y;
	
	public ThisClass() {

	}
	
	public void thisTest(int x, int y) {
		this.x = x; //this Ű���尡 ����Ű�� �ִ°� �������� x
		this.y = y; //this Ű���尡 ��ġŰ�� �ִ°� �������� y
	}
	
	public void info() {
		System.out.println("x ---> " +x);
		System.out.println("x ---> " +y);
		
	}

}
