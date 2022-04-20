//Given a BST and an integer k. Find and return the path from the node with data k and root 
//(if a node with data k is present in given BST) in a list. Return empty list otherwise.
//Note: Assume that BST contains all unique elements.
	//Sample Input 1:
	//8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
	//2
	//Sample Output 1:
	//2 5 8

package Binary_Search_Tree;
import java.util.*;

public class Find_Path_in_BST {
	
	public static void print(ArrayList<Integer> arr) {
		for(int i = 0 ; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}
	
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		 
        if(root == null){
            return null;
        }
        if(root.data == data){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);  // adding the data i the array list
            return output;
        }
        if(data < root.data){
            ArrayList<Integer> leftOutput = getPath(root.left , data);
            if(leftOutput != null){ // adding the path in the array list after finding the data
                leftOutput.add(root.data);
                return leftOutput;
            }
                
        }
        else if(data > root.data){
            ArrayList<Integer> rightOutput = getPath(root.right ,data);
            if(rightOutput != null){ // adding the path
                rightOutput.add(root.data);
                return rightOutput;
            }
        }
        return null;
	}
	public static BinaryTreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		//creting a queue
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);

		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();

			System.out.println("Enter the left child of " + frontNode.data);
			int leftChild = s.nextInt();
			if(leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				frontNode.left = child;
				pendingNodes.add(child);
			}
			System.out.println("Enter the right Child of " + frontNode.data);
			int rightChild = s.nextInt();
			if(rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				frontNode.right = child;
				pendingNodes.add(child);
			}

		}
		return root;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the data to be search");
		int data = s.nextInt();
		 BinaryTreeNode<Integer> root = takeInput();
		 ArrayList<Integer> arr = getPath(root, data);
		 print(arr);

	}

}
