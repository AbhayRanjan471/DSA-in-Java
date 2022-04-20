package Binary_Trees;

public class BinaryTreeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
	    root.left = node1; // node1 is store at the left node
	    BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
	    root.right = node2; // node2 is store at the right node
	}

}
