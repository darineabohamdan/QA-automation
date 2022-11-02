package com.JavaBasicPrograms;

public class Loop2 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		do {
			System.out.println("Eligible to vote...");
		}
		while(age>18) ;

	}

}
