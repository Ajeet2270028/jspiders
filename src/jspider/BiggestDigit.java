package jspider;
import java.util.*;
class BiggestDigit {
	static int biggerDigit(int n) {
		int big=-9;
		do {
			int d=n%10;
			if(d>big)
				big=d;
			n=n/10;
		}while(n!=0);
		return big;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int res=biggerDigit(n);
	System.out.println("Biggest no:"+res);
	
}
}
