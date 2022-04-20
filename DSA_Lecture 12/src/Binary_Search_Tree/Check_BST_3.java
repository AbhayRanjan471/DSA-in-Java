package Binary_Search_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// TC: O^n
public class Check_BST_3 {

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root == null){
			return true;
		}
		else{
			int min = Integer.MIN_VALUE;
			int max = Integer.MAX_VALUE;
			return helper(root ,  max , min);
		}
	}

	public static boolean helper(BinaryTreeNode<Integer> root , int max , int min){
		if (root == null){
			return true;
		}
		if(root.data < min || root.data > max){
			return false;
		}
		boolean isbst1 = helper(root.left , root.data -1 , min);
		boolean isbst2 = helper(root.right , max , root.data);

		return isbst1 && isbst2;
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
