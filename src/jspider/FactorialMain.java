package jspider;

import java.util.Scanner;

class FactorialMain {
	static int factorial(int n) {
		int fact=1;
		do {
			fact=fact*n;
			n--;
		}while(n!=0);
		return fact;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	int rs=factorial(n);
	System.out.println("Factorial is "+n+"= "+rs);
}
}
