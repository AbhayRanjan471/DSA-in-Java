package Linked_List;

public class LinkedList_Use {

	public static void main(String[] args) {
		 
		Node<Integer> node1 = new Node<Integer>(10);  // this is way create node of Linked_list
        System.out.println(node1.data); // to access the data of node1
        System.out.println(node1.next); // to access next of a node
	    
        Node<Integer> node2 = new Node<Integer>(20);
        
        node1.next = node2; //this is the way to link two node
                            //read:- node1 ke next me humne node2 ka reference dal diya
        
        System.out.println(node2);
        System.out.println(node1.next);
	}

}
