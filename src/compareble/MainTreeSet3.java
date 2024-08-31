package compareble;

import java.util.*;

public class MainTreeSet3 {
public static void main(String[] args) {
	Comparator com=new Comparator<Integer>() {
		public int compare(Integer i1,Integer i2) {
			return i1.compareTo(i2)>0?1:-1;
		}
	};//ananymous class
	TreeSet<Integer> ts=new TreeSet<Integer>(com);
	ts.add(23);
	ts.add(24);
	ts.add(56);
	ts.add(34);
	ts.add(78);
	ts.add(23);
	ts.add(56);
	ts.add(89);
	ts.add(45);
	
	System.out.println(ts);
}
}
