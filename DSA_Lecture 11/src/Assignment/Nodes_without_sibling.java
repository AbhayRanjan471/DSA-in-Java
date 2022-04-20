//For a given Binary Tree of type integer, print all the nodes without any siblings.
	//Sample Input 2:
	//2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 -1 -1 -1 -1 -1 -1
	//Sample Output 2:
	//6 7  

package Assignment;
import java.util.*;

public class Nodes_without_sibling {

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here

		if (root == null){
			return;
		}
		if(root.left != null && root.right == null){
			System.out.print(root.left.data +" ");         
		}
		else if(root.right != null && root.left == null){
			System.out.print(root.right.data +" ");

		}
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
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
		printNodesWithoutSibling(root);

	}

}
