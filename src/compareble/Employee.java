package compareble;

public class Employee implements Comparable{
	private Integer employeetId;
	  private String employeeName;
	  private Double employeeSalary;
	private Object studentName;
	Employee(Integer employeetId, String employeeName, Double employeeSalary) {
		
		this.employeetId = employeetId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public Integer getEmployeetId() {
		return employeetId;
	}
	public void setEmployeetId(Integer employeetId) {
		this.employeetId = employeetId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
   
	 
	@Override
	public String toString() {
		return "Employee [employeetId=" + employeetId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
//	public int compareTo(Object obj) {
//		if(obj instanceof Employee) {
//			Employee emp=(Employee)obj;
//			return this.employeeName.compareTo(emp.employeeName);
//		}
//		else if(obj instanceof Student) {
//			Student std=(Student)obj;
//			return this.employeeName.compareTo(std.getStudentName());
//		}
//		return 0;
//	}
	
	
}
