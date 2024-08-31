package arrays;

import java.util.Scanner;

public class SumOfDigitReplace {
	static int[] replaceSumOfDigit(int []ar) {
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sumOfDigit(ar[i]);
		}
		return ar;
	}
	static int sumOfDigit(int n) {
		int sum=0;
		do {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}while(n!=0);
		return sum;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a size of array");
	int n=sc.nextInt();
	System.out.println("Enter the value of array");
	int ar[]=new int[n];
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();
	}
	int []rs=replaceSumOfDigit(ar);
	for (int i = 0; i < rs.length; i++) {
		System.out.println(rs[i]);
	}
}
}
