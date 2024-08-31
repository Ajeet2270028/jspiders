package arrays;

import java.util.Scanner;

public class fequencyOfArray {
	static void countFequency(int a[]) {
		boolean c[]=new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			if(c[i]==false) {
				int count=1;
				for (int j = i+1; j < a.length; j++) {
					if(a[i]==a[j]) {
						count++;
						c[j]=true;
					}
				}
				System.out.println("total no of fequency"+a[i]+"--> "+count);
			}
		}
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
	countFequency(ar);
	
}
}
