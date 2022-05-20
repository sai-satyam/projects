class c{
	int a=80;
	int b=67;
	void t(){
	System.out.print("sum of a,b = "+(a+b)+"\n");}
}
class p extends c{
	int c=78;
	void d(){
	System.out.print("sum of a,b,c = "+(c+a+b));}
}
class n{
	public static void main(String[]args){
	p o =new p();
	c o1 =new c();
	System.out.println("this method is called by creating a reference to the super class");
	o1.t();
	System.out.println("this method is called by creating a reference to the sub class");
	o.t();
	System.out.print("a = "+o.a+"\nb = "+o.b+"\nc = "+o.c+"\n");
	o.d();
	}
}