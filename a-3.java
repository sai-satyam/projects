import java.util.Scanner;
abstract class a{
	String n;
	int v;
static double b=1500000;
String z;
	abstract void l();
	abstract void de();
	abstract void w();
	abstract void dis();
	}
	class p2 extends a{
		void l(){
		Scanner sc=new Scanner(System.in);Scanner scnr=new Scanner(System.in);
System.out.println("enter account holder name :");
n=scnr.next();
System.out.println("enter account  number :");
v=sc.nextInt();
System.out.println("enter account holder address :");
z=scnr.next(); }
void de(){ 
double e;
Scanner sc=new Scanner(System.in);
System.out.println("how much amount do you want to deposit :");
e=sc.nextDouble();b=e+b;System.out.println("deposit done");
System.out.println("balance afetr depositing "+e+" rupees is "+b);
}
void w(){
double q;
Scanner sc=new Scanner(System.in);
System.out.println("how much ammount do you want to withdraw");		
q=sc.nextDouble();		
if(q>30000){		
System.out.println("withdraw limit exceeded" );
}
else{			
b=b-q;	
System.out.println("withdraw done");	
System.out.println("balance afetr withdrawing "+q+" rupees is "+b);}		
}
void dis(){
	System.out.println("account holder name is :"+n);
//System.out.println("account holder name is : "+n); 
System.out.println("account number is : "+v);
//System.out.println("account number is : "+v);
System.out.println("account holder adderes  is : "+z);
System.out.println("total balance is : "+b);	
}
void in(){	
double y;	
y=(((1500000)*(30)*(0.033))/100);	
b=y+b;
System.out.println("balance after adding interest "+y+" rupees  is "+b);
}}
class p1{	
void over(){		
double az,xc,ty;		
Scanner sc=new Scanner(System.in);
System.out.println("enter how much extra ammount that you want to draw from your account (over draft ammount) :");		
az=sc.nextDouble();		
xc=(((az)*(30)*(0.02))/100);		
ty=az+xc;
System.out.println("you have to pay "+ty+" rupees extra to the bank as over draft ammount");
}}
class main{
public static void main(String[]args){
p2 o=new p2();	
p1 o2=new p1();	
o.l();	
int se;	
Scanner sc=new Scanner(System.in);	
System.out.print("enter 1 to withdraw \nenter 2 to deposit\nenter 3 to display interest details\nenter 4 to take over draft ammount\nenter 5 to display all details");	
System.out.println("choose your option");
se=sc.nextInt();	
while(se<5){	
if(se==1){	
o.w();
}	
else{		
if(se==2){	
o.de();
}	
else{		
if(se==3){	
o.in();
}	
else{		
if(se==4){	
o2.over();}
}}}
System.out.println("choose your option");
se=sc.nextInt();
}
o.dis();
}}	