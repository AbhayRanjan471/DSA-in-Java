package Trees_Question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pre_order_Traversals {
	
	public static void preorder(TreeNode<Integer> root) {

		 if(root == null) {
			return;
		}
         System.out.print(root.data + " "); // in preOrder first we are printing the root and then there children
         
         for(int i =0 ; i< root.children.size(); i++) {
        	 preorder(root.children.get(i));
         }
	}
	public static TreeNode<Integer> takeInput(){
		    Scanner s = new Scanner(System.in);
			System.out.println("Enter the root");
			int rootData = s.nextInt();
			//creating a queue
			Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
			//creating a TReeNode to store rootData
			TreeNode<Integer> root = new TreeNode<Integer>(rootData);
			
			pendingNodes.add(root);
			
			while(! pendingNodes.isEmpty()) {
				TreeNode<Integer> frontNode = pendingNodes.poll();
				System.out.println("Enter number of chilfren of " + frontNode.data);
				int numChild = s.nextInt();
				
				for(int i = 0 ; i< numChild ; i++) {
					System.out.println("Enter the " +(i + 1) + "th child of "+frontNode.data);
					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					//connecting child with root
					frontNode.children.add(childNode);
					pendingNodes.add(childNode);
				}
			}
			return root;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       TreeNode<Integer> root = takeInput();// passing the Scanner
	       preorder(root);
		}
}
