//Given a tree and an integer x, find and return number of Nodes which are greater than x.
package Trees_Question;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class No_of_nodes_Greater_than_X {
	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		// Write your code here		
        if(root == null){
            return 0;
        }
        int count = 0;
        int ans = root.data;
        
        if(ans > x){
            count += 1;
         }
          for(int i =0 ; i < root.children.size(); i++){
          count +=   numNodeGreater(root.children.get(i) , x );
            
        }
        return count;

	}
	
	public static TreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter th root");
		int rootData = s.nextInt();
		//creating a Queue
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		//creating a node to store the rootData
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		
		//inserting root into the Queue
		pendingNodes.add(root);
		
		//ask for its children
		while(! pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.poll();
			System.out.println("Enter the number of children of " + frontNode.data);
			int numChildren = s.nextInt();
			
			for(int i =0 ; i< numChildren ; i++) {
				System.out.println("Enter "+ (i + 1)+ "th child of " + frontNode.data);
				int child = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				//connecting cildNode with root
				frontNode.children.add(childNode);
				//to do iterative call over all its children we will add childNode in the Queue
				pendingNodes.add(childNode);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the greatest Integer");
		int x = s.nextInt();
		TreeNode<Integer> root = takeInput();
		int num = numNodeGreater(root ,x);
		System.out.println("No. of nodes Greater than "+ x+" = " + num);

	}

}
