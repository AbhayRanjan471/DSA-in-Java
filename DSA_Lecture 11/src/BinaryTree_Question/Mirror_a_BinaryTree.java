package BinaryTree_Question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Mirror_a_BinaryTree {
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
	 public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		 if(root == null) {
			 return;
		 }
		 mirrorBinaryTree(root.left);
		 mirrorBinaryTree(root.right);
		 
		 //swapping
		 BinaryTreeNode<Integer> templeft = root.right;
		 root.left = root.right;
		 root.right = templeft;
		 
		 
	 }
	
	public static BinaryTreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data");
			int rootData = s.nextInt();
			//creting a node to insert rootData
			BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
			//creting a Queue to insert BinaryTree
			Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
			
			//inserting binarytree into the Queue
			pendingNodes.add(root);
			
			while(! pendingNodes.isEmpty()) {
				BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
				
				System.out.println("Enter the left child of " + frontNode.data);
				int leftChild = s.nextInt();
				if(leftChild != -1) {
					BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
					pendingNodes.add(child);
					frontNode.left = child;
				}
					System.out.println("Enter the right child of " + frontNode.data);
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
		 mirrorBinaryTree(root);
		

	}

}
