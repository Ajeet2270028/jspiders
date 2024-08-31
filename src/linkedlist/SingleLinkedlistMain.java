package linkedlist;

public class SingleLinkedlistMain {
public static void main(String[] args) {
	SingleLinkedList li=new SingleLinkedList();
	li.add(56);
	li.add(59);
	li.add(67);
	li.add(86);
	li.add(45);
	System.out.println(li);
	li.addFirst(21);
	System.out.println(li);
	li.add(23,3);
	System.out.println(li);
	li.deleteFirst();
	System.out.println(li);
	li.deleteLast();
	System.out.println(li);
	li.delect(3);
	System.out.println(li);
	li.display();
	li.display1();
//	li.displayReverse();
//	li.reverse();
	//System.out.println(li);
	//li.getTotal();
	System.out.println(li.getTotal());
	System.out.println(li.search(56));
	li.reverse();
	System.out.println(li);
	
}

}
