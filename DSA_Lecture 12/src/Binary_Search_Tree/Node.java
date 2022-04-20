package Binary_Search_Tree;

public class Node<T> {

	T data ;
	Node <T> next;
	Node<T> prev;
	
	Node(T data){
		this.data = data;
		next = null;
		prev = null;
	}
}
