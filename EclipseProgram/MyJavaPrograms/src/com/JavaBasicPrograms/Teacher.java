package com.JavaBasicPrograms;
//parents child relationship.Prinicipal is parent and teacher is child
public class Teacher extends Principal {
	
	public void Subject() {
		System.out.println("He is the eacher and he tought Math");
	}

	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.Head();
	}
}
