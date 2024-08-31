package twodArray;

import java.util.Scanner;

public class SumOfTwoMatrix {
	static int[][] sumOfTwoArray(int mat[][],int mat1[][]){
		if(mat.length!=mat1.length||mat[0].length!=mat1[0].length) {
			return null;
		}
		int sum[][]=new int[mat.length][mat[0].length];
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				sum[i][j]=mat[i][j]+mat1[i][j];
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
		//System.out.println("Addition fail");
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a order of martix(row and column)");
	int row=sc.nextInt();
	int col=sc.nextInt();
	System.out.println("Enter the "+row*col+" value  of first matrix");
	int mat[][]=new int[row][col];
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			mat[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("Enter a order of martix(row and column)");
	int row1=sc.nextInt();
	int col1=sc.nextInt();
	System.out.println("Enter the "+row1*col1+" value of second matrix");
	int mat1[][]=new int[row1][col1];
	for (int i = 0; i < mat1.length; i++) {
		for (int j = 0; j < mat1[i].length; j++) {
			mat1[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("User enter First Matrix");
	displayArray(mat);
	
	System.out.println("User enter Second matrix");
	displayArray(mat1);
	int [][]sum=sumOfTwoArray(mat,mat1);
	if(sum==null)
		System.out.println("Addition Faild");
	else {
		System.out.println("Sum of Two matrix");
	   displayArray(sum);
	}
	
}
}
