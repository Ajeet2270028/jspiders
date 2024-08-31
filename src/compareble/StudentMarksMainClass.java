package compareble;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class StudentMarksMainClass {
public static void main(String[] args) {
	ArrayList<StudentM> student=new ArrayList<StudentM>();
	student.add(new StudentM(124,"Rakesh",89.90));
	student.add(new StudentM(125,"Ramesh",78.90));
	student.add(new StudentM(126,"Ajeet",98.90));
	student.add(new StudentM(127,"Rohan",75.78));
	student.add(new StudentM(128,"Kamesh",90.90));
	student.forEach(Operation::printGrade);
	System.out.println("After sort based on percentage");
	//Comparator<StudentM> com=(01,02)->Double.compare(01.getStudentMarks(), 02.getStudentMarks());
	
	Comparator<StudentM> com=Operation::compareMarks;
	Collections.sort(student,com);
	student.forEach(System.out::println);
	
	
	System.out.println("After sort based on Id");
	Comparator<StudentM> com2=Operation::compareId;
	Collections.sort(student,com2);
	student.forEach(System.out::println);
	
	System.out.println("After sort based on Name");
	Comparator<StudentM> com3=Operation::compareName;
	Collections.sort(student,com3);
	student.forEach(System.out::println);
}
}
