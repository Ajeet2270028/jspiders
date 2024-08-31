package arrays;

import java.util.Scanner;

public class PairOfSumOfDigit {
	static void pairOfValue(int ar[],int target) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]+ar[j]==target) {
				   System.out.println(ar[i]+" "+ar[j]);
					break;
				}
			}
		}
		//return;
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
	System.out.println("Enter a target value");
	int x=sc.nextInt();
	pairOfValue(ar,x);
}
}
