import java.util.*;
class string_count{
	void string_count(){
		int count=0;
		int count1=1;
		Scanner scnr=new Scanner(System.in);
		String e;
		System.out.println("enter a string ");
		e=scnr.next();
		int len=e.length();
		int r,u;
		u=e.length()-1;
		System.out.println("the count of words in the string is  ");
		for(int i=0;i<e.length();i++){
			char re=e.charAt(u-i);
			String dummy="_";
			char zx=dummy.charAt(0);
			String du=" ";
			char xz=du.charAt(0);
			if(re==zx){
			count1=count1+1;
			re=xz;}
			else{
	//count=count+1;
		}}
	System.out.println(count1);
System.out.println("the count of letters in the string is  ");
		for(int i=0;i<e.length();i++){
			char re=e.charAt(u-i);
			String dummy="_";
			char zx=dummy.charAt(0);
			String du=" ";
			char xz=du.charAt(0);
			if(re==zx){
			//count1=count1+1;
			//re=xz;
			}
			else{
	count=count+1;
		}}
	System.out.println(count);
	System.out.println("the total characters in the string is "+len+" (including _)");
}}

	class main{
		public static void main (String[]args){
			string_count h=new string_count();
			h.string_count();
		}
	}