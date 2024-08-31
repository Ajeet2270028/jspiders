package jspider;

import java.util.Scanner;
class DecimalToOctal {
	static String changeDecToOct(int n) {
		String oct="";
		do {
			int d=n%8;
			oct=d+oct;
			n=n/8;
		}while(n!=0);
    return oct;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal no");
		int n=sc.nextInt();
		String rs= changeDecToOct(n);
		System.out.println("Decimal no "+n+" convert to  Octal "+rs);
	}
}
