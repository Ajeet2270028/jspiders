package stream;

import java.util.*;
public class StreamMain3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	
	//count total vowel and consonants
	String st="Manvith And Dhanvith";
	long countVowel=st.chars()
			          .filter(ch->"AEIOUaeiou".indexOf(ch)>=0)
			          .count();
	System.out.println("Total no of vowel: "+countVowel);
	
	long countConsonant=st.chars().filter(ch->"AEIOUaeiou".indexOf(ch)==-1).count();
	System.out.println("Total no of Consonant: "+countConsonant);
	
	 boolean rs=str.toLowerCase().chars().distinct().filter(ch->ch>='a'&&ch<='z').count()==26;
	 if(rs)
	 System.out.println(str+" is a pangram");
	 else
		 System.out.println(rs+" is not pangram");
}
}
