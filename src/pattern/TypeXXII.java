package pattern;

import java.util.Scanner;

class TypeXXII {
//       *                *******          1010101
//      ***                *****            10101
//     *****                ***              101
//    *******                *                1
//     *****                ***              101
//      ***                *****            10101 
//       *                *******          1010101  
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
  				System.out.print("* ");
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
  		//2.
  		int sp1=0,st1=n;
  		for(int i=1;i<=n;i++) {
  			for(int j=1;j<=sp1;j++) {
  				System.out.print("  ");
  			}
  			for(int j=1;j<=st1;j++) {
  				System.out.print("* ");
  			}
  			if(i<=n/2) {
  				sp1++;
  				st1=st1-2;
  			}
  			else {
  				sp1--;
  				st1=st1+2;
  			}
  			System.out.println();
  		}
  		//3.
  		int sp2=0,st2=n;
  		for(int i=1;i<=n;i++) {
  			for(int j=1;j<=sp2;j++) {
  				System.out.print("  ");
  			}
  			for(int j=1;j<=st2;j++) {
  				System.out.print(j%2+" ");
  			}
  			if(i<=n/2) {
  				sp2++;
  				st2=st2-2;
  			}
  			else {
  				sp2--;
  				st2=st2+2;
  			}
  			System.out.println();
  		}
	}
}
