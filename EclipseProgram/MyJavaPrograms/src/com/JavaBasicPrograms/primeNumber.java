package com.JavaBasicPrograms;

public class primeNumber {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();//15
		int a=1;
		if(n<=1) {System.out.println(n+ "is less than 2");}//because smallest prime number is 2
		else {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				a=0;
				break;
			}
			else {
				
			}
		} //end of the loop
		if(a==1) {
		System.out.println(n+ " is a prime number");
	}
		else {
			System.out.println(n+ "is not a prime number");
		
		}
		}
	}}

