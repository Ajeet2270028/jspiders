package twodArray;

import java.util.Scanner;

public class SumOf2DArrayElement {
	static int getSum(int mat[][]) {
		int sum=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sum=sum+mat[i][j];
			}
		}
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
	System.out.println("Enter the order of the matrix(row and Column):");
	int row=sc.nextInt();
	int col=sc.nextInt();
	System.out.println("Enter the "+row*col+ "values");
	int [][]mat=new int[row][col];
	System.out.println("Enter a value:");
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			mat[i][j]=sc.nextInt();
		}
	}
	displayArray(mat);
	int sum=getSum(mat);
	System.out.println("Sum of 2D Array element is "+sum);
}
}
