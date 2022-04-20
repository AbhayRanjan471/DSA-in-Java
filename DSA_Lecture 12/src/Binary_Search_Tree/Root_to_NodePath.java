package Binary_Search_Tree;

import java.util.ArrayList;
import java.util.*;

public class Root_to_NodePath {
	
	public static void print(ArrayList<Integer> arr) {
       for(int i =0 ; i < arr.size(); i++) {
    	   System.out.print(arr.get(i) +" ");
       }
		
	}
	
	public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root, int data){
		
		if(root == null) {
			return null;
		}
		if(root.data == data) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data); // adding data into the array list
			return output;
		}
	   ArrayList<Integer> leftOutput = getRootToNodePath(root.left, data);
	   if(leftOutput != null) {  // this is used to add the path of the binary treein the array list
		   leftOutput.add(root.data);
		   return leftOutput;
	   }
	   ArrayList<Integer> rightOutput = getRootToNodePath(root.right, data);
	   if(rightOutput != null) {   // adding the path in the array lsist 
		   rightOutput.add(root.data);
		   return rightOutput;
	   }
	   else {
		   return null;
	   }
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
		ArrayList<Integer> arr = getRootToNodePath(root, 6);
		print(arr);

	}
	

}
