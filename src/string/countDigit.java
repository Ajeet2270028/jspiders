package string;

import java.util.Scanner;

public class countDigit {
	static int countDigit(String st) {
		int count=0;
		char c[]=st.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>=48&&c[i]<=57) {
				count++;
			}
		}
		return count;
	}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String st=sc.nextLine();
	int c= countDigit(st);
	System.out.println("Total no digit: "+c);
	sc.close();
} 

}
