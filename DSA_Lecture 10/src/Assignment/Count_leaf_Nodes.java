//Given a generic tree, count and return the number of leaf nodes present in the given tree.
	//Sample Input 1 :
	//10 3 20 30 40 2 40 50 0 0 0 0 
	//Sample Output 1 :
	//4

package Assignment;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
//import java.util.*;

public class Count_leaf_Nodes {
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
      int count = 0;
        if(root == null){
            return 0;
        }
        if(root.children.size() == 0){
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
		TreeNode<Integer> root = takeInput();
		int count = countLeafNodes(root);
		System.out.println("The no. of leaf nodes present in the Tree is : " + count);

	}

}
