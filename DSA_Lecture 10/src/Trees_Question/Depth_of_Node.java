package Trees_Question;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
//print all nodes at depth K
//depth of a node is define as distance from the root
public class Depth_of_Node {
	
	public static void printAtK(TreeNode<Integer>root , int k) {
		 
		if(k < 0) {
			return;
		}
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		for(int i = 0 ; i< root.children.size(); i++) {
			printAtK(root.children.get(i) , k-1);
		}
	}

	public static TreeNode<Integer> takeInput(Scanner s){
	  //Scanner s = new Scanner(System.in);
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
        Scanner s = new Scanner(System.in);
        System.out.println("enter the depth k");
        int k = s.nextInt();
        TreeNode<Integer> root = takeInput(s);// passing the Scanner
        printAtK(root, k);
	}

}
