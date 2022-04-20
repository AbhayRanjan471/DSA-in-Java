//For a given Binary Tree of type integer and a number X, find whether a node exists in the tree with data X or not.

package BinaryTree_Question;
import java.util.Queue;
import java.util.LinkedList;
import java.util.*;
import java.util.Scanner;

public class Find_Node {
	
	
	public static boolean isNodePresent_2Method(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return false;
		}
		if(root.data == x) {
			return true;
		}
		return (isNodePresent_2Method(root.left , x )||isNodePresent_2Method( root.right , x));
	}
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
       boolean ispresent = false;
        if(root == null){
            return false;
        }
       
        if(root.data == x){
            ispresent = true;
            return ispresent;
        }
       boolean isPresentLeft = isNodePresent(root.left , x);
        if(isPresentLeft == true){
            return isPresentLeft;
        }
        boolean isPresentRight = isNodePresent(root.right , x);
         if(isPresentRight == true){
            return isPresentRight;
        }
        return ispresent;
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
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number to be find");
		int x = s.nextInt();

		BinaryTreeNode<Integer> root = takeInput();
		System.out.println(isNodePresent(root, x));
		
		//2nd approach
		//System.out.println(isNodePresent_2Method(root, x));
	}

}
