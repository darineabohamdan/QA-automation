
//121
//1331
//1234321

package com.JavaBasicPrograms;

public class Pallindromenumber {

	public static void main(String[] args) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter a number: ");
	int n=sc.nextInt();
	
	int org_n=n;
	int rev=0;
	while(n>0) {
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	
	if(org_n==rev) {
		
		System.out.println(org_n+"Palindrome Number");
	}
	else {
		System.out.println(org_n+" not Palindrome Number");
		
	}
	}

}
