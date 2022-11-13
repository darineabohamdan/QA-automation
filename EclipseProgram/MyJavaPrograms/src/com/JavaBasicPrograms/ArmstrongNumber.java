
		//153:
		//1x1x1=1
		///5x5x5=124
		///3x3x3=27
		///1+124+27=153 so armstrong
		
package com.JavaBasicPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=n;
		int cube=1;
		int sum=0;
		while(n>0) {
			int r=n%10;
			cube=r*r*r;
			sum=sum+cube;
			n=n/10;
			
				}
		if(a==sum) {
			System.out.println(a+" is amstrong");
		}
		else {
			System.out.println(a+" is not  amstrong");
		}
		
	}

}

