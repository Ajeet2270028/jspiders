package string;

import java.util.Scanner;

public class ConvertLowerOrCapital {
	static String ConvertCapital(String st) {
		String str="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='a'&&ch<='z')
			  ch=(char)(ch-32);
			str=str+ch;
		}
		return str;
	}
	
	static String convertLowerLetter(String st) {
		String str="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
			ch=(char)(ch+32);
			str=str+ch;
		}
		return str;
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value");
	String st=sc.nextLine();
	String rs=ConvertCapital(st);
	String rs1=convertLowerLetter(st);
	System.out.println("capital letter "+rs);
	System.out.println("Lower Letter "+rs1);
	
	//System.out.println();
}

}
