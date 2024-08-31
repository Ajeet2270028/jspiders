package que;

public class PracticeQueue {
  int capacity;
  int rear,front;
  Object []obj;
  PracticeQueue(int capacity){
	  this.capacity=capacity;
	   this.rear=-1;
	   this.front=-1;
	   obj=new Object[capacity];
  }
  public void push(Object ele) {
	  if(front==capacity-1) {
		  System.out.println("Queue is over flow");
		  return;
	  }
	  if(front==-1)
		  front=0;
	  obj[++rear]=ele;
  }
  public String toString() {
	  String str="[";
	  for(int i=front;i<=rear&&i>=0;i++) {
		  str=str+obj[i]+" ";
	  }
	  return str+"]";
  }
  public Object pop() {
	  if(front==-1) {
		  //System.out.println("Queue is under flow");
		  return "Queue is under flow";
	  }
	  Object ele=obj[front++];
	  if(front>rear) {
		  front=rear=-1;
	  }
	  return ele;
  }
  public Object size() {
	  if(front==-1)
		  return 0;
	  return front;
  }
}
