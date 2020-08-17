package com.java.Main;

import pjtTest.Bicycle;
import pjtTest.ChildClass;
import pjtTest.Grandeur;
import pjtTest.ObjectClass;
import pjtTest.ThisClass;
import com.java.study.EmployeeBank;

public class main {
public static void main(String[] args) {
	
	//Grandeur 클레스 수업,*****************************************
	
	Grandeur myCar1 = new Grandeur(); //객체를 생성하는 키워드 new
	     
	myCar1.color = "red";	//클래스 속성(멤버변수)에 접근
	myCar1.gear ="auto";
	myCar1.price = 3000000;
	
	myCar1.run();	//메서드 호출
	myCar1.stop();
	myCar1.info();
	System.out.println();
	
	Bicycle myBicycle1 = new Bicycle(); //생성자일반
	myBicycle1.color = "red";//속성 멤버변수
	myBicycle1.price = 20000;
	myBicycle1.info();
	
	
	Bicycle myBicycle2 = new Bicycle("yellow", 100000);//오버라이딩 생성자
	myBicycle2.info();
	
	//2.Title ChildClass 수업*********************************
	
	ChildClass child1 = new ChildClass();
	child1.age =10;
	child1.gender =" man";
	child1.name = " Jang Chang min";
	
	//3.Title objectClass 수업 ************************************
	
	ObjectClass obj1 = new ObjectClass();
	ObjectClass obj2 = new ObjectClass();
	ObjectClass obj3 = new ObjectClass();
	/* myCar1 = 레퍼런스 라고부름 =>
	 *  객체의 주소를 저장함 
	 *  객체는 다른 메모리 공간에 저장 돼 있음
	 *  만약 객체를 아무 레퍼런스도 가르키고있지 
	 *  않으면 GC가 메모리를 비움 
	 *  
	 *  객체를 여러개 생성한다고 해서 모든레 퍼런스가
	 *  하나의 클래스,객체를 가르키고 있는것이 아님
	 *  하나의 레퍼런스가 각각 다른 객체를 가르킴.
	 */
	
	
	// 레퍼런스가 하나의 객체를 가르키는 것이 아님을 테스트
	if(obj1 == obj2) {
	System.out.println("obj1 == obj2");
	} else {
	System.out.println("obj1 != obj2");
	}
	
	if(obj2 == obj3) {
	System.out.println("obj2 == obj3");
	} else {
	System.out.println("obj2 != obj3");
	}
	
	if(obj1 == obj3) {
	System.out.println("obj1 == obj3");
	} else {
	System.out.println("obj1 != obj3");
	}
	
	
	//  Title = null****************************************
	
	/*레퍼런스 값에 null 값을 대입하면 생성되었던 객체 obj는
	 * 가리키는 레퍼런스가 존재하지 않으므로
	 * 가비지 컬렉터가 데이터를 회수해감 */
	System.out.println("obj1 ----> " + obj1);
	obj1.getInfo();
	
	obj1 = null; //레퍼런스 주소를 비움
	System.out.println("obj1 ----> " + obj1); //레퍼런스 안에 null값을 확인
	//obj1.getInfo();
	
	/* obj를 가르키던 레퍼런스가 없으므로 메소드 호출 불가
	 * 이때 가비지 컬렉터가 객체가 할당받았던 메모리를 
	 * 지워객체는 지워지지만 
	 * 레퍼런스가 (차지하고있던 메모리 공간은) 남아있음
	 * 새로운 객체를 가르켜 사용할 수 있음 
	 * obj1 = obj2; => obj2레퍼런스가 가리키던 객체를 가르킴
	 * System.out.println(""+obj1+ obj2);
	 */
	
	
	//생성자와 소멸자 this 키워드 ********************************
	
	//this 키워드 = 현제 객체를 가르킬때 사용함
	ThisClass this1 = new ThisClass();
	this1.thisTest(10, 20);
	this1.info();
	
	//패키지와 static********************************
	/*패키지의 앞에는 경로를 적고
	 * 패키지의 결정요령에는 해당 클래스들을 대표할 수 있는 이름으로 설정하고
	 * 대형 프로잭트에서는 패키지명을 공유해야 할 경우에는 도메인이름을 거꾸로한다
	 * 다른 패키지 안에 있는 클래스를 사용하고 싶다면 import 패키지명 키워드를사용한다
	 * 하나의 클래스만 뽑아 쓰고 싶다면 임포트 할때 패키지 명과 클래스 이름도 적으면된다.
	 * 클래스 import할때 모든 클래스를 다 쓰고싶을때는 import 패키지명.* 별을 넣어서 사용
	 * import없이 사용하고 싶으면 패키지 명부터 클레스까지 전부다 적어서 사용하면 사용가능
	 * */
	
	//static 키워드 어디서나 속성과 메서드를 공유할 수 잇음
	
	EmployeeBank client1 = new EmployeeBank("JangChangmin");
	client1.saveMoney(100);
	
	EmployeeBank client2 = new EmployeeBank("HongMoonTeak");
	client2.saveMoney(100);
	
	client1.getBankInfo();
	client2.getBankInfo();
	
} 

}
