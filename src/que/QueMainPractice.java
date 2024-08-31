package que;

public class QueMainPractice {
public static void main(String[] args) {
	PracticeQueue q=new PracticeQueue(5);
	q.push(14);
	q.push(10);
	q.push(18);
	q.push(23);
	q.push(45);
	System.out.println(q.size());
//	q.pop();
//	q.pop();
	System.out.println(q.pop());
	System.out.println(q);
}
}
