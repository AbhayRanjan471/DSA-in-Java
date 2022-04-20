//For a given preorder and inorder traversal of a Binary Tree of type integer stored in an array/list, 
//create the binary tree using the given two arrays/lists. You just need to construct the tree and return the root.

package Traversals_in_BinaryTree;
import java.util.*;

public class ConstructTreeFrom_Preorder_nd_Inorder {
	
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

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
		return getBuildTree(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
	}

	//preS:-preOrder start ; preE:-preOrder End ; inS:-inOrder start ;inE:-enOrder End
	public static BinaryTreeNode<Integer> getBuildTree(int[] preOrder, int[] inOrder, int preS, int preE, 
			int inS, int inE) {

		if(preS > preE || inS > inE) {
			return null;
		}
		int rootData = preOrder[preS]; // getting root value in rootData
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData); // creating a node and passing the rootData to create a tree

		int i = inS;
		while(i <= inE) {
			if(inOrder[i] == rootData) { //searching for the root
				break;
			}
			i++;
		}
		//we need left and right of( In-order start ,In-order End , PreOrder start, PreOrder end)
		int leftInS = inS;  
		int leftInE =i-1;
		int leftPreS = preS +1;

		int rightInS = i+1;//here
		int rightInE = inE;

		int rightPreE = preE;
		int leftlength = leftInE - leftInS + 1;
		int leftPreE = leftPreS + leftlength -1;
		int rightPreS = leftPreE + 1;

		root.left = getBuildTree(preOrder, inOrder, leftPreS, leftPreE, leftInS, leftInE);
		root.right = getBuildTree(preOrder, inOrder, rightPreS, rightPreE, rightInS, rightInE);
		return root;


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inOrder[] = {4,2,5,1,3,7};
		int preOrder[] = {1,2,4,5,3,7};
		BinaryTreeNode<Integer> root = buildTree(preOrder ,inOrder);
		print(root);

	}

}
