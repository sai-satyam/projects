import java.util.Scanner;
class c{
c(){
System.out.print("constructor is called\n");
Scanner sc=new Scanner(System.in);
double a;
double b;
System.out.print("enter length in cm\n");
a= sc.nextInt();
System.out.print("enter breadth in cm\n");
b= sc.nextInt();
System.out.print("the area of the Quadrilateral  is = "+(a*b)+" cm");
}
public static void main(String[]args){
c o=new c();
}
}