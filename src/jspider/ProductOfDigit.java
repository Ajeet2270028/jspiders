package jspider;
import java.util.*;
class ProductOfDigit {
	static int productDigit(int n) {
		int product=1;
		do {
			int d=n%10;
			product=product*d;
			n=n/10;
		}while(n!=0);
		return product;
	}
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
		int res=productDigit(n);	
	
	System.out.println("Product of digit of number: "+res);
}
}
