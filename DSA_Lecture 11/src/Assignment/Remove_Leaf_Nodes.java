//Given a binary tree, remove all leaf nodes from it. Leaf nodes are those nodes, which don't have any children.
//Note:
//1. Root will also be a leaf node if it doesn't have left and right child. 

package Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Traversals_in_BinaryTree.BinaryTreeNode;

public class Remove_Leaf_Nodes {

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

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){

		if(root == null){
			return null;
		}
		if(root.left == null && root.right == null){
			return null;
		}
		BinaryTreeNode<Integer>temp= removeAllLeaves(root.left);

		BinaryTreeNode<Integer> temp2=removeAllLeaves(root.right);
		root.left=temp;
		root.right=temp2;
		return root;
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
		BinaryTreeNode<Integer>root = takeInput();
		root = removeAllLeaves(root);
		print(root);

	}

}
