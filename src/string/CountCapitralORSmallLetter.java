package string;

import java.util.Scanner;

class CountCapitralORSmallLetter {
	static int[] countLetterUpperorLower(String st) {
		int upCount=0,lowCount=0;
		char c[]=st.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>=65&&c[i]<=90) {
				upCount++;
			}
			if(c[i]>=97&&c[i]<=122) {
				lowCount++;
			}
		}
		int rs[]= {upCount,lowCount};
		return rs;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String st=sc.nextLine();
	int rs[]=countLetterUpperorLower(st);
	System.out.println("Total no UpperLetter "+rs[0]+" and total no of Lower Count "+rs[1]);
}
}
