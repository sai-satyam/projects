class c{
int method(int a,int b){
System.out.println("method overloading");
System.out.println("printing int values");
System.out.println(a);
System.out.println(b);
return 0;
}
int method(double a,double b){
System.out.println("method overloading");
System.out.println("printing double values");
System.out.println(a);
System.out.println(b);
return 0;
}
int method(char a,char b){
System.out.println("method overloading");
System.out.println("printing char values");
System.out.println(a);
System.out.println(b);
return 0;
}
public static void main(String[]args){
c o=new c();
o.method(1,2);
o.method(327834.87,4354.998);
o.method('a','b');
}
}