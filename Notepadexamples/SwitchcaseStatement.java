class SwitchcaseStatement
{

public static void main(String[] args)
{

java.util.Scanner sc = new java.util.Scanner(System.in);
System.out.println("Enter 1st number");
int a = sc.nextInt();

      switch(a){
            case 1:
            case 11:
            case 12:
                  System.out.println("Winter Season");
                  break;
             case 4:
             case 5:
             case 6:
                   System.out.println("Summer season");
                   break;
             case 7:
             case 8:
             case 9:
                   System.out.println("Rainy season");
                   break;
             default:
                   System.out.println("Invalid input");

}


}

}