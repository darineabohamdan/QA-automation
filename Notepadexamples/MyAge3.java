class MyAge3{
public static void age(double age){
System.out.println("My age is "+age);
}
public static void Employee(String name,int sal)
{
System.out.println("Name-" +name+ "Salary-"+sal);
}
public static void main(String[] args)
{
age(29);
age(32);
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter the name");
String n=sc.next();
System.out.println("Enter Salary");
int s=sc.nextInt();
Employee(n,s);
}
}
