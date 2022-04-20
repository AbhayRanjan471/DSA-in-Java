package Traversals_in_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import BinaryTree_Question.BinaryTreeNode;
//PreOrder :- first root is printed then left aprt and then the right part
public class Pre_Order_Traversal {

	public static void preOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data +" ");//printing the root data
		preOrder(root.left);
		preOrder(root.right);
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
		preOrder(root);

	}

}
