package compareble;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class MainStr1Name {
	//Comparator<String> com=NameComparision::basedOnLength;
	
public static void main(String[] args) {
	NameComparision nc=new NameComparision();
	TreeSet<String> l=new TreeSet<String>(nc::desc);
	l.add("Rakesh");
	l.add("Ramesh");
	l.add("Ajeet");
	l.add("Kamesh");
	l.add("Suresh");
	l.add("Rahul");
	for(String st:l) {
		System.out.println(st);
	}
}
}
