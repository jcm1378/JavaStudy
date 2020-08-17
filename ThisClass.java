package pjtTest;

public class ThisClass {

	public int x;
	public int y;
	
	public ThisClass() {

	}
	
	public void thisTest(int x, int y) {
		this.x = x; //this 키워드가 가르키고 있는건 전역변수 x
		this.y = y; //this 키워드가 가치키고 있는건 전역변수 y
	}
	
	public void info() {
		System.out.println("x ---> " +x);
		System.out.println("x ---> " +y);
		
	}

}
