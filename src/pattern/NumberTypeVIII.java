package pattern;

import java.util.Scanner;

class NumberTypeVIII {
//	  12345         54321       54321
//	   1234          4321        5432
//	    123           321         543
//	     12            21          54
//	      1             1           5
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
//		1.
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//		2.
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//		3.
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=n;j>=n+1-i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		 
		
}
}
