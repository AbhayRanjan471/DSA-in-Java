//Given a BST, convert it into a sorted linked list. You have to return the head of LL.
	//Sample Input 1:
	//8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
	//Sample Output 1:
	//2 5 6 7 8 10

package Binary_Search_Tree_To_Sorted_LL;
import java.util.*;

public class BST_to_Sorted_LL {

	public static void print(LinkedListNode<Integer>head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}

	public static linkelistuse constructLinkedList_head(BinaryTreeNode<Integer> root){
		if(root == null){
			linkelistuse solution = new linkelistuse();
			solution.head = null;
			solution.tail = null;
			return solution;
		}

		linkelistuse solution_l = constructLinkedList_head(root.left);
		linkelistuse solution_r = constructLinkedList_head(root.right);
		LinkedListNode<Integer> node = new LinkedListNode<Integer>(root.data);

		linkelistuse ans = new linkelistuse();
		if(solution_l.head != null){
			solution_l.tail.next = node;
			ans.head = solution_l.head;
		}
		else{
			ans.head = node;
		}

		if(solution_r.head != null){
			node.next = solution_r.head;
			ans.tail = solution_r.tail;
		}
		else{
			ans.tail = node;
		}
		return ans;
	}

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root){
		//your code start from here
		return constructLinkedList_head(root).head;
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
		// TODO Auto-generated method sub
		BinaryTreeNode<Integer> root = takeInput();
		LinkedListNode<Integer> head = constructLinkedList(root);
		print(head);

	}
	static class linkelistuse{
		LinkedListNode<Integer> head;
		LinkedListNode<Integer> tail;
	}

}
