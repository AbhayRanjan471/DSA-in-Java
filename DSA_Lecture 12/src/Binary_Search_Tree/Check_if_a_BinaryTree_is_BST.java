//Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). 
//If yes, return true, return false otherwise.
//Note: Duplicate elements should be kept in the right subtree

package Binary_Search_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Check_if_a_BinaryTree_is_BST {

	static int prev;
	static boolean ans ;
	public static boolean isBST(BinaryTreeNode<Integer> root) {

		prev = Integer.MIN_VALUE;
		ans = true;
		helper(root);

		return ans;

	}
	public static void helper(BinaryTreeNode<Integer> root){
		if(root == null){
			return;
		}
		helper(root.left);

		if(root.data < prev){
			ans = false;
			return ;
		}
		prev = root.data;
		helper(root.right);
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
