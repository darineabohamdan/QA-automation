class uniaryOperator4
{

public static void main(String[] args)
{

int x=1;
int y=1;

x=--x - y--;
y=x-- - --y;
System.out.println("x="+x); //x=-2


System.out.println("y="+ y); //y=0


}

}