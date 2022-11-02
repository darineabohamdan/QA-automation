package com.JavaBasicPrograms;

public class Loop1 {

	public static void main(String[] args) {
		// while syntax
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		while(age>=18) {
			System.out.println("Eligible to vote...");
			age--;
		}

	}

}
