class conditional2
{

public static void main(String[] args)
{

java.util.Scanner sc = new java.util.Scanner(System.in);
System.out.println("Enter 1st number");
int a = sc.nextInt();
System.out.println("Enter 2nd number");
int b =sc.nextInt();


if(a>b){
System.out.println("a is bigger than b");
}


else if (a<b){
System.out.println("a is smaller than b");
}


else{
System.out.println("a is equal to  b");
}


}}