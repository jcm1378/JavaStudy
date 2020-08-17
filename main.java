package com.java.Main;

import pjtTest.Bicycle;
import pjtTest.ChildClass;
import pjtTest.Grandeur;
import pjtTest.ObjectClass;
import pjtTest.ThisClass;
import com.java.study.EmployeeBank;

public class main {
public static void main(String[] args) {
	
	//Grandeur Ŭ���� ����,*****************************************
	
	Grandeur myCar1 = new Grandeur(); //��ü�� �����ϴ� Ű���� new
	     
	myCar1.color = "red";	//Ŭ���� �Ӽ�(�������)�� ����
	myCar1.gear ="auto";
	myCar1.price = 3000000;
	
	myCar1.run();	//�޼��� ȣ��
	myCar1.stop();
	myCar1.info();
	System.out.println();
	
	Bicycle myBicycle1 = new Bicycle(); //�������Ϲ�
	myBicycle1.color = "red";//�Ӽ� �������
	myBicycle1.price = 20000;
	myBicycle1.info();
	
	
	Bicycle myBicycle2 = new Bicycle("yellow", 100000);//�������̵� ������
	myBicycle2.info();
	
	//2.Title ChildClass ����*********************************
	
	ChildClass child1 = new ChildClass();
	child1.age =10;
	child1.gender =" man";
	child1.name = " Jang Chang min";
	
	//3.Title objectClass ���� ************************************
	
	ObjectClass obj1 = new ObjectClass();
	ObjectClass obj2 = new ObjectClass();
	ObjectClass obj3 = new ObjectClass();
	/* myCar1 = ���۷��� ���θ� =>
	 *  ��ü�� �ּҸ� ������ 
	 *  ��ü�� �ٸ� �޸� ������ ���� �� ����
	 *  ���� ��ü�� �ƹ� ���۷����� ����Ű������ 
	 *  ������ GC�� �޸𸮸� ��� 
	 *  
	 *  ��ü�� ������ �����Ѵٰ� �ؼ� ��緹 �۷�����
	 *  �ϳ��� Ŭ����,��ü�� ����Ű�� �ִ°��� �ƴ�
	 *  �ϳ��� ���۷����� ���� �ٸ� ��ü�� ����Ŵ.
	 */
	
	
	// ���۷����� �ϳ��� ��ü�� ����Ű�� ���� �ƴ��� �׽�Ʈ
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
	
	/*���۷��� ���� null ���� �����ϸ� �����Ǿ��� ��ü obj��
	 * ����Ű�� ���۷����� �������� �����Ƿ�
	 * ������ �÷��Ͱ� �����͸� ȸ���ذ� */
	System.out.println("obj1 ----> " + obj1);
	obj1.getInfo();
	
	obj1 = null; //���۷��� �ּҸ� ���
	System.out.println("obj1 ----> " + obj1); //���۷��� �ȿ� null���� Ȯ��
	//obj1.getInfo();
	
	/* obj�� ����Ű�� ���۷����� �����Ƿ� �޼ҵ� ȣ�� �Ұ�
	 * �̶� ������ �÷��Ͱ� ��ü�� �Ҵ�޾Ҵ� �޸𸮸� 
	 * ������ü�� ���������� 
	 * ���۷����� (�����ϰ��ִ� �޸� ������) ��������
	 * ���ο� ��ü�� ������ ����� �� ���� 
	 * obj1 = obj2; => obj2���۷����� ����Ű�� ��ü�� ����Ŵ
	 * System.out.println(""+obj1+ obj2);
	 */
	
	
	//�����ڿ� �Ҹ��� this Ű���� ********************************
	
	//this Ű���� = ���� ��ü�� ����ų�� �����
	ThisClass this1 = new ThisClass();
	this1.thisTest(10, 20);
	this1.info();
	
	//��Ű���� static********************************
	/*��Ű���� �տ��� ��θ� ����
	 * ��Ű���� ������ɿ��� �ش� Ŭ�������� ��ǥ�� �� �ִ� �̸����� �����ϰ�
	 * ���� ������Ʈ������ ��Ű������ �����ؾ� �� ��쿡�� �������̸��� �Ųٷ��Ѵ�
	 * �ٸ� ��Ű�� �ȿ� �ִ� Ŭ������ ����ϰ� �ʹٸ� import ��Ű���� Ű���带����Ѵ�
	 * �ϳ��� Ŭ������ �̾� ���� �ʹٸ� ����Ʈ �Ҷ� ��Ű�� ��� Ŭ���� �̸��� ������ȴ�.
	 * Ŭ���� import�Ҷ� ��� Ŭ������ �� ����������� import ��Ű����.* ���� �־ ���
	 * import���� ����ϰ� ������ ��Ű�� ����� Ŭ�������� ���δ� ��� ����ϸ� ��밡��
	 * */
	
	//static Ű���� ��𼭳� �Ӽ��� �޼��带 ������ �� ����
	
	EmployeeBank client1 = new EmployeeBank("JangChangmin");
	client1.saveMoney(100);
	
	EmployeeBank client2 = new EmployeeBank("HongMoonTeak");
	client2.saveMoney(100);
	
	client1.getBankInfo();
	client2.getBankInfo();
	
} 

}
