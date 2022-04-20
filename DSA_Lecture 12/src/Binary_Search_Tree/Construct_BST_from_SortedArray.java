//Given a sorted integer array A of size n, which contains all unique elements. You need to construct a 
//balanced BST from this input array. Return the root of constructed BST.
//Note: If array size is even, take first mid as root.
	//Sample Input 1:
	//7
	//1 2 3 4 5 6 7
	//Sample Output 1:
	//4 2 1 3 6 5 7 

package Binary_Search_Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

 public class Construct_BST_from_SortedArray {
	
	public static void print(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;//edge case}
	     }
		Queue<BinaryTreeNode<Integer>>queue = new LinkedList<>();
		//creating a nullNode
		BinaryTreeNode<Integer> nullNode = new BinaryTreeNode<Integer>(Integer.MIN_VALUE);
		queue.add(root);
		queue.add(nullNode);
		
		while(queue.size() != 1) {
			
			BinaryTreeNode<Integer> frontNode = queue.poll();
			String toBePrinted = frontNode.data + ":";
			
			if(frontNode == nullNode) {
				queue.add(nullNode);
				continue;
			}
			if(frontNode.left != null) {
				toBePrinted += "L:" + frontNode.left.data +"," ; // root ke left ka data
				queue.add(frontNode.left);
			}
			if(frontNode.right != null) {
				toBePrinted += "R:" + frontNode.right.data; // root ke right ka data
				queue.add(frontNode.right);
			}
			System.out.println(toBePrinted);
		}
	}

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		return helper(arr , 0 ,n-1);
	}
	public static BinaryTreeNode<Integer> helper(int[] arr, int si ,int en){

		if(si > en){
			return null;
		}
		int mid = (si+en)/2;

		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
		root.left = helper(arr, si , mid -1);
		root.right = helper(arr , mid+1 , en);

		return root;
	}


	public static void main(String[] args) { 
		int arr[] = {1,2,3,4,5,6,7};
		int size = arr.length;
		BinaryTreeNode<Integer> root = SortedArrayToBST(arr ,size);
		print(root);

	}

}
