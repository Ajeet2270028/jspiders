package pattern;

import java.util.Scanner;

class TypeXXI {
	//	      1                    1                     1
	//	     121                  212                   010
	//	    12321                32123                 10101
	//	   1234321              4321234               0101010 

	//	  543212345           123454321               123454321
	//	   4321234             2345432                 1234321
	//	    32123               34543                   12321
	//	     212                 454                     121
	//	      1                   5                       1

	//	      A                   A
	//	     ABA                 BAB 
	//	    ABCBA               CBABC
	//	   DCBABCD             DCBABCD 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
 //      1.type-I
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//1 type-2
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			int x=1;
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(x+" ");
				if(j<i)
					x++;
				else
					x--;
			}
			
			System.out.println();
		}
		
//    2.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
//   3.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print((i+j+1)%2+" ");
			}
			
			
			System.out.println();
		}
		
//    4.
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

//      5.
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=n-i+1;j<=n;j++) {
				System.out.print(j+" ");
			}
			for(int j=n-1;j>=n-i+1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
//    6.
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
//     7.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)(64+j)+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
//      8.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print((char)(64+j)+" ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
		
//9.     
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print((char)(65+n-i)+" ");
			}
			System.out.println();
		}
	}
}
