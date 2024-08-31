package string;

import java.util.Scanner;

public class VowelToCapital {
	static String convertVowel(String st) {
		String str="";
		st=st.toLowerCase();
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				ch=(char)(ch-32);
			str=str+ch;
		}
		return str;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a  Sentence");
	String st=sc.nextLine();
	String count=convertVowel(st);
	System.out.println(count);
}
}
