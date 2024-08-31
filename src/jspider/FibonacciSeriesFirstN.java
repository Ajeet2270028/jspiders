package jspider;

import java.util.Scanner;

class FibonacciSeriesFirstN {
	static void getFibonacci(int x) {
		int f1=0,f2=1;
		System.out.println("Fibonacci Series first "+x+" is ");
		while(x>0) {
			System.out.print(f1+" ");
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			x--;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();

		getFibonacci(n);
      sc.close();
	}
}
