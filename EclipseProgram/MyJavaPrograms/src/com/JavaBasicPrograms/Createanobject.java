package com.JavaBasicPrograms;

public class Createanobject {
	
	//data members of this class
	//Non static variable means without key static
	int a;
	double s;
	

	public static void main(String[] args) {
		// State-Value(variable) Behavior-functionality(Method)
		//Syntax to create object
		Createanobject co=new Createanobject();
        //Note only static variable can be called directly
		System.out.println(co.a);
		System.out.println(co.s);
		co.a=237;
		co.s=234.5;
		
		System.out.println(co.a);
		System.out.println(co.s);
		
		
		
	}
	
	

}
