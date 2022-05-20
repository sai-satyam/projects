import java.util.*;
class d{
	void m () throws Exception {
		int r1;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter range of array ");
		r1=sc.nextInt();
		int a[]={1,2,3,4,5};
		try{
			for(int y=0;y<r1;y++){
				System.out.println(a[y]);
		}}
		catch(ArrayIndexOutOfBoundsException r){
			System.out.println("see  range of array  once");
		}
		finally{
			
		throw new Exception ("CHECK ARRAY RANGE");
		}
		
		
	}
}
class main{
	public static void main(String[]args)throws Exception{
		d u=new d();
		u.m();
	}
}