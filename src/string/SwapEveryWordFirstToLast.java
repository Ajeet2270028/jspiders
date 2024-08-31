package string;

import java.util.Scanner;

public class SwapEveryWordFirstToLast {
	static String swapString(String st) {
		char c[]=st.toCharArray();
		int f=0;
		for (int i = 0; i < c.length; i++) {
			if(i==0&&c[i]!=' '||c[i]!=0&&c[i-1]==' ') {
				 f=i;
			}
			else if(i==c.length-1&&c[i]!=' '|| c[i]!=' '&&c[i+1]==' ') {
				char t=c[f];
			    c[f]=c[i];
			    c[i]=t;
			}
		}
		return new String(c);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a  Sentence");
	String st=sc.nextLine();
	String rs=swapString(st);
	System.out.println(rs);
}
}
