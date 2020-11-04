
import java.util.Random;
import java.util.Scanner;
public class Q2 {
	public static char game() {
		  System.out.println("computers choice");
		  String chars="RPS";
		  Random r=new Random();
		  char ch=chars.charAt(r.nextInt(chars.length()));
		  System.out.println(ch);
		  return ch;
	}
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int c=0,u=0;
	  for(int i=0;i<3;i++) {
		  System.out.println((i+1)+" round -----");
		  System.out.println("enter user's choice");
		  char user=sc.next().charAt(0);
		  char computer=game();	 
 if(((user=='R'&&computer=='S')||(user=='S'&&computer=='P')||(user=='P'&&computer=='R'))||((user=='r'&&computer=='S')||(user=='s'&&computer=='P')||(user=='p'&&computer=='R'))) {
			  System.out.println("USER WON");
		      u++;
		}
else if(((computer=='R'&&user=='S')||(computer=='S'&&user=='P')||(computer=='P'&&user=='R'))||((computer=='R'&&user=='s')||(computer=='S'&&user=='p')||(computer=='P'&&user=='r'))) {
			System.out.println("COMPUTER WON");
			c++;
		}
	else {
		System.out.println("GAME TIE");
		}
	  } 	 if(u>c) {
		  System.out.println("3 rounds over user scored "+u+" user won");
	  }
	  else if(c>u) {
		  System.out.println("3 rounds over computer scored "+c+" computer won");
	  }
	  else {
		  System.out.println("3 rounds over its a tie");
	  }
}}
