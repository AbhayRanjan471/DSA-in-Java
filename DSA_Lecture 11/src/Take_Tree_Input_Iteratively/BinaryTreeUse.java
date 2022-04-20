package Take_Tree_Input_Iteratively;
import java.util.Scanner;
 
public class BinaryTreeUse {
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) { // its a edge case 
			return;
		}
		QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<>();
		BinaryTreeNode<Integer> nullNode = new BinaryTreeNode<Integer>(Integer.MIN_VALUE);
		queue.enqueue(root);
		queue.enqueue(nullNode);
		//System.out.println(root.data);
		while(queue.size() != 1) {
			String toBePrinted ="";
			BinaryTreeNode<Integer> temp = null;
			try {
				temp = queue.dequeue();
			      toBePrinted = temp.data +" : ";
			} catch (QueueEmptyException e) {
				 //should not come here
			}
			if(temp == nullNode) {
				queue.enqueue(nullNode);
				//System.out.println();
				continue;
			}
			if(temp.left != null) {
				toBePrinted += "L:" + temp.left.data +"," ; // root ke left ka data
				queue.enqueue(temp.left);
			}
			if(temp.right != null) {
				toBePrinted += "R:" + temp.right.data; // root ke right ka data
				queue.enqueue(temp.right);
			}
			System.out.println(toBePrinted);
			
 
			 
			
			//System.out.println(s);
		}
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner (System.in);
		//we need a Queue inside which we will insert the BInary node
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>(); 
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		if(rootData == -1) { // edge case
			return null;
		}
		// creating a Binary node and inserting the rootData
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root); // inserting the root in the Queue , so that we can get its child
		
		while(! pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode;
			try {
				 frontNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of "+ frontNode.data);
			int leftChild = s.nextInt();
			//going to make node of liftChild only if
			if(leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(child);// child node ko hum pendingNodes me insert kre ge taki hume uske child ka pata chal ske
				frontNode.left = child ; // attach with the left node
				}
			// same work as done in leftCHild
			System.out.println("Enter right child of "+ frontNode.data);
			int rightChild = s.nextInt();
			//going to make node of rightChild only if
			if(rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);// child node ko hum pendingNodes me insert kre ge taki hume uske child ka pata chal ske
				frontNode.right = child ; // attach with the right node
				}
		}
		return root;
	}

	public static void main(String[] args) {

     BinaryTreeNode<Integer> root = takeInputLevelWise();
     printLevelWise(root);

	}

}
