package string;

import java.util.Scanner;

public class CountVowelOrConstant {
	static int[] countVowelorconstant(String st) {
		int vc=0,cc=0;
		char c[]=st.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='A'||c[i]=='E'||c[i]=='e'||c[i]=='I'||c[i]=='i'||c[i]=='o'||c[i]=='O'||c[i]=='U'||c[i]=='u') {
				vc++;
			}
			else
				cc++;
		}
		int c1[]= {vc,cc};
		return c1;
	}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String st=sc.nextLine();
	int c[]= countVowelorconstant(st);
	System.out.println("Total no vowel: "+c[0]);
	System.out.println("Total no constant: "+c[1]);
	sc.close();
} 

}
