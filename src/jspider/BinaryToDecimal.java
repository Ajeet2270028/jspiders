package jspider;

import java.util.Scanner;

class BinaryToDecimal {
	static int changeBinToDec(int n) {
		int sum=0,p=1;
		do {
			int d=n%10;
			sum=sum+d*p;
			p=p*2;
			n=n/10;
		}while(n!=0);
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter binary number");

		int n=sc.nextInt();
		int rs= changeBinToDec(n);
		System.out.println("Binary no "+n+" convert to Decimal "+rs);
	
}
}
