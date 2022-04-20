//Given a binary search tree, you have to replace each node's data with the sum of all nodes which 
//are greater or equal than it. You need to include the current node's data also.
//That is, if in given BST there is a node with data 5, you need to replace it with
//sum of its data (i.e. 5) and all nodes whose data is greater than or equal to 5.
//	 Sample Input 1 :
//	8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
//	Sample Output 1 :
//	18 
//	36 10 
//	38 31 
//	25 

package Assignment;
import java.util.*;

public class Replace_with_Sum_of_greater_nodes {

	public static void print(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;//edge case}
		}
		Queue<BinaryTreeNode<Integer>>queue = new LinkedList<>();
		//creating a nullNode
		BinaryTreeNode<Integer> nullNode = new BinaryTreeNode<Integer>(Integer.MIN_VALUE);
		queue.add(root);
		queue.add(nullNode);

		while(queue.size() != 1) {

			BinaryTreeNode<Integer> frontNode = queue.poll();
			String toBePrinted = frontNode.data + ":";

			if(frontNode == nullNode) {
				queue.add(nullNode);
				continue;
			}
			if(frontNode.left != null) {
				toBePrinted += "L:" + frontNode.left.data +"," ; // root ke left ka data
				queue.add(frontNode.left);
			}
			if(frontNode.right != null) {
				toBePrinted += "R:" + frontNode.right.data; // root ke right ka data
				queue.add(frontNode.right);
			}
			System.out.println(toBePrinted);
		}
	}

	static int sum = 0; // making static sum
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(root == null){
			return;
		}
		// using inorder 
		replaceWithLargerNodesSum(root.right); // first the right part will be executed
		root.data = sum + root.data; // replacing the root data with summation of sum and root data
		sum = root.data; //updating the sum
		replaceWithLargerNodesSum(root.left);// the the left part
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
		BinaryTreeNode<Integer> root = takeInput();
		replaceWithLargerNodesSum(root);
		print(root);


	}

}
