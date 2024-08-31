package pattern;

import java.util.Scanner;

class TypeXXXIV {
	//       *                1                    * * * * * * *
	//      *  *             1*2                     *       * 
	//     *    *           1*2*3                      *   *
	//    *      *         1*2*3*4                       *
	//     *    *           1*2*3                      *   *
	//      *  *             1*2                     *       *
	//        *               1                    *  *  *  *  *

	//	  * * * * * * *        * * * * * * *                 1
	//	  * *       * *        *     *     *               1   1
	//	  *   *   *   *        *     *     *             1   2   1
	//	  *     *     *        * * * * * * *           1   3   3   1
	//	  *   *   *   *        *     *     *         1   4   6   4   1
	//	  * *       * *        *     *     *       
	//	  * * * * * * *        * * * * * * *

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();

		//1.
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				if(j==1 ||j==st) {
					System.out.print("* ");
				}else
					System.out.print("  ");
			}
			if(i<=n/2) {
				sp--;
				st=st+2;
			}
			else {
				sp++;
				st=st-2;
			}
			System.out.println();
		}
		System.out.println("===========");
		//2.
		int sp1=n/2,st1=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp1;j++) {
				System.out.print("  ");
			}
			int k=1;
			for(int j=1;j<=st1;j++) {
				if(j%2==0)
					System.out.print("* ");
				else
					System.out.print(k+++" ");

				//  				if(j<=st/2)
				//  					k++;
				//  				else

			}
			if(i<=n/2) {
				sp1--;
				st1=st1+2;
			}
			else {
				sp1++;
				st1=st1-2;
			}
			System.out.println();
		}
		//		for(int i=1;i<=n;i++) {
		//			for(int j=1;j<=sp1;j++) {
		//				System.out.print(" ");
		//			}
		//			for(int j=1;j<=st1;i++) {
		//				System.out.print(j);
		//				if(j<st1)
		//					System.out.print("* ");
		//			}
		//			if(i<=n/2) {
		//				sp1--;
		//				st1++;
		//			}
		//			else {
		//				sp1++;
		//				st1--;
		//			}
		//			System.out.println();
		//		}

		System.out.println("============");

		//3.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 ||i==n || i==j|| i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("==============");

		//4.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n||i==j||i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("===============");
		//5.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n||i==n/2+1||j==n/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("===============");
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==1||i==n||j==1||j==n||(i==j&& i<=n/2+1)||(i+j==n+1&&j>n/2));
//					System.out.print("* ");
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
		System.out.println("==================");
		//6.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			int x=1;
			for(int j=1;j<=i;j++) {
				System.out.print(x+"    m"); 
				x=x*(i-j)/j;
			}
			System.out.println();
		}
		
		//7.
		for(int i=1;i<=n;i++) {
			int x=i;
			for(int j=1;j<=i;j++){
				System.out.print(x+" ");
				x=x+n-j;
			}
			System.out.println();
		}
		
		//8
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(64+k)+" ");
				k++;
			}
			System.out.println();
		}
		
		int sp5=0,st5=10/2,st6=(10/2)+1;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=st5;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=sp5;j++) {
				System.out.print("  ");
			}
			for(int j=st6;j<=10;j++) {
				System.out.print("* ");
			}
			if(i<10/2) {
				sp5=sp5+2;
				st5--;
				st6++;
			}
			else {
				sp5=sp5-2;
				st5++;
				st6--;
			}
			System.out.println();
		}

	}
}
