package pjtTest;

public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	
	public ChildClass() {
		System.out.println("---construct");
	}
	
	

	//중복된 메서드(over roading) == 파라미터가 달라야함 그래야 중복 이름으로도 메서드를 사용할 수 있음 
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
	
	private void mySeceret() { // 접근자가 private 일땐 객체 안에서만 사용 가능하고 외부에서는 사용 불가능하다.
		System.out.println("Seceret");
	}
}
