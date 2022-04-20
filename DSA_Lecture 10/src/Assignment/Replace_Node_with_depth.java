//In a given Generic Tree, replace each node with its depth value. You need to just update the data of
//each node, no need to return or print anything.
	//Sample Input 1 :
	//10 3 20 30 40 2 40 50 0 0 0 0 
	//Sample Output 1 : (Level wise, each level in new line)
	//0 
	//1 1 1 
	//2 2

package Assignment;
import java.util.*;

public class Replace_Node_with_depth {
	
	public static void print(TreeNode<Integer> root) {
		if(root == null) { // its a edge case 
			return;
		}
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
		queue.add(root);
		queue.add(nullNode);
		 
		while(queue.size() != 1) {
 
			TreeNode<Integer> temp = queue.poll();
			String s = temp.data +":";
			if(temp == nullNode) {
				queue.add(nullNode);
				 
				continue;
			}
			for(int i =0 ; i< temp.children.size(); i++) {
				 
				s += temp.children.get(i).data + ",";
				queue.add(temp.children.get(i));
			}
			System.out.println(s);
		}
	}
	
	public static void replaceWithDepthValue(TreeNode<Integer> root){

		// Write your code here
        if(root == null){
            return;
        }
       TreeNode<Integer> updatedNode= replace(root , 0);
       
        print(updatedNode);//calling the print function to print the updated TreeNode
		
	}
    public static TreeNode<Integer> replace (TreeNode<Integer> root , int depth){
        
	
	   root.data = depth;
        
        for(int i = 0 ; i < root.children.size(); i++){
            replace(root.children.get(i) , depth + 1);
        }
        return root;
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
		replaceWithDepthValue(root);

	}

}
