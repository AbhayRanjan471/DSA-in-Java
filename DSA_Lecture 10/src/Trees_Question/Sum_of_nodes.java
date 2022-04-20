package Trees_Question;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Sum_of_nodes {
	
	public static int sumOfAllNode(TreeNode<Integer> root){
        if(root == null){ //edge case
            return 0;
        }
        int sum = root.data; //storing the root value 
        
        for(int i =0 ; i < root.children.size(); i++){
        	//recursively calling over all its child
            sum += sumOfAllNode(root.children.get(i));
        }
        return sum;
	
	}
	
	public static TreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		
		//Creating a Queue to store the treeNode
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		//creting a  root
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		//now inserting the root into the Queue
		pendingNodes.add(root);
		
		//ask for ots children
		while(! pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.poll();
			System.out.println("Enter number of children of " + frontNode.data);
			int numChildren = s.nextInt();
			
			//now Iterative call over its children
			for(int i =0 ; i< numChildren ; i++) {
				System.out.println("Enter "+ (i + 1) + "th child of " + frontNode.data);
				int child = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				//connecting childNode with root
				frontNode.children.add(childNode);
				//adding the childNode to the Queue to do Iterative call over it's children
				pendingNodes.add(childNode);
			}
		}
		return root;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		int sum = sumOfAllNode(root);
		System.out.println("Sum of Nodes = " + sum);

	}

}
