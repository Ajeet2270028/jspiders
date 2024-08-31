package string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagrameString {
	static boolean isAnagrame(String st1,String st2) {
		st1=st1.replaceAll(" ","");
	    st2=st2.replaceAll(" ","");
	    if(st1.length()!=st2.length())
	    	return false;
	    st1=st1.toLowerCase();
	    st2=st2.toLowerCase();
	    char ch1[]=st1.toCharArray();
	    char ch2[]=st2.toCharArray();
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    return Arrays.equals(ch1, ch2);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a  Sentence");
	String st1=sc.nextLine();
	System.out.println("Enter a  Sentence");
	String st2=sc.nextLine();
	boolean rs=isAnagrame(st1,st2);
	if(rs)
		System.out.println("Anagrame String");
	else
		System.out.println("this is not Anagrame String");
}
}
