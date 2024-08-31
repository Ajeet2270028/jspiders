package string;

import java.util.Scanner;

public class SumOfDigit {
	static int SumDigit(String st) {
		int sum=0;
		char c[]=st.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>=48&&c[i]<=57) {
				sum=sum+c[i]-48;
			}
		}
		return sum;
	}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String st=sc.nextLine();
	int sum= SumDigit(st);
	System.out.println("Sum of Digit: "+sum);
	sc.close();
} 

}