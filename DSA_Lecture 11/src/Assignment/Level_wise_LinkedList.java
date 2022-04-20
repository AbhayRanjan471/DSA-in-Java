package Assignment;
import java.util.*;

//import LInkedList_Question.Node;
//import java.util.ArrayList;
//import java.util.LinkedList;
public class Level_wise_LinkedList {

	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){ 
		if (root == null) {
			return null;
		}
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<BinaryTreeNode<Integer>>(); 
		pendingNodes.add(root); 

		int currentLevelRemaining = 1;
		int nextLevelCount = 0;

		LinkedListNode<Integer> currentLevelHead = null;
		LinkedListNode<Integer> currentLevelTail = null; 

		ArrayList<LinkedListNode<Integer>> output = new ArrayList<>();

		while (!pendingNodes.isEmpty()) { 
			BinaryTreeNode<Integer> currentNode; 
			currentNode = pendingNodes.remove(); 
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(currentNode.data);

			if (currentLevelHead == null) {
				currentLevelHead = newNode; currentLevelTail = newNode;
			} else {
				currentLevelTail.next = newNode; 
				currentLevelTail = newNode;
			} if (currentNode.left != null) {
				pendingNodes.add(currentNode.left);
				nextLevelCount++; 
			} if (currentNode.right != null) { 
				pendingNodes.add(currentNode.right);
				nextLevelCount++;
			} 
			currentLevelRemaining--;

			if (currentLevelRemaining == 0) { 

				output.add(currentLevelHead);
				currentLevelHead = null;
				currentLevelTail = null;
				currentLevelRemaining = nextLevelCount; 
				nextLevelCount=0; 
			}
		} 
		return output; 
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
		ArrayList<LinkedListNode<Integer>> arr = constructLinkedListForEachLevel(root);
		
		//printing the arrayList which contain the head of the LinkedList
		for( int i =0 ; i < arr.size() ; i++) {//Traversing over the arrayList
			
			LinkedListNode<Integer>temp = arr.get(i);//creating the LinkedListNode are storing the head of the LinkedList			 
			while(temp != null) {//traversing over the LikedList
				System.out.print(temp.data +" ");
				temp = temp.next;
			}
			System.out.println();
			//System.out.println(arr.get(i).data);
			
		}

	}

}
