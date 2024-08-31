package compareble;

public class Operation {
static void printGrade(StudentM std) {
	String grade="";
	if(std.getStudentMarks()>=85)
		grade="Distinction";
	else if(std.getStudentMarks()>=60)
		grade="FirstClass";
	else if(std.getStudentMarks()>=50)
		grade="SecondClass";
	else
		grade="pass";
	System.out.println(std.getStudentName()+" ->"+grade);
}
static int compareId(StudentM s1,StudentM s2) {
	return s1.getStudentId()-s2.getStudentId();
}
static int compareMarks(StudentM s1,StudentM s2) {
	return s1.getStudentMarks().compareTo(s2.getStudentMarks())>0?1:-1;
}
static int compareName(StudentM s1,StudentM s2) {
	return s1.getStudentName().compareTo(s2.getStudentName())>0?1:-1;
}
}
