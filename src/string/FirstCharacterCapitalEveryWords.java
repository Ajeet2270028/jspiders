package string;

import java.util.Scanner;

public class FirstCharacterCapitalEveryWords {
	static String convertFirstCharacterCapital(String st) {
		//st=st.toLowerCase();
		char c[]=st.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(i==0&&c[i]!=' '||c[i]!=' '&&c[i-1]==' ') {
				if(c[i]>='a'&&c[i]<='z')
				c[i]=(char)(c[i]-32);
			}
			else
				if(c[i]>='A'&&c[i]<='Z')
					c[i]=(char)(c[i]+32);
		}
		return new String(c);
	}
	
	static String convertFirstCharactersamll(String st) {
		char c[]=st.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(i==0&&c[i]!=' '||c[i]!=' '&&c[i-1]==' ') {
				if(c[i]>='A'&&c[i]<='Z')
				c[i]=(char)(c[i]+32);
			}
			else
				if(c[i]>='a'&&c[i]<='z')
					c[i]=(char)(c[i]-32);
		}
		return new String(c);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a  Sentence");
	String st=sc.nextLine();
	String rs=convertFirstCharacterCapital(st);
	String rs1=convertFirstCharactersamll(st);
	System.out.println(rs);
	System.out.println(rs1);
}
}
