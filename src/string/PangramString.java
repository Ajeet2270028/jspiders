package string;

import java.util.Scanner;

public class PangramString {
	static boolean isPangrame(String st) {
		if(st.length()<26)
			return false;
		int count[]=new int[26];
			for (int i = 0; i < st.length(); i++) {
				char ch=st.charAt(i);
				if(ch>='A'&&ch<='Z')
					count[ch-65]++;
				if(ch>='a'&&ch<='z')
					count[ch-97]++;
			}
			for (int i = 0; i<26; i++) {
				if(count[i]==0)
					return false;
			}
			return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  Sentence");
		String st=sc.nextLine();
		boolean rs=isPangrame(st);
		if(rs)
			System.out.println("Pangram String");
		else
			System.out.println("this is not Pangram String");
	}
}
