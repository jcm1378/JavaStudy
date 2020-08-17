package com.java.study; //패키지,static 수업

public class EmployeeBank {
	
	String name;
	static int amount = 0; //스테틱으로 선언하면 다른 객체에서도 공유함
	
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
