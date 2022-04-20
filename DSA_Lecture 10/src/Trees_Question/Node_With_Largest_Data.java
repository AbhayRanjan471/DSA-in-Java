package Trees_Question;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Node_With_Largest_Data {
	
	public static int Largest(TreeNode<Integer>root) {
		if(root == null) { //edge case
			return Integer.MAX_VALUE;
		}
		int ans = root.data;
		
		for(int i =0 ; i< root.children.size(); i++) {
			int childLargest = Largest(root.children.get(i));
			if(childLargest > ans) {
				ans = childLargest;
			}
		}
		return ans;
	}
	
	public static TreeNode<Integer> takeInput(){
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the root");
		int rootData = s.nextInt();
		
		//creating a Queue
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		//creating a root and storing the rootData
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		//adding root into Queue
		pendingNodes.add(root);
		
		//ask for its children
		while(! pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.poll();
			System.out.println("Enter number of children of " + frontNode.data);
			int numChildren = s.nextInt();
			
			// taking input of all its children
			for(int i =0 ; i< numChildren ; i++) {
				System.out.println("Enter "+ (i + 1) + "th child of " + frontNode.data);
				int child = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				//connecting childNode with root
				frontNode.children.add(childNode);
				
				pendingNodes.add(childNode);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		int largest = Largest(root);
		System.out.println(" largest data = " + largest);

	}

}
