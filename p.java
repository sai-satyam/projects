class car{
void c(){
String name="toyota";
double cost=500000;
double speed=130;
double mileage=56;
String color="green";
System.out.println("name="+name);
System.out.println("cost="+cost);
System.out.println("speed="+speed+" km/h");
System.out.println("mileage="+mileage+" km/l");
System.out.println("color="+color);
int method(double a,double b){
System.out.println("method overloading");
System.out.println(a);
System.out.println(b);
return 0;}
}}
class p{
public static void main(String[]args){
car e=new car();
e.c();
}}