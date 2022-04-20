package BST_Class;

import java.util.LinkedList;
import java.util.Queue;

//import Binary_Search_Tree.BinaryTreeNode;

public class BinarySearchTree {

	private BinaryTreeNode<Integer> root ;// any changes will be done in this by me user will have no writes to change the root so we 
	// we are making it private

	public void insertData(int data) {
		root = insertData(data, root);
	}
	private BinaryTreeNode<Integer> insertData(int data , BinaryTreeNode<Integer>root){
		if(root == null) { // when we will hit the null point we will create a node and insert the data and return the node
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
			return newNode;
		}
		if(root.data >= data) {
			root.left =insertData(data , root.left); //attaching the newNOde to the left of the root
		}
		else {
			root.right = insertData(data, root.right);//attaching the newNOde to the right of the root
		}
		return root;
	}
	public void deleteData(int data) {

		root = deleteData(data, root);
	}
	private BinaryTreeNode<Integer> deleteData(int data , BinaryTreeNode<Integer> root){
		if(root == null) {
			return null;
		}
		if(data < root.data) {
			root.left = deleteData(data, root.left);
			return root;
		}
		else if(data > root.data) {
			root.right = deleteData(data, root.right);
			return root;
		}
		else { // when data is equal to root.data
			if(root.left == null && root.right == null) {
				return null;
			}
			else if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			else {
				BinaryTreeNode<Integer> minNode = root.right;
				while(minNode.left != null) {
					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right = deleteData(minNode.data, root.right);
				return root;
			}
		}
	}


	private  boolean hasDataHelper(int data , BinaryTreeNode<Integer>root) { // we dont want our user to acces it
		if(root == null) {
			return false;
		}
		if(root.data == data) {
			return true;
		}
		else if(data > root.data) {
			//Call right
			return hasDataHelper(data, root.right);
		}
		else { // 
			//call left
			return hasDataHelper(data, root.left);
		}
	}
	public boolean hasData(int data) { // this function will check the does this contain the data or not
		return hasDataHelper(data , root);
	}
	public void printTree() {
		printTree(root);
	}
	private void printTree(BinaryTreeNode<Integer> root) {
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
}


