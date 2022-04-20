//For a given a Binary Tree of type integer, print it in a level order fashion where each level will be printed
//on a new line. Elements on every level will be printed in a linear fashion and a single space will separate them.
	//Sample Input 1:
	//10 20 30 40 50 -1 60 -1 -1 -1 -1 -1 -1 
	//Sample Output 1:
	//10 
	//20 30 
	//40 50 60 

package Assignment;
import java.util.*;

public class Level_order_Traversal {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here

		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);

		while(!queue.isEmpty()) {

			BinaryTreeNode<Integer> frontNode = queue.poll();
			if(frontNode==null) {
				System.out.println();
				if(!queue.isEmpty()) {
					queue.add(null);
				}
			}
			else {
				System.out.print(frontNode.data+" ");
				if(frontNode.left!=null) {
					queue.add(frontNode.left);
				}
				if(frontNode.right!=null) {
					queue.add(frontNode.right);
				}
			}
		}
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
		printLevelWise(root);

	}

}
