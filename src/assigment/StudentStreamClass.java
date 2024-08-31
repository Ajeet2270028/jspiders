package assigment;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentStreamClass {
public static void main(String[] args) {
	List<Student> student=List.of(new Student(123,"Manvith",89.98),new Student(124,"Dhanvith",92.98),
			new Student(125,"Hanvith",79.98),new Student(126,"Mohith",56.98));
	//System.out.println(student);
	//Q.4
	List<Student> dist=student.stream().filter(s->s.getStudentPer()>=85).toList();
	dist.forEach(System.out::println);
	
	//Q.5
	Map<String,List<Student>> gmap=student.stream()
			                              .collect(Collectors.groupingBy(Student::getGrade));
	  
	gmap.forEach((k,v)->{
		System.out.println(k+":-");
		v.forEach(System.out::println);
	});
	       
}
}
