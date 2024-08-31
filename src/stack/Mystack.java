package stack;

class Mystack {
   int capacity;
   int top;
   Object []stk;
   Mystack(int capacity){
	   this.capacity=capacity;
	   this.top=-1;
	   stk=new Object[capacity];
   }
 public void push(Object ele) {
	   if(top==(capacity-1)) {
		   System.out.println("Stack over flow");
		   return;
	   }
	  stk[++top]=ele;
	   
   }
   public String toString() {
	   String st="[";
	   for(int i=0;i<=top;i++) {
		   st=st+stk[i]+" ";
	   }
	   return st+"]";
   }
   
   Object pop() {
	   if(top==-1) {
		   System.out.println("Stack underFlow");
		   return null;
	   }
	   return stk[top--];
   }
   
   Object peek() {
	   if(top==-1) {
		   System.out.println("stack is peek");
		   return null;
	   }
	   return stk[top];
   }
}
