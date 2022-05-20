import java.util.*;
	class main{
 static int count=0;
		 static int sum=0;
	public static void main(String []args)throws Exception{
		Scanner sc=new Scanner(System.in);
		int o;
		
		System.out.println("how many elements do you want to insert");
		o=sc.nextInt();
	if((o==6)){
			throw new Exception("check_Argument");}
				
	else{
			
		for(int y=0;y<o;y++){
		int r;
		System.out.println("enter elment ");
		r=sc.nextInt();	
		count=count+1;
		sum=sum+r;}
		System.out.println("the sum of above elements is "+sum);
			}
		}
	}