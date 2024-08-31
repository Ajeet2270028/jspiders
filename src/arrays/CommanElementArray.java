package arrays;

import java.util.Scanner;

public class CommanElementArray{
	static int[] commanElement(int ar[],int ar1[]) {
		int c[]=new int[ar.length];
		int k=0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar1.length; j++) {
				if(ar[i]==ar1[j]) {
					c[k]=ar[i];
					k++;
				}
			}
		}
		int rs[]=new int[k];
		for (int i = 0; i < rs.length; i++) {
			rs[i]=c[i];
		}
		return rs;
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
		System.out.println("Enter a size of array");
		int n1=sc.nextInt();
		System.out.println("Enter the value of array");
		int ar1[]=new int[n1];
		for (int i = 0; i < ar.length; i++) {
			ar1[i]=sc.nextInt();
		}
		int rs[]=commanElement(ar,ar1);
		System.out.println("Comman Element is");
		for (int i = 0; i < rs.length; i++) {
			System.out.println(rs[i]);
		}
	}
}
