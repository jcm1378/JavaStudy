package pjtTest;


public class NameClass {
	
	//메인메쏘드 실행할때 여러프로그램중 메인 먼저 실행함 
	public static void main(String[] args) {
		
		 
		//sysout 치고 ctrl + space = system.out.println("출력string")
		//ctrl + s = 저장과 컴파일 둘다 됨
		//crtl + space = assist code
		//run = ctrl + f11 
		System.out.println("Hello Java World!!!!!!!!!!!");
		
		int i =10; //변수 선언및 초기화
		int j; // 변수선언
		j =100; // 번수 초기화
		
		System.out.println("i+j=" + (i+j)); // string i+j =에  + 변수 로 값 이어붙여 출력
		
		i=100;
		System.out.println("i ="+ i);
		
		i=50;
		System.out.println("i ="+ i);
		
		i=200;
		System.out.println("i ="+ i); //변수는 변경해서 사용할 수 있다.
		
		
		char c = 'a'; //정수형 이면서 문자
		System.out.println("c = " + c);
		
		double d =10.258; //실수형 8byte, float = 4byte
		System.out.println("d = "+ d);
		
		boolean b = false;//논리형 자료형
		System.out.println("b = "+ b);
		
		String s = "Hello Java World!"; //String 자료형(객체 자료형으로 분휴으로) 쓸거면 대문자 S
		System.out.println("s = "+s);
		
		//형변환
		
		//자동(묵시적) 형변환 = 작은 공간의 메모리에서 큰 공간의 메모리로 이동
		byte by =10; //작은공간 1 byte
		int in = by;// 4byte 
		System.out.println("in = "+in);
		
		//명시적 형 변환 = 큰 공간의 메모리에서 작은 공간의 메모리로 이동
		int iVar = 100;
		byte bVar = (byte)iVar; //변수명 앞 (변환해줄 형입력)
		System.out.println("bVar = " +bVar);
		
		//명시적 형변환시 데이터가 누실 될 수 있다.
		iVar =123456;
		bVar = (byte)iVar;
		System.out.println("bVar =" +bVar); 
		
		//형변환은 큰 형식안에 작은형식이 들어가는 꼴 반대되면 데이터 누실됨 (채울때까지만 채우고 지움)
		
		
		//서식문자 C와 동일 문자열을 제외하고
		
		//문자 ''를 표시하기 위해서 \\를 삽입함 그리고 문자 한개,는 ''작은 다움표 사용 
		System.out.printf("소문자 \'%c\' 의대문자는 \'%c\' 입니다", 'a', 'A');
		
		//문자열 String을 사용하기 위해서는 ""를 사용
		System.out.printf("대문자 '/%s'/를 소문자로 바꾸면 '/%s'/ 입니다", "java", "JAVA");
		
		// printf와 println == printf는 C언어 처럼 %d, %c %f %s 으로 println은  +변수명+ 으로 변수안에 값이 초기화 되어 있어야함, 자료형은 상관 없는듯
		
		
		
		//삼항연산자 조건식 ? 식1 : 식2 조건식이 참이면 식1을 실행 조건식이 거짓이면 식2 실행
		
		int x,y;
		x =10; y=20;
		int result =0;
		result = (x>y) ? 100 : 200; //x y를 비교하여 참이면 result에 100을 대입하고 거짓이면 200을 대입하라
		System.out.println("result = "+ result);
		
		result = (x==y) ? 100:200;
		System.out.println("result =" + result); // x와 y가 같으면 100 다르면 200 x(==논리 연산자)y
		
		//배열 [index]
		int[] arr1 = new int[2]; //배열 선언 new는 객체로 선언하기 위함
		arr1[0] = 100; // 배열 초기화
		arr1[1] = 200;
		System.out.println("arr1 =" + arr1[0]);
		System.out.println("arr1 =" + arr1[1]);
		
		
		//배열 선언과 초기화
		int[] arr2 = {10, 20, 30, 40, 50};
		System.out.println("arr2 =" + arr2[0]);
		System.out.println("arr2 =" + arr2[1]);
		System.out.println("arr2 =" + arr2[2]);
		System.out.println("arr2 =" + arr2[3]);
		System.out.println("arr2 =" + arr2[4]);
		
		
	
		
	}
	
}
