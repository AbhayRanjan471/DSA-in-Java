package Take_Tree_Input_nd_Print;

 import java.util.Scanner;

public class TakeTreeInput_nd_PrintRecursively {
	
	public static void printTree(BinaryTreeNode<Integer>root) {
		if(root == null) {// base case
			return;
		}
		String toBePrinted = root.data + ":";//to convert root.data into String we have appended empty string ""
		if(root.left != null) {
			toBePrinted += "L:" + root.left.data +"," ; // root ke left ka data
		}
		if(root.right != null) {
			toBePrinted += "R:" + root.right.data; // root ke right ka data
		}
		System.out.println(toBePrinted);
		//now recursion will do its work
		printTree(root.left);
		printTree(root.right);
	}
	public static BinaryTreeNode<Integer> takeInput(Scanner s){
		int rootData; // at first step we will ask user to input rootData
		System.out.println("Enter root data");
		rootData = s.nextInt();
		
		//if the user want to make a NULL tree he will pass -1
		// or if he want left or right node to be NULL he will pass -1
		if(rootData == -1) { // base case
			return null;
		}
		//if thats not the case then we should create our Binary tree
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(s); //to input value on root ke left node
		root.right = takeInput(s); //to input value on root's right node
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(s);
		printTree(root);
		s.close(); // when whole work is done we can close the Scanner

	}

}
