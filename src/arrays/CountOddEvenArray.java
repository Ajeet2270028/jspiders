package arrays;

import java.util.Scanner;

class CountOddEvenArray {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a size");
			int n=sc.nextInt();
			System.out.println("Enter a value");
			int ar[]=new int[n];
			for(int i=0;i<ar.length;i++) {
				ar[i]=sc.nextInt();
			}
			int eCount=0,oCount=0;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]%2==0)
					eCount++;
				else
					oCount++;
			}
			System.out.println("Even Count: "+eCount+" Odd Count: "+oCount);
	 }
}
