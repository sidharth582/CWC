
import java.util.*;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		str=str.toUpperCase();
		String str2="";
		int c=0;
	for(int i=0;i<str.length();i++) {
	if(str.charAt(i)=='A'||str.charAt(i)=='G'||str.charAt(i)=='C'||str.charAt(i)=='T') {
			c=c+1;
		}
		}
	if(c==str.length()) {
	for(int i=0;i<str.length();i++) {
		 if (str.charAt(i)=='G')
		str2=str2+'C';
		else if(str.charAt(i)=='C')
		str2=str2+'G';
		else if(str.charAt(i)=='T')
		str2=str2+'A';	
		else if(str.charAt(i)=='A')
		str2=str2+'U';
		}
	System.out.println(str2);
		}
	else {
		System.out.println("INVALID INPUT");
	}
		
}
}
