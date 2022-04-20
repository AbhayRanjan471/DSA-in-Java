package Binary_Search_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//timecomplexity :- O^n
public class Check_BST_2 {
                 
	             // pair of pair  // Pair<first ,Pair<first , second>>
	                                  // first           second
	public static Pair<Boolean ,Pair<Integer , Integer>> isBST(BinaryTreeNode<Integer>root){
		             //isBSt          min         max
		if(root == null) {//base case
			Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean,Pair<Integer , Integer>>();
			output.first = true;
			output.second = new Pair<Integer , Integer>();
			output.second.first = Integer.MAX_VALUE; // output ka second ka first
			output.second.second = Integer.MIN_VALUE; // output ka second ka second
			return output;
		}
		Pair<Boolean,Pair<Integer, Integer>> leftOutput = isBST(root.left);
		Pair<Boolean,Pair<Integer, Integer>> rightOutput = isBST(root.right);
		
		// taking out the overall minimum
		int min = Math.min(root.data ,Math.min(leftOutput.second.first, rightOutput.second.first));
		//taking out overall maximum
		int max = Math.max(root.data ,Math.max(leftOutput.second.second, rightOutput.second.second));
		
		boolean isBst = (root.data > leftOutput.second.second )     // root is greater then left
				        &&(root.data <= rightOutput.second.first)   // root is smaller then right
				        && leftOutput.first && rightOutput.first; // this statement check that lefoutput and right output is BST
		
		Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean,Pair<Integer , Integer>>();
		output.first = isBst;
		output.second = new Pair<Integer , Integer>();
		output.second.first = min;
		output.second.second = max;
		
		return output;
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
		System.out.println(isBST(root).first);

	}

}
