package jspider;

import java.util.Scanner;

class DiffereceBig_small {
	static int bigDigit(int x) {
		int big=-9;
		do {
			int d=x%10;
			if(d>big)
				big=d;
			x=x/10;
		}while(x!=0);
		return big;
		
	}
	static int smallDigit(int x) {
		int small=9;
		do {
			int d=x%10;
			if(d<small)
				small=d;
			x=x/10;
		}while(x!=0);
		return small;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int rs=bigDigit(n);
		int rs1=smallDigit(n);
		System.out.println("difference between big and small: "+(rs-rs1));
	}
	
}
