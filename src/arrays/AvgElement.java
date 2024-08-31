package arrays;

import java.util.Scanner;

class AvgElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size");
		int n=sc.nextInt();
		System.out.println("Enter a value");
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		double avg=sum/ar.length;
		System.out.println("Average of Element:"+avg);
	}
}
