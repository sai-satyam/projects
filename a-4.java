import java.util.*;
class string_reversion{
	void string_reversion(){
		Scanner scnr=new Scanner(System.in);
		String e;
		System.out.println("enter a string ");
e=scnr.next();
int r,u;
u=e.length()-1;
System.out.println("reverse order of the string ");
for(int i=0;i<e.length();i++){
	char re=e.charAt(u-i);
	String dummy="_";
	char zx=dummy.charAt(0);
	String du=" ";
	char xz=du.charAt(0);
if(re==zx){
	re=xz;
	System.out.print(re);}
else{
		System.out.print(e.charAt(u-i));

	}
}}}
class main {
public static void main(String[] args) {
	string_reversion s=new string_reversion();
	s.string_reversion();
}}