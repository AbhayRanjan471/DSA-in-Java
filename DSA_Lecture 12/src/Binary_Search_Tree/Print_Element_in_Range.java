//Given a Binary Search Tree and two integers k1 and k2, find and print the elements which are in range k1 and k2 (both inclusive).
//Print the elements in increasing order.
	//Sample Input 1:
	//8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
	//6 10
	//Sample Output 1:
	//6 7 8 10

package Binary_Search_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Print_Element_in_Range {
	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
		if(root == null){
			return;
		}
		int max = Math.max(k1 ,k2);
		int min = Math.min(k1 , k2);

		if(root.data >= min && root.data <= max){

			elementsInRangeK1K2(root.left ,k1 ,k2);
			System.out.print(root.data + " ");
			elementsInRangeK1K2(root.right ,k1 ,k2);

		}
		else  if(root.data > max){
			elementsInRangeK1K2(root.left ,k1 ,k2);
		}
		else  if(root.data < min){
			elementsInRangeK1K2(root.right ,k1 ,k2);
		}
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
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the starting range");
		int k1 = s.nextInt();
		System.out.println("Enter the ending range");
		int k2 = s.nextInt();
		BinaryTreeNode<Integer> root = takeInput();
		elementsInRangeK1K2(root, k1, k2);

	}

}
