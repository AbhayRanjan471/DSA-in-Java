//For a given Binary Tree of type integer and a number K, print out all root-to-leaf paths where the sum of
//all the node data along the path is equal to K.
	//Sample Input 1:
	//2 3 9 4 8 -1 2 4 -1 -1 -1 6 -1 -1 -1 -1 -1
	//13
	// Sample Output 1:
	//2 3 4 4 
	//2 3 8

package Assignment;
import java.util.*;

public class Path_Sum_Root_to_Leaf {
	
	 public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
	        if(root == null){
	            return;
	        }
	        //Your code goes here
	        String path=""; // it will store the path of the root 
	        helper(root , k , path);
	    }
	    public static void helper(BinaryTreeNode<Integer>root , int k , String path){
	        if(root == null ){
	            return ;
	        }

	        path += root.data +" "; // storing the root data

	        helper(root.left , k - root.data , path);
	        helper(root.right , k - root.data , path);
	        
	        if(k - root.data == 0 && root.left == null && root.right == null){ // when sum = 0 and left and right root = null
	                                                                           //it will print the path
	        System.out.println(path);
	 
	        }
	        return;
	    }

	public static BinaryTreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		//creting a queue
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);

		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();

			System.out.println("Enter the left child of " + frontNode.data);
			int leftChild = s.nextInt();
			if(leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				frontNode.left = child;
				pendingNodes.add(child);
			}
			System.out.println("Enter the right Child of " + frontNode.data);
			int rightChild = s.nextInt();
			if(rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				frontNode.right = child;
				pendingNodes.add(child);
			}

		}
		return root;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sum");
		int k = s.nextInt();
		
		BinaryTreeNode<Integer> root = takeInput();
		rootToLeafPathsSumToK(root, k);

	}

}
