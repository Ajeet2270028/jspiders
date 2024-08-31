package doublyLikedlist;

public class DoubleLinkedList {
  class Node{
	  Object data;
	  Node next;
	  Node prev;
	  Node(Object data){
		  this.data=data;
	  }
  }
  Node head;
  Node tail;
  public void addFirst(Object data) {
	  Node n=new Node(data);
	  if(tail==null)
		  head=tail=n;
	  else {
		  n.next=head;
		  head.prev=n;
		  head=n;
	  }
  }
  
  public String toString() {
	  String st="";
	  Node temp=head;
	  while(temp!=null) {
		  st=st+temp.data;
		  if(temp.next!=null) {
			  st=st+"<=>";
		  }
		  temp=temp.next;
	  }
	  return st;
  }
  
  public void addLast(Object data) {
	  Node n=new Node(data);
	  if(tail==null)
		  head=tail=n;
	  else {
		  n.prev=tail;
		  tail.next=n;
		  tail=n;
	  }
  }
  
  public Object deleteFirst() {
	  if(head==null)
		  return "List is Empty";
	  Object data=head.data;
	  head=head.next;
	  if(head!=null) {
		  head.prev=null;
	  }
	  else {
		  tail=null;
	  }
	  return data;
  }
  
  public Object deleteLast() {
	  if(head==null)
		  return "List is Empty";
	  Object data=tail.data;
	  tail=tail.prev;
	  if(tail!=null)
		  tail.next=null;
	  else
		  head=null;
	  return data;
	  
  }
  
  public void reverse() {
	  Node curr=head;
	  while(curr!=null) {
		  Node t=curr.next;
		  curr.next=curr.prev;
		  curr.prev=t;
	  }
	  curr=head;
	  head=tail;
	  tail=curr;
  }
  public Object delect(int index) {
	  if(index==0)
		  return deleteFirst();
	  Node temp=head;
	  while(temp!=null&&index>0) {
		  temp=temp.next;
		  index--;
	  }
	  if(temp==null) {
		  return "Index is in the range";
	  }
	  if(temp==tail) {
		  tail=temp.prev;
		  tail.next=null;
	  }
	  else {
		  temp.prev.next=temp.next;
		  temp.next.prev=temp.prev;
	  }
	  return temp.data;
  }
  
  public void addIndex(Object data,int index) {
	  if(index==0)
		 addFirst(data);
	  Node temp=head;
	  while(index>0&&temp!=null) {
		  temp=temp.next;
		  index--;
	  }
	  if(index==0&&temp==null) {
		  addLast(data);
	  }
	  else if(temp==null){
		  System.out.println("Index is not in range");
	  }
	  else {
		  Node n=new Node(data);
		  n.next=temp;
		  n.prev=temp.prev;
		  temp.prev.next=n;
		  temp.prev=n;
	  }
	 
  }
}
