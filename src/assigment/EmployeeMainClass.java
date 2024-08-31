package assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.*;

public class EmployeeMainClass {
public static void main(String[] args) {
	List<Employee> l=new ArrayList<Employee>();
	l.add(new Employee(100,"Rama",20000));
	l.add(new Employee(101,"Rakesh",24000));
	l.add(new Employee(103,"Rajesh",20000));
	l.add(new Employee(104,"kamesh",45000));
	l.add(new Employee(105,"Ajeet",34000));
	l.add(new Employee(108,"Rajan",56000));
	
//	Optional<Employee> al=l.stream().max((a,b)->(a.getSalary().compareTo(b.getSalary())));
//	System.out.println(al);
//Q.1	
	Optional<Employee> op=l.stream()
			//.max((x,y)->Double.compare(x.salary, y.salary));
			.max(Comparator.comparingDouble(Employee::getSalary));
	op.ifPresent(emp->System.out.println(emp));

	//Q.2
	List<Employee> Namesh=l.stream()
			               //.filter(e->e.name.toLowerCase().endsWith("sh")).toList();
			               .filter(e->e.name.contains("j")||e.name.contains("k")).toList(); //search name j and k
	System.out.println(Namesh);
	//Namesh.forEach(System.out::println);
	
	//Q.3
	//l.stream().map()
	//employee employee.stream()
	               //  map(e->{if(e.department.equalsIgnoreCase("developer")).e.setSalary()*1.15);return e;}).toList();
	                 //Namesh.forEach(System.out::println);
	
//	l.stream().filter(e->e.department.equalsIgnoreCase("Deveploer"))
//	                 .forEach(e->e.setSalary(e.getSalary()*1.15));
//	l.forEach(System.out::println);
	
    //Q.4
	
	
	
	
}
}
