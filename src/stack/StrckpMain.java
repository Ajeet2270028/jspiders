package stack;

public class StrckpMain {
	public static void main(String[] args) {
		PracticeStack s=new PracticeStack(5);
		s.push(20);
		s.push(23);
		s.push(26);
		s.push(29);
		s.pop();
		s.pop();
		s.pop();
		s.peek();
		s.pop();
		
		//System.out.println(s.pop());
		System.out.println(s);
	}
}
