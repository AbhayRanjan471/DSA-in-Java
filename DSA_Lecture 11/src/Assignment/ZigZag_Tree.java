//Given a binary tree, print the zig zag order. In zigzag order, level 1 is printed from left to right, 
//level 2 from right to left and so on. This means odd levels should get printed from left to right and even level right to left.
//	Sample Input :
//	5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
//	Sample Output :
//	5
//	10 6
//	2 3
//	9

package Assignment;
import java.util.*;

public class ZigZag_Tree {
	public static void printZigZag(BinaryTreeNode<Integer> root){

		Stack<BinaryTreeNode<Integer>> stack1 = new Stack<>();
		Stack<BinaryTreeNode<Integer>> stack2 = new Stack<>();

		stack1.push(root);

		while(!stack1.isEmpty() || !stack2.isEmpty()){

			System.out.println();
			while(!stack1.isEmpty()){
				BinaryTreeNode<Integer> frontNode = stack1.pop();
				System.out.print(frontNode.data + " ");

				if(frontNode.left != null){
					stack2.push(frontNode.left);
				}
				if(frontNode.right != null){
					stack2.push(frontNode.right);
				}

			}
			System.out.println();
			while(!stack2.isEmpty()){
				BinaryTreeNode<Integer> frontNode = stack2.pop();
				System.out.print(frontNode.data +" ");

				if(frontNode.right != null){
					stack1.push(frontNode.right);
				}
				if(frontNode.left != null){
					stack1.push(frontNode.left);
				}

			}

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
		BinaryTreeNode<Integer> root = takeInput();
		printZigZag(root);

	}

}
