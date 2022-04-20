package Trees_Question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Find_Height {
	
	 public static int getHeight(TreeNode<Integer> root){
	        
	        int height = 0;
	        if (root == null )
	        {
	            return height;
	        }
	        for(TreeNode<Integer> child : root.children){
	            int ChildHeight = getHeight(child);
	            height = Math.max(height , ChildHeight);
	        }
	        return height+1;
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
		int height = getHeight(root);
		System.out.println(" Height of the Tree  = " + height);

	}
}
