//Given a generic tree and an integer n. Find and return the node with next larger element in the Tree i.e. 
//find a node with value just greater than n.
	//Sample Input 1 :
	//18
	//10 3 20 30 40 2 40 50 0 0 0 0 
	//Sample Output 1 :
	//20

package Assignment;
import java.util.*;

public class Next_Larger_Element {

	static TreeNode<Integer> node = null; // its a static that means common to all and iska value tb tk change nai ho ga 
	                                      // jb tk hum na change kre 
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){

		// Write your code here
		if(root == null)
			return null;
		else{
			node=null;
			fun(root,n);
			return node;
		}
	}
	public static void fun(TreeNode<Integer> root, int n){
		if(node == null){
			if(root.data > n)
				node=root;
		}
		else if(root.data > n && root.data < node.data){
			node = root;
		}
		for(int i=0; i<root.children.size(); i++){
			fun(root.children.get(i),n);
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
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Larger element");
		int n = s.nextInt();
		
		TreeNode<Integer> root = takeInput();
		TreeNode<Integer> node = findNextLargerNode(root,n);
		int element = node.data;
		//OR (sort method to get the value by putting .data)
		//int element = findNextLargerNode(root, n).data ;
		
		System.out.println("The next Larger element is : "+ element);

	}

}
