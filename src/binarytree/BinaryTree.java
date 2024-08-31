package binarytree;

public class BinaryTree {
	class Node{
		Object data;
		Node left,right;
		Node(Object data){
			this.data=data;
		}
	}
	Node root;

	//@SuppressWarnings("rawtypes")
	public boolean add(Comparable data) {
		if(root==null) {
			root=new Node(data);
			return true;
		}
		Node temp=root;
		while(true) {
			if(data.compareTo(temp.data)>0) {
				if(temp.right==null) {
					temp.right=new Node(data);
					return true;
				}else {
					temp=temp.right;
				}
			}else if(data.compareTo(temp.data)<0) {
				if(temp.left==null) {
					temp.left=new Node(data);
					return true;
				}else {
					temp=temp.left;
				}
			}
			else
				return false;
		}
	}
}
