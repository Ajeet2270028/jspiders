package jspider;
import java.util.Scanner;
class SmallDigit {
	static int smallDigit(int n) {
		int small=9;
		do {
			int d=n%10;
			if(d<small)
				small=d;
			n=n/10;
		}while(n!=0);
		return small;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int res=smallDigit(n);
	System.out.println("Smallest no:"+res);
	
}
}