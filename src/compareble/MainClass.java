package compareble;

import java.util.Comparator;
import java.util.TreeSet;

public class MainClass {
public static void main(String[] args) {
	class NameComparator implements Comparator{
		public int compare(Object o1,Object o2) {
			String name1=null;
			String name2=null;
			if(o1 instanceof Student)
				name1=((Student)o1).getStudentName();
			if(o1 instanceof Employee)
				name1=((Employee)o1).getEmployeeName();
			if(o2 instanceof Student)
				name2=((Student)o2).getStudentName();
			if(o2 instanceof Employee)
				name2=((Employee)o2).getEmployeeName();
			
			return name1.compareTo(name2)>0?1:-1;
			}
	}
	Comparator com =new NameComparator();
	TreeSet t=new TreeSet(com);
	t.add(new Student(101,"Ajeet",23.34));
	t.add(new Student(102,"Ramesh",63.24));
	t.add(new Student(103,"Rakesh",78.74));
	t.add(new Employee(105,"Roopesh",12.74));
	t.add(new Employee(108,"Roopesh",12.74));
	t.add(new Employee(110,"Kamesh",67.74));
	t.add(new Student(111,"Gurave",56.34));
	t.add(new Student(112,"Pritam",45.74));
	
	for(Object obj:t) {
		System.out.println(obj);
	}
}
}
