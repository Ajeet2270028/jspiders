package arrays;

import java.util.Scanner;

class SumOddEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size");
		int n=sc.nextInt();
		System.out.println("Enter a value");
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int eSum=0,oSum=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				eSum=eSum+ar[i];
			else
				oSum=oSum+ar[i];
		}
		System.out.println("Sum of Even Element: "+eSum);
		System.out.println("Sum of odd Element: "+oSum);
	}
}
