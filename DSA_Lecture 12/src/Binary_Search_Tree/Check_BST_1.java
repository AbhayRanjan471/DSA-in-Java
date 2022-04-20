//Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). 
//If yes, return true, return false otherwise.
//Note: Duplicate elements should be kept in the right subtree.

package Binary_Search_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Check_BST_1 {
	 //its time complexity is n^2
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root == null) { // empty node is an BST
			return true;
		}
		// finding the maximum and the minimum
		int leftMax = maximum(root.left); // calling the function and taking out the max value 
		int rightMin = minimum(root.right);
		if(root.data <= leftMax) {
			return false;
		}
		if(root.data > rightMin) {
			return false;
		}
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		if(isLeftBST && isRightBST) { //True && True = True // True && False = False
			return true;
		}
		else {
			return false;
		}
	}

	private static int maximum(BinaryTreeNode<Integer> root) {
		 if(root == null) {
			 return Integer.MIN_VALUE; // returning the worst value 
		 }
		 return Math.max(root.data ,Math.max(maximum(root.left),maximum( root.right)));
	}

	private static int minimum(BinaryTreeNode<Integer> root) {
		 
		 if(root == null) {
			 return Integer.MAX_VALUE; // returning the worst value 
		 }
		 return Math.min(root.data ,Math.min(minimum(root.left),minimum( root.right)));
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
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		System.out.println(isBST(root));

	}

}
