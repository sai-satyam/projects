class car{
void c(String name,double cost,double speed,double mileage,String color){
System.out.println("name="+name);
System.out.println("cost="+cost);
System.out.println("speed="+speed+" km/h");
System.out.println("mileage="+mileage+" km/l");
System.out.println("color="+color);
System.out.println("");}}
class p{
public static void main(String[]args){
car e=new car();
e.c("toyota",500000,120,56,"red");
e.c("maruthi",300000,100,36,"blue");
e.c("rolls royals",5000000,220,26,"green");
}}