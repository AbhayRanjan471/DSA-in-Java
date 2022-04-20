package BinaryTree_Question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Height_of_BinaryTree {
	
	public static void print(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		BinaryTreeNode<Integer> nullNode = new BinaryTreeNode<Integer>(Integer.MIN_VALUE);
		queue.add(root);
		queue.add(nullNode);
		
		while(queue.size() != 1) {
			BinaryTreeNode<Integer> frontNode = queue.poll();
			String toBePending = frontNode.data + ":" ;
			
			if(frontNode == nullNode) {
				queue.add(nullNode);
				continue;
			}
			if(frontNode.left != null) {
				toBePending += "L:" + frontNode.left.data + "," ;
				queue.add(frontNode.left);
			}
			if(frontNode.right != null) {
				toBePending += "R:" + frontNode.right.data ;
				queue.add(frontNode.right);
			}
			System.out.println(toBePending);
		}
	}
	
	public static int heightOptimisedMethod(BinaryTreeNode<Integer> root) {// Optimized way
		if(root == null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right) + 1);
		
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){ // base case
            return 0;
        }
       int Height = 1;
        
        int h1 = Height + height(root.left);
        int h2 = Height+ height(root.right);
        if(h1 > h2){
            Height = h1;
        }
        else{
            Height = h2;
        }
        return Height;
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
		print(root);
		int height = height(root);
		System.out.println( "Height of BinaryTree = "+ height);
		
		//2nd method
		//System.out.println(heightOptimisedMethod(root));
	}

}
