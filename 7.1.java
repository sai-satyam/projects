import java.util.*;
 class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r,a1,q;
System.out.println("enter a and b values to divide a with b");
	r=sc.nextDouble();	
		q=sc.nextDouble();
		try{
		

			a1=(r/q);
			System.out.println("answer = "+a1);
		
	
		}
	//	catch(ArithmeticException e){
		//	System.out.println(e);}
		
			catch(RuntimeException e){
			System.out.println("0 can not divide any number");}
	
			System.out.println("over");	
	}
}