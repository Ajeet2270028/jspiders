package twodArray;

import java.util.Scanner;

public class SumOfEvenOdd {
	static int[] sumOfEvenOrOdd(int mat[][]) {
		int esum=0,osum=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]%2==0)
					esum=esum+mat[i][j];
				else
					osum=osum+mat[i][j];
			}
		}
		int []sum= {esum,osum};
		return sum;
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
	int []sum=sumOfEvenOrOdd(mat);
	System.out.println("Sum of even: "+sum[0]);
	System.out.println("Sum of odd: "+sum[1]);
}
}
