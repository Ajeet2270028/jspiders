package twodArray;

import java.util.Scanner;

public class RowWiseBigeEement {
	static int[] rowWiseBigElement(int mat[][]) {
		int max[]=new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			int big=Integer.MIN_VALUE;
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]>big)
					big=mat[i][j];
			}
			max[i]=big;
		}
		return max;
	}
	static int[] rowWiseSmallElement(int mat[][]) {
		int min[]=new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			int small=Integer.MAX_VALUE;
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]<small)
					small=mat[i][j];
			}
			min[i]=small;
		}
		return min;
	}
	static int[] columnWisebigElement(int mat[][]) {
		int max[]=new int[mat[0].length];
		for (int i = 0; i < mat[0].length; i++) {
			int big=Integer.MIN_VALUE;
			for (int j = 0; j < mat.length; j++) {
				if(big<mat[j][i])
					big=mat[j][i];
			}
			max[i]=big;
		}
		return max;
	}
	static int[] columnWiseSmallElement(int mat[][]) {
		int min[]=new int[mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			int small=Integer.MAX_VALUE;
			for (int j = 0; j < mat[i].length; j++) {
				if(small>mat[j][i])
					small=mat[j][i];
			}
			min[i]=small;
		}
		return min;
	}
	
	static int[][] rowWiseRevrse(int mat[][]){
	    //int row[][]=new int[mat.length][mat[0].length];
	    for (int i = 0; i < mat.length; i++) {
			int j=0,k=mat[0].length-1;
			while(j<k) {
				int temp=mat[i][j];
				mat[i][j]=mat[i][k];
				mat[i][k]=temp;
				j++;
				k--;
			}
		}
	    
	    return mat;
	    //displayArray(mat);
	}
	static int[][] colWiseRevrse(int mat[][]){
		for (int i = 0; i < mat[0].length; i++) {
			int f=0,l=mat.length-1;
			while(f<l) {                            //00 01 02
				                                    //10 11 12
				                                    //20 21 22
				int temp=mat[f][i];
				mat[f][i]=mat[l][i];
				mat[l][i]=temp;
				f++;
				l--;
			}
		}
		return mat;
		//displayArray(mat);
	}
	static int[] rowWiseSumElement(int mat[][]) {
		int sum[]=new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			int s=0;
			for (int j = 0; j < mat[0].length; j++) {
				s=s+mat[i][j];
			}
			sum[i]=s;
		}
		return sum;
	}
	static int[] colWiseSumElement(int mat[][]) {
		int sum[]=new int[mat[0].length];
		for (int i = 0; i < mat[0].length; i++) {
			int s=0;
			for (int j = 0; j < mat.length; j++) {
				s=s+mat[j][i];
			}
			sum[i]=s;
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
	displayArray(mat);
	displayArray(mat);
	System.out.println("-----------");
	int []big=rowWiseBigElement(mat);
	for (int i = 0; i < big.length; i++) {
		System.out.println( i+1+"th row Biggest element:"+big[i]);
	}
	System.out.println("-----------");
	int []small=rowWiseSmallElement(mat);
	for (int i = 0; i < small.length; i++) {
		System.out.println( i+1+"th row Smallest element:"+small[i]);
	}
	System.out.println("-----------");
	int []bigc=columnWisebigElement(mat);
	for (int i = 0; i < big.length; i++) {
		System.out.println( i+1+" col Biggest element:"+bigc[i]);
	}
	System.out.println("-----------");
	int []smallc=columnWiseSmallElement(mat);
	for (int i = 0; i < small.length; i++) {
		System.out.println( i+1+"th Column Smallest element:"+smallc[i]);
	}
	
	System.out.println("------------");
	int rev[][]=rowWiseRevrse(mat);
	System.out.println("Row wise Reverse");
	displayArray(rev);
	
	
	System.out.println("------------");
	
	int rev1[][]=colWiseRevrse(mat);
	System.out.println("Com wise Reverse");
    displayArray(rev1);
	
	System.out.println("-----------");
	int []sum=rowWiseSumElement(mat);
	for (int i = 0; i < sum.length; i++) {
		System.out.println( i+1+"th row sum element:"+sum[i]);
	}
	
	System.out.println("-----------");
	int []sum1=colWiseSumElement(mat);
	for (int i = 0; i < sum1.length; i++) {
		System.out.println( i+1+"th column sum element:"+sum1[i]);
	}
}
}
