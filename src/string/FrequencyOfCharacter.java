package string;

import java.util.Scanner;

public class FrequencyOfCharacter {
	static int[] countCharacter(String st) {
		int count[]=new int[128];
		for (int i = 0; i < st.length(); i++) {
			char ch=st.charAt(i);
			count[ch]++;
		}
		return count;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a  Sentence");
	String st=sc.nextLine();
	int []rs=countCharacter(st);
	for (int i = 0; i < rs.length; i++) {
		if(rs[i]!=0)
		System.out.println((char)i+"->"+rs[i]);
	}
}
}
