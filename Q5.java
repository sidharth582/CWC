

public class Q5 {

	public static int pallindrome(int p) {
		int x=0;
		while(p!=0) {
			int dig=p%10;
			x=x*10+dig;
			p=p/10;
		}
		return x;
	}
	public static void main(String[] args) {
		int n=0;
		int max=0;
		for(int i=999;i>=100;i--) {
	      	for(int j=i;j>=100;j--) {
				n=i*j;
				if(n<max)
				break;
				if(n==pallindrome(n)&&n>max)
					max=n;
			}	
		}System.out.println(max);
	}

}
