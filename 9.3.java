import java.util.*;
class d{
	void m () {
		int r1;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter range of array ");
		r1=sc.nextInt();
		int a[]={1,2,3,4,5};
		try{
			//System.out.println(0/0); // for Arithmetic Exception
			int i;
			String s=null; // for NullPointer Exception
			i=s.length;
			for(int y=0;y<r1;y++){
				System.out.println(a[y]); // for ArrayIndexOutOfBounds Exception
		}
		}
		catch(ArrayIndexOutOfBoundsException r){
			System.out.println("see  range of array  once");
		}
		catch(NullPointerException r2){
			System.out.println("enter string ");
		}
		catch(ArithmeticException r4){
			System.out.println(r4);
		}
		catch(Exception r5){
			System.out.println(r5);
		}	
		
	}
}
class main{
	public static void main(String[]args){
		d u=new d();
		u.m();
	}
}