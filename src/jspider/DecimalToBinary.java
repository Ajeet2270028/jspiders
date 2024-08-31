package jspider;
import java.util.*;
class DecimalToBinary {
	static String changeDecToBin(int n) {
		String bin="";
		do {
			int d=n%2;
			bin=d+bin;
			n=n/2;
		}while(n!=0);
    return bin;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal no");
		int n=sc.nextInt();
		String rs= changeDecToBin(n);
		System.out.println("Decimal no "+n+" convert to Binary "+rs);
	}
}
