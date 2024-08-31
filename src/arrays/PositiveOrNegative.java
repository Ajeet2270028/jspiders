package arrays;

import java.util.Scanner;

class PositiveOrNegative {
	static int[] getCountNegPos(int []x) {
		int nc=0,pc=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]<0)
				nc++;
			else
				pc++;
		}
		int count[]={pc,nc};
		return count;
	}
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of arrays:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter value"+n+ "size");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int count[]=getCountNegPos(ar);
		System.out.println("Positive no: "+count[0]+" negative no: "+count[1]);
	}
}
