package Recursion;

import java.util.Scanner;

public class PrintNTo1 {
	static void getNumber(int n) {
		if(n==0)
			return;
		System.out.print(n+" ");
		getNumber(n-1);
	}
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter a nth Number:");
	int n=sc.nextInt();
	getNumber(n);
	
}
}
