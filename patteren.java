import java.util.Scanner;
class p{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a,r;
System.out.println("enter that how many rows that you want to print");
a=sc.nextInt();
for(r=0;r<a;r++){
if(r%2==0){
System.out.println("* * * *");}
else{
System.out.println(" * * * *");}
}}}