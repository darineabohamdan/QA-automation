package com.JavaBasicPrograms;

public class Forloop5 {

	public static void main(String[] args) {
	 for(int i=1;i<=5;i++) { //row
		for(int j=5;j>i;j--) {
			System.out.print(" ");//space
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");//stars
		}
		System.out.println();
	}

	}

}
