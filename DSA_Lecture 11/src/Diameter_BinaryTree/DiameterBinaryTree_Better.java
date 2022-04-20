package Diameter_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// best problem to find diameter and contain valuable method
public class DiameterBinaryTree_Better {
	 
	
	//using the generic pair class we will be able to return height and diameter
	public static Pair<Integer ,Integer> heightDiameter(BinaryTreeNode<Integer> root){
		if(root == null) {
			Pair<Integer,Integer> output = new Pair<>();
			output.first = 0;//height
			output.second = 0;//diameter
			return output;
		}
		Pair<Integer, Integer> leftOutput = heightDiameter(root.left); // this contain left diameter and left height
		Pair<Integer, Integer> rightOutput = heightDiameter(root.right); // this contain right diameter and right height
		// for height
		int height = 1 + Math.max(leftOutput.first, rightOutput.first); // calculating the height
		// for diameter
		int option1 = leftOutput.first + rightOutput.first; // leftouput and rightOutput ka height
		int option2 = leftOutput.second; // leftOutput ka diameter
		int option3 = rightOutput.second; // rightOutput ka diameter
		int diameter = Math.max(option1,Math.max(option2, option3))	;	
	
		// now updating the height and the diameter
		Pair<Integer,Integer> output = new Pair<>();
		output.first = height;
		output.second = diameter;
		return output;
	}
	
	public static BinaryTreeNode<Integer> takeInput(){
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		//inserting the rootData in the BinaryTreeNode
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		//creating a Queue to store the BinaryTreeNode 
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		//inserting root into the Queue
		pendingNodes.add(root);
		
		while(! pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
			
			System.out.println("Enter the left child of " + frontNode.data);
			int leftChild = s.nextInt();
			if(leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.add(child);// inserting child node in pending node 
				frontNode.left = child;// attach frontNode with child
			}
			System.out.println("Enter the right child of "+ frontNode.data);
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
		 BinaryTreeNode<Integer> root = takeInput();
		 int diameter = heightDiameter(root).second; // here we will get the value of the diameter (same as we are doing node.data to get the data of that node)
		                                             // here we have done .second to get the value
		 System.out.println("Diameter : " + diameter);
		 
		 System.out.println("Height : " + heightDiameter(root).first); // .first to get the value

	}

}
