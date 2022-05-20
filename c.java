class car{
void c(String name,float cost,double speed,float mileage,String color){
System.out.println("name="+name);
System.out.println("cost="+cost);
System.out.println("speed="+speed+" km/h");
System.out.println("mileage="+mileage+" km/l");
System.out.println("color="+color);}}
class p{
public static void main(String[]args){
car e=new car();
e.c("toyota",500000,120,56,"red");
System.out.println(" ");
car r=new car();
r.c("rolls royals",5000000,190,30,"blue");
}}