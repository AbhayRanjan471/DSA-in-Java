//Given a binary search tree and an integer S, find pair of nodes in the BST which sum to S. 
//You can use extra space of the order of O(log n).
//	Sample Input 1:
//	8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
//	12
//	Sample Output 1:
//	2 10
//	5 7

package Assignment;
import java.util.*;

public class Pair_sum_in_BST {

	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int sum) {
		// Write your code here
		if(root == null){
			return;
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr = helper(root , arr); // calling the helper function to store the Binary tree into an Array list
		// Collections.sort(arr); // mathod to sort an ArrayList

		int si =0 ; // starting index of the ArrayList
		int en = arr.size() -1 ; // ending index of the ArrayList

		while(si < en){
			if(arr.get(si) + arr.get(en) == sum){
				System.out.println(arr.get(si) +" " + arr.get(en));
				si++;
				en--;

			}
			else if(arr.get(si) + arr.get(en) > sum){
				en--;
			}
			else{
				si++;
			}
		}
	}
	public static ArrayList<Integer> helper(BinaryTreeNode<Integer>root , ArrayList<Integer> arr){
		if(root == null){
			return arr;
		}
		helper(root.left , arr);
		arr.add(root.data); // storing the binary into an ArrayList
		helper(root.right , arr);

		return arr;
	}
	//step 1: storing the binary tree into a ArrayList
	//step 2: In this we need not to sort the array list bcz it is binary search tree it is already sorted 
	//step 3: addig the starting index and the end index and the comparing

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
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sum");
		int sum = s.nextInt();
		BinaryTreeNode<Integer> root = takeInput();
		printNodesSumToS(root , sum);

	}

}
