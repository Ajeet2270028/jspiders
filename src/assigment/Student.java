package assigment;

public class Student {
  private int studentId;
  private String studentName;
  private Double studentPer;
Student(int studentId, String studentName, Double studentPer) {
	
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentPer = studentPer;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public Double getStudentPer() {
	return studentPer;
}
public void setStudentPer(Double studentPer) {
	this.studentPer = studentPer;
}
public int getStudentId() {
	return studentId;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPer=" + studentPer + "]";
}
 
String getGrade() {
	if(studentPer>=85)
		return "Distrinct";
	else if(studentPer>=60)
		return "FirstClass";
	else if(studentPer>=50)
		return "SecondClass";
	else
		return null;
}
  
}
