import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Check_Cousins {
	public static boolean isSibling(BinaryTreeNode<Integer> root , int p , int q) {
		if(root == null) {
			return false;
		}
		if(root.left != null && root.right != null) {
			if(root.left.data == p && root.right.data == q) {
				return true;
			}
			else if(root.left.data == q && root.right.data == p) {
				return true;
			}
			else {
				return isSibling(root.left, p, q) || isSibling(root.right, p, q);
			}
			
			 
				
		}
		 if(root.right != null) {
			 return isSibling(root.right, p, q);
		 }
		 else {
			 return isSibling(root.left, p, q);
		 }
	}
	public static int depth(BinaryTreeNode<Integer>root , int node) {
		if(root == null) {
			return -1;
		}
		if(node == root.data) {
			return 0;
		}
		int left = depth(root.left, node);
		if(left != -1) {
			return left + 1;
		}
		else {
			int right = depth(root.right, node);
			if(right != -1) {
				return right + 1;
			}
			else {
				return -1;
			}
		}
	}
	public static boolean isCousin(BinaryTreeNode<Integer> root , int p , int q) {
		if(root == null) {
			return false;
		}
		return ((depth(root , p) == depth(root , q)) && (! isSibling(root, p, q)));
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
		 System.out.println(isCousin(root, 2, 4));

	}

}
