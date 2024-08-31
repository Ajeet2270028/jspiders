package stack;

public class PracticeStack {
    int capacity;
    Object []obj;
    int top;
    PracticeStack(int capacity){
    	this.capacity=capacity;
    	this.top=-1;
    	obj=new Object[capacity];
    }
    public void push(Object ele) {
    	if(top==capacity-1) {
    		System.out.println("Stack is over flow");
    		return;
    	}
    	obj[++top]=ele;
    }
    public String toString() {
    	String str="[";
    	for (int i = 0; i <=top; i++) {
			str=str+obj[i]+" ";
		}
    	return str+"]";
    }
    public Object pop() {
    	if(top==-1) {
    		System.out.println("Stack is under flow");
    		return null;
    	}
    	return obj[top--];
    }
    public Object peek() {
    	if(top==-1) {
    		System.out.println("Stack is peek");
    		return null;
    	}
    	return obj[top];
    }
}
