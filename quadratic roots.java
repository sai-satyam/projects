import java.util.Scanner;
class root{
public static void main(String[]args){
double a,b,c,e,f,g,h,i,j;
double d;
Scanner sc=new Scanner(System.in);
System.out.println("a*X^2+b*X+c");
System.out.println("now enter a,b,c values");
System.out.println("enter co-efficent of X^2");
a=sc.nextFloat();
System.out.println("enter co-efficent of X^1`");
b=sc.nextFloat();
System.out.println("enter co-efficent of X^0");
c=sc.nextFloat();
f=Math.pow(b,2);
e=f-(4*(a)*(c));
d=Math.pow(e,0.5);
if(d>0){
System.out.println(d);
System.out.println("the roots of the equation are real and different");
g=-((b+d)/(2*a));
h=(d-b)/(2*a);
System.out.println(g+" is the 1st root");
System.out.println(h+" is the 2nd root");}
if(e<0){
System.out.println("the roots of the equation are complex");
System.out.println("-b+(i)^0.5");
System.out.println("-b-(i)^0.5");
System.out.println("where ");
System.out.println("b="+b);
System.out.println("i="+e);}
if(d==0){
System.out.println(d);
System.out.println("the roots of the equation are real and equal");
g=-((b+d)/(2*a));
h=(d-b)/(2*a);
System.out.println(g+" is the 1st root");
System.out.println(h+" is the 2nd root");}
System.out.println("over");}}