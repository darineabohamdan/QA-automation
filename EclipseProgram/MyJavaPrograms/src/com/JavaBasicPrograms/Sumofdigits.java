package com.JavaBasicPrograms;

public class Sumofdigits {

	public static void main(String[] args) {
		
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=n;
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum+r;
			n=n/10;
			
		}
		System.out.println("The sum of digits of "+a+" is "+sum);
		
	}

}
