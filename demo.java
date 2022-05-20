import java.util.Scanner;
class main{
	public static void main(String[] args){
			int a[]=new int[4];
			//String myArray[] = new String[size];
			/*a[0]=4;
			a[3]=5;
			a[1]=4;
			a[2]=5;*/
			for(int y=0;y<4;y++){
				int o;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter element");
				o=sc.nextInt();
				a[y]=o;
				}
				
			/*for(int y=0;y<4;y++){
				System.out.println(a[y]);}
				int o1;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter index to pop");
				o1=sc.nextInt();
				for(int y=0;y<3;y++){
				System.out.println(a[y]);} 		*/
System.out.println(a.length);				
			}
}