
import java.util.*;
public class Q6 {
	public static void findprime(int pos) {
		int count=0,n=1,i;
		while(count<=pos) {
			n=n+1;
			for(i=2;i<=n;i++) {
				if(n%i==0) {
					break;
				}
			}if(i==n) {
				count++;
			}}
		System.out.println(n);	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pos=10001;
		findprime(pos);
	}
}
