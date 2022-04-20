package Binary_Search_Tree;

import java.util.*;

public class Search_node_in_BST {
	
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		boolean isBst = false;
		if(root == null) {
			return false;
		}
		if(root.data == k) {
			isBst =true;
			return isBst;
		}
		if(root.data > k) {
			return searchInBST(root.left, k);
		}
		return searchInBST(root.right, k);
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
		Scanner s = new Scanner (System.in);
		System.out.println("enter the element to be search");
		int k = s.nextInt();
		
		BinaryTreeNode<Integer> root = takeInput();
		System.out.println(searchInBST(root, k));

	}

}
