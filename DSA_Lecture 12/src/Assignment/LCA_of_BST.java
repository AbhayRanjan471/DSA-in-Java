//Given a binary search tree and data of two nodes, find 'LCA' (Lowest Common Ancestor) of the given two nodes in the BST.
	//8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
	//2 10
	//Sample Output 1:
	//8
package Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LCA_of_BST {

	static boolean ispresent_a = false;
	static boolean ispresent_b = false;

	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		// code start from here
		if(root == null){
			return -1;
		}
		BinaryTreeNode<Integer> temp = getLCAHelper(root , a , b);
		if(temp.data == null){
			return -1;
		}
		else{
			return temp.data;
		}
	}
	public   static BinaryTreeNode<Integer>  getLCAHelper(BinaryTreeNode<Integer> root, int a, int b) {
		if(root == null){
			return null;
		}
		if(root.data == a){
			ispresent_a = true;
			return root;
		}
		if(root.data == b){
			ispresent_b = true;
			return root;
		}
		BinaryTreeNode<Integer> leftLCA = getLCAHelper(root.left , a , b);
		BinaryTreeNode<Integer> rightLCA = getLCAHelper(root.right , a , b);

		if(leftLCA != null && rightLCA != null){
			return root;
		}
		return leftLCA != null ? leftLCA : rightLCA ;
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
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the LCA of node A");
		int a = s.nextInt();
		System.out.println("Enter the LCA of node B");
		int b = s.nextInt();

		BinaryTreeNode<Integer> root = takeInput();
		int LCA = getLCA(root, a, b);
		System.out.println("LCA of Binary Tree : "+ LCA);

	}
}
