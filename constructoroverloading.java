class c{
c(int a){
System.out.println("constructor overloading");
System.out.println("printing int");
System.out.println(a);
}
c(double a){
System.out.println("constructor overloading");
System.out.println("printing double");
System.out.println(a);
}
c(char a){
System.out.println("constructor overloading");
System.out.println("printing char");
System.out.println(a);
}
public static void main(String[]args){
c o=new c(3.89);
c o1=new c(90);
c o2=new c('a');
}
}