package linkedlist;

public class SingleLinkedList {
  class Node{
	  Object data;
	  Node next;
	  Node(Object data){
		  this.data=data;
	  }
  }
  Node head;
  public void add(Object data) {
	  Node n=new Node(data);
	  if(head==null) {
		  head=n;
		  return;
	  }
	  Node temp=head;
	  while(temp.next!=null) {
		  temp=temp.next;
	  }
	  temp.next=n;
  }
  public void addFirst(Object data) {
	  Node n=new Node(data);
	  n.next=head;
	  head=n;
  }
  public String toString() {
	  String st="";
	  Node temp=head;
	  while(temp!=null) {
		  st=st+temp.data;
		  if(temp.next!=null)
			  st=st+"->";
		  temp=temp.next;
	  }
	  return st;
  }
  public void add(Object data,int index) {
	  Node n=new Node(data);
	  if(index==0) {
		  n.next=head;
		  head=n;
	  }
	  else {
		  Node temp=head;
		  while(temp!=null&&index>1) {
			  temp=temp.next;
			  index--;
		  }
		  if(temp!=null) {
			  n.next=temp.next;
			  temp.next=n;
		  }else {
			 System.out.println("index not in the range");
		  }
	  }
  }
  public Object deleteFirst() {
		if(head==null) {
			return "list is Empty";
		}
		Object data=head.next;
		head=head.next;
		return data;
	}
  public Object deleteLast() {
	  if(head==null) {
		  return "List is empty";
	  }
	  Node temp=head;
	  Node prev=null;
	  while(temp.next!=null) {
		  prev=temp;
		  temp=prev.next;
	  }
	  if(prev!=null) {
		  prev.next=null;
	  }
	  else {
		  head=null;
	  }
	  return temp.data;
  }
  public Object delect(int index) {
	  if(index==0) {
		  return deleteFirst();
	  }
	  Node temp=head;
	  Node prev=null;
	  while(temp!=null&&index>0) {
		  index--;
		  prev=temp;
		  temp=temp.next;
	  }
	  if(temp==null) {
		  return "Index is not in the range";
	  }
	  prev.next=temp.next;
	  return temp.data;
  }
  
  //with loop
  public void display() {
	  Node temp=head;
	  while(temp!=null) {
		  System.out.print(temp.data+" ");
		  temp=temp.next;
	  }
	  System.out.println();
  }
  //without loop
   public void display1() {
	   display1(head);
   }
   void display1(Node start){
	   if(start==null)
		   return;
	   System.out.println(start.data);
	   display1(start.next);
   }
   //System.out.println();
   
   //reverse
   public void displayReverse() {
	   displayReverse(head);
   }
   void displayReverse(Node start) {
	   if(start.next!=null)
		   displayReverse(start.next);
	   System.out.println(start.data);
   }
   
   //reverse the linkedList
   public void reverse() {
	   Node temp=head;
	   Node pre=null;
	   Node next=null;
	   while(temp!=null) {
		   temp=temp.next;
		   temp.next=pre;
		   pre=temp;
		   temp=next;
	   }
	   head=pre;
	   //System.out.println(head.data);
   }
   
   //sum of linkedList
   public int getTotal() {
	   return sumOfElement(head);
   }
   private int sumOfElement(Node start) {
	   if(start==null)
		   return 0;
	   return (int)start.data+sumOfElement(start.next);
   }
   
   //search element
   
   public boolean search(Object ele) {
	   return search(ele,head);
   }
   private boolean search(Object ele,Node start) {
	   if(start==null)
		   return false;
	   if(start.data==ele)
		   return true;
	       return search(ele,start.next);
   }
}
