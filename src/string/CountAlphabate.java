package string;

import java.util.Scanner;

public class CountAlphabate {
	static int[] countAlphabate(String st) {
		int count[]=new int[26];
		for (int i = 0; i < st.length(); i++) {
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			if(ch>='a'&&ch<='z')
				count[ch-97]++;
		}
		return count;
	}
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  Sentence");
		String st=sc.nextLine();
		int []rs=countAlphabate(st);
		for (int i = 0; i < 26; i++) {
			if(rs[i]!=0)
			System.out.println((char)(i+65)+"->"+rs[i]);
		}
}
}
