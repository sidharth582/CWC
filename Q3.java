import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		long num=0;
		int big=0;
		for(int i=2;i<=1000000;i++) {
			int counter=1;
			long n=i;
			while(n!=1){
			counter++;
		    if(n%2==0)
			n=n/2;
			else
			n=3*n+1;
			}
			if(big<counter) {
				big=counter;
				num=i;
			}}
		System.out.println(num);	
	}
}
