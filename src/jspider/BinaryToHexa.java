package jspider;

import java.util.Scanner;

class BinaryToHexa {
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
		System.out.println("Enter binary number");

		int n=sc.nextInt();
		int decimal= changeBinToDec(n);
		String rs= changeDecToHex(decimal);
		System.out.println("Binary no "+n+" convert to HexaDecimal "+rs);
	}
}

