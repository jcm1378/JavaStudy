package com.java.study; //��Ű��,static ����

public class EmployeeBank {
	
	String name;
	static int amount = 0; //����ƽ���� �����ϸ� �ٸ� ��ü������ ������
	
	public EmployeeBank(String name){
		this.name = name;
	}
	
	public void saveMoney(int money) {
		amount += money;
		System.out.println("amount = "+amount);
	}
	
	public void spandMoney(int money) {
		amount -= money;
		System.out.println("amount = " +amount);
	}
	public void getBankInfo() {
		System.out.println("name = " +name);
		System.out.println("amount = "+amount);
	}

}
