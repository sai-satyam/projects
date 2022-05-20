/*Write a JAVA program for creation of Illustrating throw
b). Write a JAVA program for creation of Illustrating finally
c). Write a JAVA program for creation of Java Built-in Exceptions
d).Write a JAVA program for creation of User Defined Exception*/
import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		try{
			//int a[]={1,2};
			int t;
	//System.out.println(a[41]);
	//	double r,a1,q;
//	System.out.println("enter a and b values to divide a with b");
//	r=sc.nextDouble();	
	//	q=sc.nextDouble();
			//a1=(r/q);
		//	System.out.println("answer = "+a1);
		
		String s=null; 
		t=s.length();
		}
		catch(ArithmeticException e){
			System.out.println(e);}
			catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);}
			catch(RuntimeException e){
			System.out.println(e);}
		//	catch(StringIndexOutOfBoundsException e){
			//System.out.println(e);}
			
		//	System.out.println(1/0);	
			System.out.println("over");	
	}
}
