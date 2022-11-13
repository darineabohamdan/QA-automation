package com.JavaBasicPrograms;

public class TestJava {
	//1.Variable
	//2.Method
	//3.Constructor
	
	//Second we execute here
	TestJava(){
		System.out.println("TestJava class constructor");
	}
	//Parameterized constructor
	TestJava(String name){
		System.out.println("Name="+name);
	}
   //First we execute here
	public static void main(String[] args) {
	   TestJava t=new TestJava();//here TestJava() is a constructor.It looks like the method.
	   
	   //we can create multiple objects
	   TestJava t1=new TestJava();
	   TestJava t2=new TestJava("Darine");
	}

}
