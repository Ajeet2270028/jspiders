package Recursion;

import java.util.Scanner;

public class FactorialNumber {
	static int fact(int n) {
		if(n==1|| n==0)
			return 1;
		return n*fact(n-1);
			
	}
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a nth Number:");
		int n=sc.nextInt();
		int rs=fact(n);
		System.out.println("Factorial of "+n+"! is "+rs);
}
}
