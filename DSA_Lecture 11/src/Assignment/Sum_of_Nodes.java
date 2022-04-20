//For a given Binary Tree of integers, find and return the sum of all the nodes data.
	//Sample Input 1:
	//2 3 4 6 -1 -1 -1 -1 -1
	//Sample Output 1:
	// 15

package Assignment;
import java.util.*;

public class Sum_of_Nodes {

	public static int getSum(BinaryTreeNode<Integer> root) {
		//Your code goes here.
		if(root == null){
			return 0;
		}
		int sum = root.data;
		int leftSum=  getSum(root.left);
		int rightSum = getSum(root.right);
		sum += leftSum+rightSum;

		return sum;
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
		int sum = getSum(root);
		System.out.println("Sum of Nodes : " + sum);

	}

}
