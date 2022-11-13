
    //145
    //1!=1
	//4!=24
	//5!=120
	//1+4+120=145
		
package com.JavaBasicPrograms;

public class Strongnumber {

	public static void main(String[] args) {
		
		
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=n;
        int sum=0;
       
        while(n>0) {
        	int r=n%10;
        	sum=sum+fact(r);
        	n=n/10;
	
}
        if(a==sum) {
        	System.out.println(a+" is strong number.");
        }
        else {
        	System.out.println(a+" is not strong number.");
        }

}

	
	
	
	public static int fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			
			f=f*i;
		}
		return f;
		
		
		
	}
}