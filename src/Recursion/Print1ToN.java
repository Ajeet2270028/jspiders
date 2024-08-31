package Recursion;

import java.util.Scanner;

class Print1ToN {
	static void getNumber(int n) {
		if(n==0)
			return;
		getNumber(n-1);
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a nth Number:");
		int n=sc.nextInt();
		getNumber(n);
	}
}
