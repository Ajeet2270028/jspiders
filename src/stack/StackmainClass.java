package stack;

class StackmainClass {
public static void main(String[] args) {
	Mystack ms=new Mystack(5);
	ms.push(28);
	ms.push(29);
	ms.push(34);
	ms.push(56);
	System.out.println(ms.pop());
	System.out.println(ms.pop());
	System.out.println(ms);
	System.out.println(ms.peek());
}
}
