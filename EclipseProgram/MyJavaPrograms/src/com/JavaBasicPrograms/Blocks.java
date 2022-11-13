package com.JavaBasicPrograms;

public class Blocks {
 static int a;
 int b;
 
 public Blocks() {
	System.out.println("This is the default constructor");
}
	
	static{
		a=222;
		//writing code inside curly braces is called Blocks in java.
		System.out.println("using keyword static so this is a static block,a="+a);
		}
	

	static{
		a=29;
		System.out.println("using keyword static so this is a static block,a="+a);
		}

	static{
		a=33;
		System.out.println("using keyword static so this is a static block,a="+a);
		}
	
	      {
		
		System.out.println("witout static key so this is a non static block1");
	      }
	      
	      {
	  		b=262;
	  		System.out.println("witout static key so this is a non static block2");
	  	      }
	      
	      
	      
	public static void main(String[] args) {
		Blocks b=new Blocks();//try to comment this line and run
		//bs n5la2 object dghreee btetnfz l non static block w byrj3 li bel default constructor
		Blocks b1=new Blocks();//note now we shoud have a default block 
		System.out.println(b.b);
		System.out.println("Hi");
		System.out.println("bye");
	}

}
