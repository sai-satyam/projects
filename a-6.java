import java.util.Scanner;
class s{
	static int y1=0;
	static int a[];
	static int e;
	static int r1;
	static int r;
	static int i=0;
	static int count=0;
	void stack(){
		Scanner sc=new Scanner(System.in);
		//int r;
		System.out.println("enter range of stack");
		r=sc.nextInt();
		r1=r;
		int a[] =new int[r];
		e=a.length;
		int q;
		System.out.print("enter 0 to push\nenter 1 to pop\nenter 2 to display the elements\nenter 3 to exit\n");
		System.out.println("enter your choice");
		q=sc.nextInt();
		while(q<3){
			if(q==0){
				/*System.out.println("length "+e);				
				if(e > r){
					System.out.println("over flow");
				}
				//for(int y=0;y<(1);y++){
					else{*/
				try{	
				int o;
				System.out.println("enter element");
				o=sc.nextInt();
		a[y1]=o;
		System.out.println("element is pushed in to the stack");
				y1=y1+1;
				count=count+1;}
				catch(Exception l){
					System.out.println("over flow");
				}
		//}
			/*for(int y=0;y<r;y++){
				System.out.println(a[y]);}*/
			System.out.println("enter your choice");
			q=sc.nextInt();}
		if(q==1){
			count=count-1;
			if(count==-1){
				System.out.println("UNDER FLOW");
			}
			else{
			i=i+1;
			r1=r-i;
		/*for(int y=0;y<(r1);y++){
		System.out.println(a[y]);}	*/
		System.out.println("element is poped from the the stack");
			}
		System.out.println("enter your choice");
		q=sc.nextInt();
		}
		if(q==2){
			System.out.println("ELEMENTS IN THE STACK ARE ");
		for(int y=0;y<(r1);y++){
		System.out.println(a[y]);}
		//System.out.println("element is poped from the the stack");
		//i=i+1;
		System.out.println("enter your choice");
		q=sc.nextInt();}
		}
		}}

class main{
	public static void main(String[] args){
		s s1=new s();
		s1.stack();
	}}