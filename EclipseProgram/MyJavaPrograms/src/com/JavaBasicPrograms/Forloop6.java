package com.JavaBasicPrograms;

public class Forloop6 {

	public static void main(String[] args) {
		int a=1;
	 for(int i=1;i<=5;i++) { //row
		for(int j=5;j>i;j--) {
			System.out.print(" ");//space
		}
		for(int k=1;k<=a;k++) {
			System.out.print("*");//stars
		}
		a=a+2;
		System.out.println();
	}

	}

}
