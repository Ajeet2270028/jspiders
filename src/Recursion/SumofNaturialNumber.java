package Recursion;

import java.util.Scanner;

public class SumofNaturialNumber {
	static int sum(int n) {
		if(n==0)
			return 0;
		return n+sum(n-1);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter a nth Number:");
	int n=sc.nextInt();
	int rs=sum(n);
	System.out.println("Sum of 1 to "+n+" is "+rs);
}
}
