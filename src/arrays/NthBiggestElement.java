package arrays;

import java.util.Scanner;

public class NthBiggestElement {
	static int nthBiggest(int ar[],int n) {
		for (int i = 0; i < ar.length; i++) {
			int count=0;
			for (int j = 0; j < ar.length; j++) {
				if(ar[j]>ar[i]) {
					count++;
				}
			}
			if(count==n-1)
				return ar[i];
		}
		return -1;
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
	System.out.println("Enter nth biggest element");
	int x=sc.nextInt();
	int big=nthBiggest(ar,x);
	System.out.println(x+"Th Biggest element "+big);
}
}
