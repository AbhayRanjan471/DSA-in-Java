package Diameter_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//import BinaryTree_Question.BinaryTreeNode;
//Diameter :- two points farthest from each other

public class DiameterBinaryTree {
	
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
	
	public static int diameter (BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int option1 = height(root.left) + height(root.right);
		int option2 = diameter(root.left);
		int option3 = diameter(root.right);
		
		return Math.max(option1, Math.max(option2, option3));
	}

	public static int height(BinaryTreeNode<Integer> root) {
		 if(root == null) {
			 return 0;
		 }
		 int leftHeight = height(root.left);
		 int rightHeight = height(root.right);
		 
		 return 1+ Math.max(leftHeight, rightHeight);
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

		BinaryTreeNode<Integer>root = takeInput();
		print(root);
		int D = diameter(root);
		System.out.println("Diameter of the Binary Tree = " + D);
		
	}

}
