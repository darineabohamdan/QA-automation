package com.JavaBasicPrograms;

public class MultipleObject {

	
	String name;
	int age;
	public static void main(String[] args) {
		
		MultipleObject m= new MultipleObject();
		m.name="Darine";
		m.age=25;
		

		MultipleObject m1= new MultipleObject();
		m1.name="Hind";
		m1.age=45;
		
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m1.name);
		System.out.println(m1.age);
		
		

	}

}
