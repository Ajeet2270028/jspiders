package twodArray;

import java.util.Scanner;

public class BiggestElement {
	static int biggestElement(int mat[][]) {
		int big=Integer.MIN_VALUE;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(big<mat[i][j])
					big=mat[i][j];
			}
		}
		return big;
	}
	static int smallestElement(int mat[][]) {
		int small=Integer.MAX_VALUE;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(small>mat[i][j])
					small=mat[i][j];
			}
		}
		return small;
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
		System.out.println("Enter the "+row*col+" values");
		int [][]mat=new int[row][col];
		System.out.println("Enter a value:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		displayArray(mat);
		System.out.println("----------");
		int big=biggestElement(mat);
		System.out.println("Biggest element is "+big);
		int small=smallestElement(mat);
		System.out.println("Smallest element is "+small);
	}
}
