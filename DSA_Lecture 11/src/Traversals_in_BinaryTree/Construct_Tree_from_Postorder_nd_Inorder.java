//For a given postorder and inorder traversal of a Binary Tree of type integer stored in an array/list, 
//create the binary tree using the given two arrays/lists. You just need to construct the tree and return the root.

package Traversals_in_BinaryTree;
import java.util.*;

public class Construct_Tree_from_Postorder_nd_Inorder {
	
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
	
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
        return getBuildTree(postOrder , inOrder ,0 ,postOrder.length-1 , 0 , inOrder.length-1);
	}
    
    public static BinaryTreeNode<Integer> getBuildTree(int postOrder[] , int inOrder[] ,int postS ,int postE , int inS ,int inE ){
      
        if(inS > inE || postS > postE){
            return null;
        }
        
        int rootData = postOrder[postE];//in post order root is in the last index
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        
        int k = 0;
        //searching rootData in In-order array
        for (int i = inS; i <= inE; i++) {
          if (rootData == inOrder[i]) {
            k = i;//storing the index of rootData
            break;
          }
        }
        root.left = getBuildTree(postOrder, inOrder, postS, postS + k - inS - 1, inS, k - 1);
        root.right = getBuildTree(postOrder, inOrder, postS + k - inS, postE - 1, k + 1, inE);
        return root;
    }
    
	public static void main(String[] args) {
		int postOrder[] = {4,5,2,6,7,3,1};
		int inOrder[] = {4,2,5,1,6,3,7};
		BinaryTreeNode<Integer> root = buildTree(postOrder , inOrder);
		print(root);

	}

}
