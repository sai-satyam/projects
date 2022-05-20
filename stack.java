import java.util.*;
 class d {
	static int r1,i=0;
void n() 
	
	{	
	int r,op,w,l=-1,two=0;	
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter range of stack");	
	r=sc.nextInt();
	System.out.print("0 to push\n1 to pop\n2 display\n3 to exit\n");	
	System.out.println("enter your option ");
	op=sc.nextInt();	
	int a[] =new int[r];	
	while(op<3 )	{	
	if(op==0)		{	
	try			{		
	int e;		
	System.out.println("enter element ");
	e=sc.nextInt();		
	a[i]=e;		
	i=i+1;		
	l=l+1;		
	System.out.println("element is pushed into the stack");		
	}		
	catch(Exception e)		
	{		
	System.out.println("over flow");
	}			
	System.out.println("enter your option ");	
	op=sc.nextInt();	
	}			
	if(op==1)	
		{		
	try{			
	//	System.out.println(l);//	w=l;				
	a[l-two]=-1;two=two+1;
	//	l=l+1;	
	//	cn=cn+1;			
	i=i-1;			
	System.out.println("element is poped from the stack");	
	//	int m=0;		
	//	r1=r-m;	
	//	m=m+1;			
	}		
	catch(Exception e)	
	{			
System.out.println("underflow");	}				
	
	System.out.println("enter your option ");
	op=sc.nextInt();	
	}		
	if(op==2)		{	
	System.out.print("\nELEMENTS IN THE STACK ARE \n");		
	System.out.println("**************************");	
	for(int u=0;u<r;u++){		
	System.out.println(a[u]);			
	r1=r;				
	//System.out.println("**********************");		
	}		
	System.out.println("enter your option ");
	op=sc.nextInt();		
	}		}		 }		}	
class m
{
	public static void main(String[] args)
	{
		d s1=new d();
		s1.n();
		System.out.print("\n\n0 and -1 indicates that there is no element at that index in the stack");
		}}