package string;

import java.util.Scanner;

public class ReverseSentence {
	static String getReverseSentence(String str) {
		String rs="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			int l=i;
			while(i>=0 && ch[i]!=' ') {
				i--;
			}
			int f=i+1;
			while(f<=l) {
				rs=rs+ch[f];
				f++;
			}
			if(i>=0)
				rs=rs+ch[i];
		}
		return rs;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String st=sc.nextLine();
		String rs=getReverseSentence(st);
		System.out.println(rs);
	}
}
