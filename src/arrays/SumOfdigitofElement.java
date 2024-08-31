package arrays;

import java.util.Scanner;

class SumOfdigitofElement {
	static int getNumber(int []x) {
		int sum=0;
		for(int i=0;i<x.length;i++) {
			int num=x[i];
			do {
				int d=num%10;
				sum=sum+d;
				num=num/10;
			}while(num!=0);
			
		}
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
		int sum=getNumber(ar);
		System.out.println("Sum of digit of array element: "+sum);
}
}
