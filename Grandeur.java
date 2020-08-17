package pjtTest; //package = 폴더라고 생각하면 됨 

public class Grandeur { //클레스 이름 첫글자는 대문자
	
	//속성
	public String color;
	public String gear;
	public int price;
	
	public Grandeur() { //생성자 = 클래스 이름과 같은 함수형태 객체를 생성할때 사용함
		System.out.println("Classlecture constructor");
	}
	
	//메서드 (기능) 함수들로 이루어져 있음
	public void run() {
	/*퍼블릭  = 접근자 다른 곳에서 접근 가능하게 하는 것이 public
	 * void = 반환형, 주로 반환할 데이터가 없을때 void사용함
	 * run = 메서드 이름
	 * ()매개변수 */
		System.out.println("-- run --");
	}
	
	public void stop() {
		System.out.println("-- stop --");
	}
	
	public void info() {
		System.out.println("-- info --\n" + color);
	}
	
}
