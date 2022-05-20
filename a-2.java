import java.util.Scanner;
class employee{
String name;
int age;
String addres;
String gender;
void f(){
Scanner sc=new Scanner(System.in);
Scanner scnr=new Scanner(System.in);
System.out.println("employee name is :");
name=scnr.next();
System.out.println("employee age is :");
age=sc.nextInt();
System.out.println("employee adderes is :");
addres=scnr.next();
System.out.println("employee gender is :");
gender=scnr.next();}
void display1(){
System.out.println("name is : "+name);
 System.out.println("employee age is : "+age);
 System.out.println("employee address is : "+addres);
  System.out.println("employee gender is : "+gender);
	}}
class fulltime extends employee{
double salary;
String designation;
void display(){
Scanner sc=new Scanner(System.in);
Scanner scnr=new Scanner(System.in);
System.out.println("for fulltime employee details");
f();
System.out.println("employee designation is :");
designation=scnr.next();
System.out.println("employee salary is :");
salary=sc.nextDouble();
System.out.println("printing fulltime employee details");
  display1();
    System.out.println("employee designation is : "+designation);
  System.out.println("employee salary is : "+salary);
	}}
class parttime extends fulltime{
	String rating;
	void a(){
		double y,z;
		double working_hours;
	Scanner sc=new Scanner(System.in);
System.out.println("enter amount payable to an employee for 1 hour");
y=sc.nextDouble();
System.out.println("employee working_hours is :");
working_hours=sc.nextDouble();
		z=y*working_hours;
		System.out.println("employee worked for "+working_hours+" hours");
	System.out.println("amount payable to an parttime employee for "+working_hours+" hours is "+z+"per a day");}
	void display2(){
		System.out.println("");
		System.out.println("for parttime employee details");
Scanner sc=new Scanner(System.in);
Scanner scnr=new Scanner(System.in);
f();
a();
System.out.println("employee rating is :");
rating=scnr.next();
System.out.println("");
System.out.println("printing patrtime employee details");
  display1();
   System.out.println("employee rating is :"+rating);
   }}
class main{
public static void main(String[]args){
	int u;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter that how many objects do you create:");
	u=sc.nextInt();
	for(int  y=0;y<u;y++){
		int g;
		Scanner scnr=new Scanner(System.in);
		System.out.print("what kind of employee does he is \n\tfull time employee\n\t     or\n\tpart time employee\nif he is a full time employee entre 1\nif he is a part time employee enter 2\n");
		System.out.println("enter employee type");
		g=sc.nextInt();
	if(g==1){
	/*employee m1=new employee(); System.out.println("for employee  details");
	m1.f(); System.out.println("printing employee details"); m1.display1();*/
	fulltime m=new fulltime();	
	m.display();}
	else
	{if(g==2){
	parttime m2=new parttime();
	m2.display2();}
	else{
	System.out.println("\t\nERROR\t\nenter correct employee type");
	}}}}}
