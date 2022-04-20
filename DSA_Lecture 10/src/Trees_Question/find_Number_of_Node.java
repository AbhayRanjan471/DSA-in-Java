package Trees_Question;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
 
 public class find_Number_of_Node {
	
	public static int numNode(TreeNode<Integer> root) {
		if(root == null) { // it's an edge case not a base case
			return 0; 
		}
		int count = 1;
		  for(int i =0 ; i < root.children.size(); i++) {
			  // recursive call
			  // In this we are not providing any base case bcz for loop has already full filled that requirement
			  count += numNode(root.children.get(i));
		  }
		  return count;
	}
	
	public static TreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root ");
		int rootData = s.nextInt();
		//creating a Queue to enter the data  TreeNode<>
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		//creating a root
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		//inserting the root in Queue
		 pendingNodes.add(root);
		 
		 // ask for its children
		 while(! pendingNodes.isEmpty()) {
			 
			 TreeNode<Integer> frontNode = pendingNodes.poll();// poping out the first Node of the Queue
			 System.out.println("Enter the number of children of " + frontNode.data);
			 //
			 int numChildren = s.nextInt();
			 
			 for(int i = 0 ; i<  numChildren; i++) {
				 //taking input for the child
				 System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
				 int child = s.nextInt();
				 TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				 
				 //connecting the child with root
				 frontNode.children.add(childNode);
				 //adding childNode into the Queue to Iterate over its child
				 pendingNodes.add( childNode);
			 }
		 }
		 return root;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode<Integer> root = takeInput();
		int count = numNode(root);
		System.out.println("Number of Node = "+ count);
		
	}

}
