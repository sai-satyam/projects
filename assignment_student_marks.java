import java.util.*;
class student {
	
	void g()throws Exception{
		try {
	Scanner scnr=new Scanner(System.in);
	Scanner sc=new Scanner(System.in);
	String n;
	int m1,m2,m3,m4,m5,m6;
	System.out.println("enter student name ");
	n=scnr.next();
	System.out.println("enter student marks in telugu");
	m1=sc.nextInt();
	System.out.println("enter student marks in hindi");
	m2=sc.nextInt();
	System.out.println("enter student marks in english");
	m3=sc.nextInt();
	System.out.println("enter student marks in biology");
	m4=sc.nextInt();
	System.out.println("enter student marks in social");
	m5=sc.nextInt();
	System.out.println("enter student marks in zoology");
	m6=sc.nextInt();
	if((m1>50)||(m2>50)||(m3>50)||(m4>50)||(m5>50)||(m6>50)){
		throw new Exception("range_Exception");}
	else{
		int h=(m1+m2+m3+m4+m5+m6);
		System.out.println("total marks of the student is "+h);
		double x;
		x=(h*100)/300;
		System.out.println("student percentage is  "+x);}
}
catch(Exception e){
	System.out.println("ERROR  WAS OCCURED");
}}}
class main{
public static void main(String []args)throws Exception{
	try{
	int sa;
student s =new student();
Scanner sc=new Scanner(System.in);
System.out.println("how many student's marks do you want to enter");
sa=sc.nextInt();
System.out.println("=================================");
for(int v=0;v<sa;v++){
s.g();		
System.out.println("=================================");}}
catch(Exception e){
	System.out.println("ERROR  WAS OCCURED");
}
}}