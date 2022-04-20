//Given a generic tree, find and return the node with second largest value in given tree. Return NULL if no 
//node with required value is present.
	//Sample Input 1 :
	//10 3 20 30 40 2 40 50 0 0 0 0 
	//Sample Output 1 :
	//40

package Assignment;
import java.util.*;

public class Second_LargestElement_in_Tree {
	
	static TreeNode<Integer> node1 = null; // this will store the first largest element
    static TreeNode<Integer> node2 = new TreeNode<Integer>(Integer.MIN_VALUE); // this will store the second largest element
    
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        // Write your code here
        if(root == null){
            return null;
        }
        else{
            node1 = null;
            //node2 = ;
            fun(root);
            return node2;
        }
        

	}
    public static void fun(TreeNode<Integer> root){
        if(node1 == null){
            node1 = root;
           // node2 = root;
        }
        
        else if(root.data > node1.data){
            node2 = node1;
            node1 = root;
        }
        else if(root.data < node1.data  && root.data > node2.data){ //
            node2 = root;
        }
         
        for(int i = 0 ; i < root.children.size(); i++){
            fun(root.children.get(i));
        }
        return;
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
		findSecondLargest(root);
		System.out.println("The Second largest element is : "+ node2.data);

	}

}
