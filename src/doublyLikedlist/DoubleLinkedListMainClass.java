package doublyLikedlist;

public class DoubleLinkedListMainClass {
public static void main(String[] args) {
	DoubleLinkedList dl=new DoubleLinkedList();
	dl.addFirst(22);
	dl.addFirst(23);
	dl.addFirst(45);
	dl.addFirst(56);
	dl.addFirst(34);
	dl.addLast(55);
	System.out.println(dl);
	dl.deleteFirst();
	System.out.println(dl);
	dl.deleteLast();
	System.out.println(dl);
//	dl.reverse();
//	System.out.println(dl);
	dl.delect(2);
	System.out.println(dl);
	dl.addIndex(49, 3);
	System.out.println(dl);
	
	
	}
}
