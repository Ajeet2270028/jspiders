package jspider;

import java.util.Scanner;
class DecimalToHexadecimal {
	static String changeDecToHex(int n) {
		String hex="";
		do {
			int d=n%16;
			if(d<10)
				hex=d+hex;
			else
				hex=(char)(d+55)+hex;
			n=n/16;
		}while(n!=0);
    return hex;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal no");
		int n=sc.nextInt();
		String rs= changeDecToHex(n);
		System.out.println("Decimal no "+n+" convert to HexaDecimal "+rs);
	}
}
