package pattern;

import java.util.Scanner;

class AlphaTypeXIX {
//	ABCDE      AAAAA    1 2 3 4 5
//	 ABCD       BBBB      6 7 8 9
//	  ABC        CCC        101112
//	   AB         DD          1314
//	    A          E            15
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
//		1
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
//		2.
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print((char)(65+n-i)+" ");
			}
			System.out.println();
		}
//		3.
		int k=1;
		for(int i=n;i>=1;i--) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print("   ");
			}
			for(int j=i;j>=1;j--) {
				if(i==4||i==5)
				System.out.print(k+"  ");
				else
					System.out.print(k+" ");
				k++;
			}
			
			
			System.out.println();
		}
}
}