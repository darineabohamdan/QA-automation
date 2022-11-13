package com.JavaBasicPrograms;

public class LocalVariables {
	
	public static void MyName(String name) {
	
		System.out.println("My name is "+name);
		}

	public static void main(String[] args) {
		MyName("Darine");
		System.out.println(StaticVariable.name);//if we remove class StaticVariable we will get an error

	}

}
