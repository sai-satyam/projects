class c{
c(int a){
System.out.println("constructor overloading");
System.out.println(a);
}
c(float a){
System.out.println("constructor overloading");
System.out.println(a);
}
c(double a){
System.out.println("constructor overloading");
System.out.println(a);
}
int method(int a,int b){
System.out.println("method overloading");
System.out.println(a);
System.out.println(b);
return 0;
}
int method(double a,double b){
System.out.println("method overloading");
System.out.println(a);
System.out.println(b);
return 0;
}
int method(char a,char b){
System.out.println("method overloading");
System.out.println(a);
System.out.println(b);
return 0;
}
public static void main(String[]args){
c o=new c(1);
o.method(1,2);
o.method(327834.87,4354.998);
o.method('a','b');
}
}