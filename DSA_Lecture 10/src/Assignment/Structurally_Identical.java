//Given two Generic trees, return true if they are structurally identical i.e. they are made of nodes 
//with the same values arranged in the same way.
	//Sample Input 1 :
	//10 3 20 30 40 2 40 50 0 0 0 0 
	//10 3 20 30 40 2 40 50 0 0 0 0
	//Sample Output 1 :
	//true

package Assignment;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Structurally_Identical {
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
        boolean isIdentical = true;
        if(root1 == null || root2 == null){
            return false;
        }
        
        if(root1.data != root2.data){
            return false;
        }
        for(int i =0 ; i < root1.children.size() ; i++){
           boolean ischk =  checkIdentical(root1.children.get(i) , root2.children.get(i));
                if(ischk == false){
                    isIdentical = false;
                    return isIdentical;
                }
        }
        return isIdentical;
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
		TreeNode<Integer> root1 = takeInput();
		TreeNode<Integer> root2 = takeInput();
		System.out.println(checkIdentical(root1, root2));

	}

}
