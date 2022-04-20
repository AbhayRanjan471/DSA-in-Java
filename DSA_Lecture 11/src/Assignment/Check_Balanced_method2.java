package Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Check_Balanced_method2 {
	
	//creating a pair class which will return isBalanced and height
	public static class pair{
		boolean isBalanced;
		int height;
	}
	public static boolean checkBalanced(BinaryTreeNode<Integer>root) {
		if(root == null) {
			return true;
		}
		return checkBalancedHelper(root).isBalanced;
	}
	

	public static pair checkBalancedHelper(BinaryTreeNode<Integer> root) {
		if(root == null) {
			pair ans = new pair();
			ans.height = 0;
			ans.isBalanced = true;
			return ans;
		}
		
		pair leftPart = checkBalancedHelper(root.left);
		pair rightPart = checkBalancedHelper(root.right);
		
		int heightDiff =  Math.abs(leftPart.height - rightPart.height);
		
		pair ans; //creating object of pair class
		if(! leftPart.isBalanced || ! rightPart.isBalanced || heightDiff > 1) {
			ans = new pair();
			ans.height = Math.max(leftPart.height , rightPart.height) + 1;
			ans.isBalanced = false;
		}
		else {
			ans = new pair();
			ans.height = Math.max(leftPart.height, rightPart.height)+1;
			ans.isBalanced = true;
		}
		return ans;
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
		boolean check = checkBalanced(root);
		System.out.println(check);

	}

}
