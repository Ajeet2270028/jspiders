package pattern;

import java.util.Scanner;

class TringleTypeXX {
	//	  1                 1                       1
	//   123               222                     1*2
	//  12345             33333                   1*2*3
	// 1234567           4444444                 1*2*3*4 

	//	    1                1                     A
	//	   000              101                   AAA
	//	  11111            10101                 AAAAA
	//	 0000000          1010101               AAAAAAA 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		//		1.
		for(int i=1;i<=n;i++) {
			//int k=1;
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(j+" ");
				//k++;
			}
			System.out.println();
		}
		//		2.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		//		3.
		for(int i=1;i<=n;i++) {
			int k=1;
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j%2==0)
					System.out.print("* ");
				else
					System.out.print(k+++" ");
				
			}
			System.out.println();
		}
		//		4.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
//				if(i%2==0)
//					System.out.print("0 ");
//				else
//					System.out.print("1 ");
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		//		5.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
//				if(j%2==0)
//					System.out.print("0 ");
//				else
//					System.out.print("1 ");
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
		//		6.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("A ");
			}
			System.out.println();
		}

	}
}
