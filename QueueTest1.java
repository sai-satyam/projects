interface Queue{
abstract void add(int);
abstract void remove();
abstract void isempty();
}
public class Queue1 implements Queue{
int i=0;
if a[]=new int[4];
public void add(int data){
int i=0;
if(i<4 && a[i]==none){
a[i]=data;
i=i+1;
System.out.println("Data Inserted ",data);
}
else{
System.out.println("Inserted in New Queue",data);
}
}
public void remove(){
int i=0;
if (i<=3 && a[i]!="none"){
System.out.println("Removed Data ",a[i]);
a[i]="none";
i=i+1;
}
else{
System.out.println("Queue is Empty");
}
}
public void IsEmpty{
for(int i=0;i<4;i++){
}
System.out.printl("Queue is not empty");
}
public class QueueTest1{
public static void main(String[] args){
Queue1 q=new Queue1();
q.add(5);
q.add(7);
q.add(4);
q.add(9);
q.remove();
q.remove();
q.IsEmpty();
}
}