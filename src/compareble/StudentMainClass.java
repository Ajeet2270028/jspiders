package compareble;

public class StudentMainClass {
public static void main(String[] args) {
	Student s1=new Student(123,"Rakesh",12.45) {
		                                 public String toString() {
		    	                         return "Hii "+this.getStudentName();
		    	                         }
	                                    };
	Student s2=new Student(124,"Ramesh",34.45) {
		                              public String toString() {
		                            	  return "Hello "+this.getStudentName();
		                              }
                                 	};
     Student s3=new Student(125,"Ajeet",67.89) {
    	                                 public String toString() {
    	                                	 return "Bye "+this.getStudentName();
    	                                 }
                                         };
            System.out.println(s1);                             
            System.out.println(s2);                             
            System.out.println(s3);                             
}
}
