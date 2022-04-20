//Given a Binary tree, find the largest BST subtree. That is, you need to find the BST with maximum height
//in the given binary tree. You have to return the height of largest BST.
//	Sample Input 1:
//	5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
//	Sample Output 1:
//	2

package Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Largest_BST {

	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(root == null){
			return 0;
		}
		if(isBST(root , Integer.MIN_VALUE , Integer.MAX_VALUE)){ // calling the BST function and checking wither the given
			                                                    // BinaryTree is BST or not if yes then directly return size
			return  size(root);
		}
		//if the Binary tree is not BST then we will Search for the BST in subTree then will will return its largest size
		return Math.max(largestBSTSubtree(root.left) , largestBSTSubtree(root.right));

	}
	//checking the function is BST or not
	public static boolean isBST(BinaryTreeNode<Integer> root , int min , int max){
		if (root == null){
			return true;
		}
		if(root.data < min || root.data > max){
			return false;
		}
		boolean isbst1 = isBST(root.left ,min, root.data -1);
		boolean isbst2 = isBST(root.right ,root.data , max);

		return isbst1&&isbst2;
	}
     // returning the largest height of the BST
	public static int size(BinaryTreeNode<Integer> root){

		if(root == null){
			return 0;
		}
		int height = 1;

		int H1 = height + largestBSTSubtree(root.left);
		int H2 = height + largestBSTSubtree(root.right);

		if(H1 > H2){
			height= H1 ;
		}
		else{
			height = H2 ;
		}
		return height;
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
		int largest = largestBSTSubtree(root);
		
		System.out.println("Largest BST : " + largest);

	}

}
