package pattern;

import java.util.Scanner;

class TypeXXIII {
//      1234321            1234321        4321234             1
//       12321              23432          32123             212
//        121                343            212             32123
//         1                  4              1             4321234
//        121                343            212             32123
//       12321              23432          32123             212
//      1234321            1234321        4321234             1 
     
//	       4                     
//	      343
//	     23432
//	    1234321
//	     23432 
//	      343
//	       4
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
  		System.out.println("Enter a number");
  		int n=sc.nextInt();
  		
  		//1.
  		int sp=0,st=n;
  		for(int i=1;i<=n;i++) {
  			for(int j=1;j<=sp;j++) {
  				System.out.print("  ");
  			}
  			int x=1;
  			for(int j=1;j<=st;j++) {
  				System.out.print(x+" ");
  				if(j<=st/2)
  					x++;
  				else
  					x--;
  			}
  			if(i<=n/2) {
  				sp++;
  				st=st-2;
  			}
  			else {
  				sp--;
  				st=st+2;
  			}
  			System.out.println();
  		}
  		System.out.println("=================");
  		//2.
  		int sp1=0,st1=n;
  		for(int i=1;i<=n;i++) {
  			for(int j=1;j<=sp1;j++) {
  				System.out.print("  ");
  			}
  			int x=sp1+1;
  			for(int j=1;j<=st1;j++) {
  				System.out.print(x+" ");
  				if(j<=st1/2)
  					x++;
  				else
  					x--;
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
  		System.out.println("=================");
  		//3.
  		int sp2=0,st2=n;
  		for(int i=1;i<=n;i++) {
  			for(int j=1;j<=sp2;j++) {
  				System.out.print("  ");
  			} 
  			int x=st2/2+1;
  			for(int j=1;j<=st2;j++) {
  				System.out.print(x+" ");
  				if(j<=st2/2)
  					x--;
  				else
  					x++;
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
  		System.out.println("=================");
  		//4.
//  		int sp3=n/2,st3=1;
//  		for(int i=1;i<=n;i++) {
//  			for(int j=1;j<=sp3;j++) {
//  				System.out.print("  ");
//  			} 
//  			int x=st3/2+1;
//  			for(int j=1;j<=st3;j++) {
//  				System.out.print(x+" ");
//  				if(j<=st3/2)
//  					x--;
//  				else
//  					x++;
//  			}
//  			if(i<=n/2) {
//  				sp3--;
//  				st3=st3+2;
//  			}
//  			else {
//  				sp3++;
//  				st3=st3-2;
//  			}
//  			System.out.println();
//  		}
  		
  		for(int i=1;i<=n;i++) {
  			for(int j=1;j<=n-i;j++) {
  				System.out.print("  ");
  			}
  			for(int j=1;j<=2*i-1;j++) {
  				System.out.print(i+" ");
  				if(j<=i)
  					i--;
  				else
  					i++;
  			}
  			System.out.println();
  		}
  		System.out.println("=================");
  		int sp4=n/2,st4=1;
  		for(int i=1;i<=n;i++) {
  			for(int j=1;j<=sp4;j++) {
  				System.out.print("  ");
  			}
  			int x=sp4+1;
  			for(int j=1;j<=st4;j++) {
  				System.out.print(x+" ");
  				if(j<=st4/2)
  					x++;
  				else
  					x--;
  			}
  			if(i<=n/2) {
  				sp4--;
  				st4=st4+2;
  			}
  			else {
  				sp4++;
  				st4=st4-2;
  			}
  			System.out.println();
  		}
	}
}
