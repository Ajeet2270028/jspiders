package compareble;

import java.util.*;

public class MainTreeSet2 {
   public static void main(String[] args) {
	   class AscendingComparator implements Comparator<Integer>{
		   
		   @Override
		   public int compare(Integer o1, Integer o2) {
			   
			   return o1.compareTo(o2)>0?1:-1;
		   }
		   
	   }
	   
	   class DescendingComparator implements Comparator<Integer>{
		   public int compare(Integer i1,Integer i2) {
			   return i1.compareTo(i2)>0?-1:1;
		   }
	   }
	//Comparator<Integer> com=new AscendingComparator();
	Comparator<Integer> com1=new DescendingComparator();
	TreeSet<Integer> ta=new TreeSet<Integer>(com1);
	ta.add(23);
	ta.add(29);
	ta.add(23);
	ta.add(45);
	ta.add(27);
	ta.add(67);
	ta.add(45);
	ta.add(12);
	System.out.println(ta);
	
	
}
}
