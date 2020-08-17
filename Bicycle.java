package pjtTest;

public class Bicycle {
	
	public String color;
	public int price;
	
	//파라미터가 없는 생성자 ==> 디폴트 생성자 => 클래스의 생성자를 만들지 않고 다른 곳에서 객체를 생성하게되면 컴파일러가 디폴트 생성자를 만들어줌
	public Bicycle() {
		System.out.println("Bicycle constructor - I");
	}
	
	//파라미터가 있는 생성자 ==> 사용자 정의 생성자
	public Bicycle(String c, int p) { //생성자에 매개변수(파라미터)를 넣어 준 경우 생성자를 두개 사용해도됨 매개변수만 다르면 생성가능 - 오버라이딩.
		System.out.println("Bicycle constructor - II");
		
		color =c;
		price =p;
	}

	public void info() { //메서드에 이름을 표기할때는 낙타표기로함
		System.out.println("--info--");
		System.out.println("color :"+color);
		System.out.println("price : "+price);
	}
}
