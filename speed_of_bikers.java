import java.util.Scanner;
class speed{
public static void main(String[]args){
double a,b,c,d,e,f;
Scanner sc=new Scanner(System.in);
System.out.println("enter the speed of 1st biker");
a=sc.nextDouble();
System.out.println("enter the speed of 2nd biker");
b=sc.nextDouble();
System.out.println("enter the speed of 3rd biker");
c=sc.nextDouble();
System.out.println("enter the speed of 4th biker");
d=sc.nextDouble();
System.out.println("enter the speed of 5th biker");
e=sc.nextDouble();
f=((a+b+c+d+e)/5);
if(f<a){
    System.out.println("1st biker is the winner");}
else{
    System.out.println("");}
if(f<b){
    System.out.println("2nd biker is the winner");}
else{
    System.out.println("");}
if(f<c){
    System.out.println("3rd biker is the winner");}
else{
    System.out.println("");}
if(f<d){
    System.out.println("4th biker is the winner");}
else{
    System.out.println("");}
if(f<e){
    System.out.println("5th biker is the winner");}
else{
    System.out.println("");}
}}
