package Trees_Question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//Given a generic tree, count and return the number of leaf nodes present in the given tree.
// leaf nodes are those which doesn't have any children
public class Count_Leaf_nodes {
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
        int count = 0;
        if(root == null){
            return 0;
        }
        if(root.children.size() == 0){ //jb size 0 ho ga iska matlb us particular node k koi children hi nai hai 
        	                           // return 1 kr k hum use count me add kr le ge
            return 1 ;
        }
        for(int i = 0 ; i< root.children.size() ; i++){
             count += countLeafNodes(root.children.get(i));
        }
         return count;
	}
	public static TreeNode<Integer> takeInput( ){
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
			int count = countLeafNodes(root);
			System.out.println("No. of leaf nodes = "+ count);
		}
}
