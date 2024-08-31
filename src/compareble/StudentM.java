package compareble;

public class StudentM {
	 private Integer studentId;
	  private String studentName;
	  private Double studentMarks;
	StudentM(Integer studentId, String studentName, Double studentMarks) {
	
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public Double getStudentMarks() {
		return studentMarks;
	}
	@Override
	public String toString() {
		return "StudentM [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}
	
}
