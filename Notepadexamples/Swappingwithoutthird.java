class Swappingwithoutthird
{

public static void main(String[] args)
{

int a=100;
int b=200;

a=a+b; //a=300
b=a-b; //b=100
a=a-b; //a=200
System.out.println(a);
System.out.println(b);

}

}