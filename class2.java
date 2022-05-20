class car{
void c(String name,double cost,double speed,double mileage,String color){
String name=name;
double cost=cost;
double speed=speed;
double mileage=mileage;
String color=color;
System.out.println("name="+name);
System.out.println("cost="+cost);
System.out.println("speed="+speed+" km/h");
System.out.println("mileage="+mileage+" km/l");
System.out.println("color="+color);}}
class p{
public static void main(String[]args){
car e=new car();
e.c("toyota",500000,120,56,"red");
}}