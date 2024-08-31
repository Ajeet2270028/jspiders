package string;

public class LogestSubString {
  public static void main(String[] args) {
	String st="abcabcbb";
	String rs=subString(st);
	System.out.println(rs);
}
  static String subString(String str) {
	  String is="",st="";
	  for(int i=0;i<str.length();i++) {
		  char ch=str.charAt(i);
		  if(st.indexOf(ch)==-1) {
			  st=st+ch;
		  }
		  else {
			  if(st.length()>is.length()) {
				  is=st;
			  }
			  str=str.substring(str.indexOf(ch)+1);
			  st="";
			  i=-1;
		  }
	  }
	  if(st.length()>is.length()) {
		  is=st;
	  }
	  return is;
  }
}
