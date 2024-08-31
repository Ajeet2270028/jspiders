package Collection;

import java.util.*;
public class StudentMainClass {
	
	static Student highestPer(List<Student> list) {
		Student hscore=list.get(0);
		for(int i=1;i<list.size();i++) {
			if(list.get(i).getPer()>hscore.getPer())
				hscore=list.get(i);
				
		}
		return hscore;
	}
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      ArrayList<Student> student=new ArrayList<Student>();
      while(true) {
    	  System.out.println("Enter Student id ,name And percentage");
    	  int id=sc.nextInt();
    	  String name=sc.next();
    	  double per=sc.nextDouble();
    	  Student std=new Student(id,name,per);
    	  student.add(std);
    	  System.out.println("Do you have add more student ");
    	  String st=sc.next();
    	  if(st.equalsIgnoreCase("No"))
    	  break;
      }
      System.out.println("User Entered Student information");
      for(Student s:student) {
    	  System.out.println(s);
      }
      System.out.println("Highest Score:");
      Student hs=highestPer(student);
      System.out.println(hs);
	}
}
