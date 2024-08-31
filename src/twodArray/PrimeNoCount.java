package twodArray;

import java.util.Scanner;

public class PrimeNoCount {
	static boolean isPrime(int n) {
		if(n==0||n==1)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
			return true;
		
	}
	static int countPrime(int mat[][]) {
		int count=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int n=mat[i][j];
				boolean rs=isPrime(n);
				if(rs)
					count++;
			}
		}
		return count;
	}
	static void displayArray(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a order of martix(row and column)");
	int row=sc.nextInt();
	int col=sc.nextInt();
	System.out.println("Enter the "+row*col+" value");
	int mat[][]=new int[row][col];
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			mat[i][j]=sc.nextInt();
		}
	}
	displayArray(mat);
	int count=countPrime(mat);
	System.out.println("Total no of prime no in this array "+count);
}
}
