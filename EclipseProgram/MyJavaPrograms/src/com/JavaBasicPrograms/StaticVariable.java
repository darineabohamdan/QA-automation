package com.JavaBasicPrograms;

public class StaticVariable {
	static String name;
	static int age;

	public static void main(String[] args) {
		StaticVariable.name="Darine";
		StaticVariable.age=25;
		System.out.println("Name=" +StaticVariable.name);//calling the name using the class staticVariable.
		System.out.println("Age="+StaticVariable.age);
	}

}
