package Collection;

public class Student {
  private int id;
  private String name;
  private Double per;
Student(int id, String name, Double per) {

	this.id = id;
	this.name = name;
	this.per = per;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPer() {
	return per;
}
public void setPer(Double per) {
	this.per = per;
}
  
}
