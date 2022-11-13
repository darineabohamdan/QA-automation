package com.JavaBasicPrograms;

public class Methods1 {
	static String name;
	int age;
	
	//static method
	public static void details1(Methods1 m1) { //we call it anything ghair m1
		name="Darine";
		m1.age=25;//pay attention here!
	}

	
	//non static method
	public void details2() {
		name="Josee";
		age=23;
	}
	public static void main(String[] args) {
		Methods1 m =new Methods1();
		m.details2();//by object reference we call the non static method.
		m.details1(m);//warning but no syntax error. because we can directly call the static method.

	}

}
