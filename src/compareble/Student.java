package compareble;

public class Student implements Comparable {
  private Integer studentId;
  private String studentName;
  private Double studentSalary;
Student(Integer studentId, String studentName, Double studentSalary) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentSalary = studentSalary;
}
public Integer getStudentId() {
	return studentId;
}
public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public Double getStudentSalary() {
	return studentSalary;
}
public void setStudentSalary(Double studentSalary) {
	this.studentSalary = studentSalary;
}

//public int compareTo(Object obj) {
//	if(obj instanceof Student) {
//		Student std=(Student)obj;
//		return this.studentName.compareTo(std.studentName);
//	}
//	else if(obj instanceof Employee) {
//		Employee emp=(Employee)obj;
//		return this.studentName.compareTo(emp.getEmployeeName());
//	}
//	return 0;
//}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSalary=" + studentSalary
			+ "]";
}
  
}
