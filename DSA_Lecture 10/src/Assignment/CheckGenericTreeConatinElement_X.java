//Given a generic tree and an integer x, check if x is present in the given tree or not. 
//Return true if x is present, return false otherwise.
	//Sample Input 1 :
	//40
	//10 3 20 30 40 2 40 50 0 0 0 0 
	//Sample Output 1 :
	//true

package Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckGenericTreeConatinElement_X {
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		// Write your code here
        boolean ispresent = false;
        if(root == null){
            return false;
        }
        if(root.data == x){
            // ispresent = true;
            return true;
        }
        for(int i = 0 ;i < root.children.size(); i++){
            boolean ischk = checkIfContainsX(root.children.get(i) ,x);
            if(ischk == true){
                ispresent = true;
                return ispresent;
            }
        }
        return ispresent;
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
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the inetger to be checked");
		 int x = s.nextInt();
		 TreeNode<Integer> root = takeInput();
		 
		 System.out.println(checkIfContainsX(root ,x));

	}

}
