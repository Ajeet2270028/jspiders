package arrays;

import java.util.Scanner;

class SumOfEvenOdd {
	static int[] getSumOfEvenOdd(int []x) {
		int esum=0,osum=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]%2==0)
				esum=esum+x[i];
			else
				osum=osum+x[i];
		}
		int sum[]= {esum,osum};
		return sum;
	}
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of arrays:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter value "+n+" size");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int []sum=getSumOfEvenOdd(ar);
		System.out.println("Sum of even no "+sum[0]);
		System.out.println("Sum of odd no "+sum[1]);
}
}
