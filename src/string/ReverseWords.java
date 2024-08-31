package string;

import java.util.Scanner;

class ReverseWords {
	static String getReverseWord(String st) {
				String str="";
				char ch[]=st.toCharArray();
				for(int i=0;i<ch.length;i++) {
					int f=i;
					while(i<ch.length && ch[i]!=' ') {
						i++;
					}
					int l=i-1;
					while(l>=f) {
						str=str+ch[l];
						l--;
					}
					if(i<ch.length) {
						str=str+ch[i];
					}
				}
				return str;

		//onther method
//		String str[]=st.split(" ");
////		String rs="";
//		for(int i=0;i<str.length;i++) {
//			char ch[]=str[i].toCharArray();
//			for(int j=0;j<=ch.length/2;j++) {
//				char temp=ch[j];
//				ch[j]=ch[ch.length-j-1];
//				ch[ch.length-j-1]=temp;
//			}
//			String s= new String(ch);
//		}
//       return s+" ";

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String st11="BAAIJKSF";
		//System.out.println(st11.indexOf("c"));
		//System.out.println(st11.substring(3));
		System.out.println("Enter a String");
		String st=sc.nextLine();
		String rs=getReverseWord(st);
		System.out.println(rs);
		
	}
}
