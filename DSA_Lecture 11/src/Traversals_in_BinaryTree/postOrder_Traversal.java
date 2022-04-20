package Traversals_in_BinaryTree;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
// postOrder:- first leftPart then rightPart and the root will be printed
public class postOrder_Traversal {
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");

	}
	
	public static BinaryTreeNode<Integer> takeInput(){
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		//inserting the rootData in the BinaryTreeNode
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		//creating a Queue to store the BinaryTreeNode 
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		//inserting root into the Queue
		pendingNodes.add(root);
		
		while(! pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
			
			System.out.println("Enter the left child of " + frontNode.data);
			int leftChild = s.nextInt();
			if(leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.add(child);// inserting child node in pending node 
				frontNode.left = child;// attach frontNode with child
			}
			System.out.println("Enter the right child of "+ frontNode.data);
			int rightChild = s.nextInt();
			if(rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.add(child);
				frontNode.right = child;
			}
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		postOrder(root);

	}

}
