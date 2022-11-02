class Methodoverload{


public static int addition(int a,int b){
return a+b;

}


public static double addition(double d1,double d2){
return d1+d2;
}

public static void main(String[] args){

System.out.println("Intvalue="+addition(45,67));
System.out.println("Intvalue="+addition(45.5,67.6));
}
}
