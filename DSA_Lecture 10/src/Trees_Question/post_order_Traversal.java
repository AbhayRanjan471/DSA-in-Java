//Given a generic tree, print the post-order traversal of given tree.
//The post-order traversal is: visit child nodes first and then root node.
package Trees_Question;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class post_order_Traversal {
	//my way
	public static void printPostOrder(TreeNode<Integer> root){
		 
        if(root == null){
            return;
        }
        if(root.children.size() == 0){ // pahle children print ho ge then root
        System.out.print(root.data + " ");
            return;
        }
        for(int i = 0 ; i < root.children.size() ; i++){
             printPostOrder(root.children.get(i));
             }
         System.out.print(root.data + " "); // printing the root after its children

	}
	//2nd method
	public static void printPostOrder_2(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		for(TreeNode<Integer> child : root.children) {
			printPostOrder(child);
		}
		System.out.println(root.data + " ");
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
       printPostOrder(root);
       //method 2
       System.out.println();
       printPostOrder_2(root);
	}
}
