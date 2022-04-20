//Given a binary tree, check if it is balanced. Return true if given binary tree is balanced, false otherwise.
//Balanced Binary Tree:
//A empty binary tree or binary tree with zero nodes is always balanced. For a non empty binary tree to be balanced, 
//following conditions must be met:
//1. The left and right subtrees must be balanced.
//2. |hL - hR| <= 1, where hL is the height or depth of left subtree and hR is the height or depth of right subtree. 

	//Sample Input 1 :
	//5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
	//Sample Output 1 :
	//false
	//Sample Input 2 :
	//1 2 3 -1 -1 -1 -1
	//Sample Output 2 :
	//true

package Assignment;
import java.util.*;

public class Check_Balanced {

	static boolean isChecked = true;
	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {


		if(root == null){
			return false;
		}
		else{
			height(root);
			return isChecked;
		}


	}
	public static int height(BinaryTreeNode<Integer> root ){

		if(root == null) {
			return 0;
		}
		int H1 =  height(root.left);
		int H2 = height(root.right);

		int gap = Math.abs(H1 - H2);
		if(gap > 1){
			isChecked = false;
		}
		int Height = Math.max(H1 , H2) + 1;


		return Height; 
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
		BinaryTreeNode<Integer> root = takeInput();
		boolean check = checkBalanced(root);
		System.out.println(check);

	}

}
