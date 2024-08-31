package que;

public class MyQue {
  int capacity,rear,front;
  Object[] obj;
  MyQue(int capacity){
	  this.capacity=capacity;
	  this.rear=-1;
	  this.front=-1;
	  obj=new Object[capacity];
  }
  public void enQue(Object ele) {
	  if(rear==capacity-1) {
		  System.out.println("Queue is full..");
		  return;
	  }
	  if(front==-1) {
		  front=0;
	  }
	  obj[++rear]=ele;
  }
  public Object deQue() {
	  if(front==-1) {
		  return "Queue is Empty..";
	  }
	  Object ele=obj[front++];
	  if(front>rear)
		  front=rear=-1;
	  return ele;
  }
  public String toString() {
	  String rs="[ ";
	  for(int i=front;i<=rear&&i>=0;i++) {
		  rs=rs+obj[i]+" ";
	  }
	  return rs+"]";
  }
  public int size() {
	  if(front==-1)
		  return 0;
	  return front;
  }
}
