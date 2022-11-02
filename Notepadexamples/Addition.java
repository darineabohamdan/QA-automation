class Addition{

public static void add(int a,int b){

int sum=a+b;

System.out.println("The sum of "+a+" and "+b+ " is "+sum);
}

public static void main(String[] args)
{

java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter the 1st number");
int a=sc.nextInt();
System.out.println("Enter 2nd Number");
int b=sc.nextInt();
add(a,b);
}
}
