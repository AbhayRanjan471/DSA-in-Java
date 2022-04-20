//For a given a Binary Tree of type integer, duplicate every node of the tree and attach it to the left of itself.
//The root will remain the same. So you just need to insert nodes in the given Binary Tree.
//	Sample Input 1:
//	10 20 30 40 50 -1 60 -1 -1 -1 -1 -1 -1
//	Sample Output 1:
//	10 
//	10 30 
//	20 30 60 
//	20 50 60 
//	40 50 
//	40 

package Assignment;
import java.util.*;

public class Create_nd_Insert_Duplicate_Node {

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

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root == null){
			return;
		}

		insertDuplicateNode(root.left);
		// creating a newNOde o store the root data 
		BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.data);
		BinaryTreeNode<Integer> temp = root.left; //storing the address of root.left so that we can attach this after inserting newNode
		root.left = newNode; //connecting root left with newNode 
		newNode.left = temp; // now connecting the newNOde with temp

		insertDuplicateNode(root.right);

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
		BinaryTreeNode<Integer> root = takeInput();
		insertDuplicateNode(root);
		// print(root);
		printLevelWise(root);

	}

}
