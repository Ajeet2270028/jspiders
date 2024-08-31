package arrays;

import java.util.Scanner;

class SmallElement {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size");
		int n=sc.nextInt();
		System.out.println("Enter a value");
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int small=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(small>ar[i])
				small=ar[i];
		}
		System.out.println("Small element in array:"+small);
	}
}
