package twodArray;

import java.util.Scanner;

public class CountOddEven {
	static int[] countEvenOrOdd(int mat[][]) {
		int ec=0,oc=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]%2==0)
					ec++;
				else
					oc++;
			}
		}
		int count[]= {ec,oc};
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
		int []count=countEvenOrOdd(mat);
		System.out.println("total no of even: "+count[0]);
		System.out.println("total no of odd: "+count[1]);
	}
}
