package compareble;

import java.util.Comparator;
import java.util.TreeSet;

public class MainTreeSet4 {
public static void main(String[] args) {
	
	Comparator<Integer> com1=(Integer i1,Integer i2)->{
		return i1.compareTo(i2)>0?1:-1;
	};
	Comparator<Integer> com2=(i1,i2)->{return i1.compareTo(i2)>0?1:-1;
	};
	Comparator<Integer> com3=(i1,i2)->i1.compareTo(i2)>0?1:-1;
	
	
	TreeSet<Integer> ts=new TreeSet<Integer>(com3);
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
