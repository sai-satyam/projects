/*Write a JAVA program for creation of Illustrating throw
b). Write a JAVA program for creation of Illustrating finally
c). Write a JAVA program for creation of Java Built-in Exceptions
d).Write a JAVA program for creation of User Defined Exception*/
class d{
	void m () throws Exception {
		int a[]={1,2,3,4,5};
		try{
			for(int y=0;y<6;y++){
				System.out.println(a[y]);
		}}
		catch(ArrayIndexOutOfBoundsException r){
			throw new Exception ("see array range once");
		}
		
	}
}
class main{
	public static void main(String[]args)throws Exception{
		d u=new d();
		u.m();
	}
}