package Recursion;

import java.util.Scanner;

public class ProductOfDigitOfNumber {
	static int product(int n) {
		if(n>-9&&n<9)
			return n;
		return n%10*product(n/10);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter a nth Number:");
	int n=sc.nextInt();
	int rs=product(n);
	System.out.println("Product of digit of "+n+" is "+rs);
}
}
