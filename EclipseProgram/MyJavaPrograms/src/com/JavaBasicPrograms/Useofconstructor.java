package com.JavaBasicPrograms;

public class Useofconstructor {
	//non static variables
	String name;
	int age;
	double sal;;
	String Gender;
	
	//use of constructor to initialize these non static variables
	//m a s g are local variables.
	public Useofconstructor(String n,int a,double s,String g) {
		this.name=name;//darine that will be assigned to string n will be asssigned to name li faw2 line 5.
		       //Note that name li 3l yamin is value w li 3l shmel is the non static variable.
		
		this.age=age;
		
		this.sal=sal;
		this.Gender=Gender;
		//this keyword used to refer non static variable of current object or current class.
	}

	public void display() {
		System.out.println("Name is:"+name+ "," +" Age is:"+age+","+" sal is:"+sal+","+" Gender is:"+Gender);
		
	}
	
	
	public static void main(String[] args) {
		Useofconstructor u =new Useofconstructor("Darine", 25, 200.5, "F");
        u.display();//to execute display method
        
        Useofconstructor u1 =new Useofconstructor("hend", 45, 2030.5, "F");
        u1.display();//to execute display method
        
	}

}
