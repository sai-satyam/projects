import java.util.Scanner;
abstract class account{
String name;
int no;
double balance=1000000;
String a;
void w(){
	double c,r;
	Scanner sc=new Scanner(System.in);
	Scanner scnr=new Scanner(System.in);
	System.out.print("\tWITHDRAWING  MONEY\n");
	System.out.println("HOW MUCH AMMOUNT DO YOU WANT TO WITHDRAW");
	c=sc.nextDouble();
	r=balance-c;
System.out.println("REMAING BALANCE is "+r);}}
class s extends account{
}
class main{
public static void main(String[]args){
	s m1=new s();
	//System.out.println("for motor vechile details");
	m1.w();
	/*System.out.println("printing motor vechile details");
	m1.display1();
	car m=new car();
	m.display();*/
}}