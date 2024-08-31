package string;

import java.util.Scanner;

public class CountWords {
	static int countWords(String st) {
		char ch[]=st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' '|| ch[i]!=' '&&ch[i-1]==' ')
				count++;
		}
		return count;
	}
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a  Sentence");
	String st=sc.nextLine();
	int count=countWords(st);
	System.out.println("Total words in a sentence:"+count);
}
}
