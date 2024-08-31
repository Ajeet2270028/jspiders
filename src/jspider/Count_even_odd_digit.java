package jspider;
import java.util.Scanner;
class  Count_even_odd_digit  {
	
	static void countDigit(int n) {
		int ecount=0,ocount=0;
		do{
			int d=n%10;
			if(d%2==0)
				ecount++;
			else
				ocount++;
			n=n/10;
		}while(n!=0);
		
		System.out.println("No of even digit: "+ecount);
		System.out.println("No of odd digit:"+ocount);
	}
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	countDigit(n);
 }

}
