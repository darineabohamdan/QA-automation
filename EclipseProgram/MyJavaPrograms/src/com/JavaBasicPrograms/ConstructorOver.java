package com.JavaBasicPrograms;

public class ConstructorOver {
	//Constructor overloading means that we have created multiple constructors in one class with different parameters.
	 ConstructorOver() {
		System.out.println("This is the default constructor");
	}
	ConstructorOver(int i){
		System.out.println("Constructor with int params i="+i);
	}
	ConstructorOver(String s,int a){
		System.out.println("Name:"+s +",Age:"+a);}
	

	public static void main(String[] args) {
		ConstructorOver c=new ConstructorOver();
		ConstructorOver c1=new ConstructorOver(32);
		ConstructorOver c2=new ConstructorOver("Darine",25);

	}

}
