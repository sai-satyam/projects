import java.util.Scanner;
class motor{
String name;
int no;
double price ;
void a(){
    Scanner sc=new Scanner(System.in);
Scanner scnr=new Scanner(System.in);
System.out.println("enter model name :");
name=scnr.next();
System.out.println("enter model number :");
no=sc.nextInt();
System.out.println("enter model price :");
price=sc.nextDouble(); }
void display1(){
System.out.println("name is : "+name);
 System.out.println("model number is : "+no);
System.out.println("price is : "+price);
	}}
class car extends motor{
	double discount_rate;
	void disc(){
	double di;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter discount in percentage");
	di=sc.nextDouble(); 
	discount_rate=price-((price*di)/100);}
void display(){
Scanner sc=new Scanner(System.in);
Scanner scnr=new Scanner(System.in);
System.out.println("for car details");
a();
//System.out.println("enter model discount rate :");
//discount_rate=sc.nextDouble();
disc();
System.out.println("printing car details");
display1();
System.out.println("discount_rate is : "+discount_rate);
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
		System.out.print("for  motor vechile details enter 1\nfor car details enter 2\n");
		g=sc.nextInt();
		if(g==1){
	motor m1=new motor();
	System.out.println("for motor vechile details");
	m1.a();
	System.out.println("printing motor vechile details");
	m1.display1();
		}	
	else{
	if(g==2){	
    car m=new car();
	m.display();}
	else{
		System.out.println("choose correct option");
	}}}}}
