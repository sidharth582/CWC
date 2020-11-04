
import java.util.*;
public class Q4 {

	public static int leap(int yyyy) {
		if((yyyy%4==0)&&(yyyy%100!=0)||(yyyy%400==0)) {
			return 1;
		}else {
			return 0;
	}}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a date");
		int  dd=sc.nextInt();
		String suffix=sc.next();
		String mm=sc.next();
		int yyyy=sc.nextInt();
		if(mm.equalsIgnoreCase("january")) {
			dd=dd;
		}else if(mm.equalsIgnoreCase("february")) {
			if(leap(yyyy)==1) {
				dd=dd+32;
			}
			else if(leap(yyyy)==0) {
				dd=dd+31;
			}	
		}else if(mm.equalsIgnoreCase("march")) {
			if(leap(yyyy)==1) {
				dd=dd+60;
			}
			else if(leap(yyyy)==0) {
				dd=dd+59;
				}
		}else if(mm.equalsIgnoreCase("april")) {
			if(leap(yyyy)==1) {
				dd=dd+91;
			}
			else if(leap(yyyy)==0) {
				dd=dd+90;
			}
		}else if(mm.equalsIgnoreCase("may")) {
			if(leap(yyyy)==1) {
				dd=dd+121;
			}
			else if(leap(yyyy)==0) {
				dd=dd+120;
			}
		}else if(mm.equalsIgnoreCase("june")) {
			if(leap(yyyy)==1) {
				dd=dd+152;
			}
			else if(leap(yyyy)==0) {
				dd=dd+151;
			}
		}else if(mm.equalsIgnoreCase("july")) {
			if(leap(yyyy)==1) {
				dd=dd+182;
			}
			else if(leap(yyyy)==0) {
				dd=dd+181;
			}
		}else if(mm.equalsIgnoreCase("august")) {
			if(leap(yyyy)==1) {
				dd=dd+213;
			}
			else if(leap(yyyy)==0) {
				dd=dd+212;
			}
		}else if(mm.equalsIgnoreCase("september")) {
			if(leap(yyyy)==1) {
				dd=dd+244;
			}
			else if(leap(yyyy)==0) {
				dd=dd+243;
			}
		}else if(mm.equalsIgnoreCase("october")) {
			if(leap(yyyy)==1) {
				dd=dd+274;
			}
			else if(leap(yyyy)==0) {
				dd=dd+273;
			}
		}	else if(mm.equalsIgnoreCase("november")) {
			if(leap(yyyy)==1) {
				dd=dd+305;
			}
			else if(leap(yyyy)==0) {
				dd=dd+304;
				}
		}else if(mm.equalsIgnoreCase("december")) {
			if(leap(yyyy)==1) {
				dd=dd+335;
			}
			else if(leap(yyyy)==0) {
				dd=dd+334;
		}}
		
		System.out.println("Day number"+dd);
		}
		
		
}
