package compareble;

public class NameComparision {
  public int desc(String s1,String s2) {
	  return -s1.compareTo(s2);
  }
  public int asc(String s1,String s2) {
	  return s1.compareTo(s2);
  }
 static public int baseOnLength(String s1,String s2) {
	  return s1.length()-s2.length()>0?1:-1;
  }
}
