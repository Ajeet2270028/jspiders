package assigment;

public class Employee{
  public int id;
  public String name;
  public Double salary;
//String desination;
Employee(int id, String name,double salary) {
	
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
   
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
}
