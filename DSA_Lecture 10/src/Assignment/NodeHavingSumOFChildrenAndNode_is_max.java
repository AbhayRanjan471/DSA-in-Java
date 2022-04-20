//Given a tree, find and return the node for which sum of data of all children and the node itself 
//is maximum. In the sum, data of node itself and data of immediate children is to be taken.
	//Sample Input 1 :
	//5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
	//Sample Output 1 :
	//1

package Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NodeHavingSumOFChildrenAndNode_is_max {
	
	 static class Pair<T>{
	        TreeNode<T> node;
	        int sum;
	    }
	    
		public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
			//your code start from here
			return maxSumNodeHelper(root).node;
		}
	    
	    public static Pair<Integer> maxSumNodeHelper(TreeNode<Integer> root){
	        if(root==null) {
	            Pair<Integer> pair = new Pair<>();
	            pair.node = null;
	            pair.sum = Integer.MIN_VALUE;
	            return pair;
	        }
	        int sum = root.data;
	        for(TreeNode<Integer> child : root.children) {
	            sum += child.data;
	        }
	        Pair<Integer> ans = new Pair<>();
	        ans.node = root;
	        ans.sum = sum;
	        for(TreeNode<Integer> child : root.children) {
	            Pair<Integer> childAns = maxSumNodeHelper(child);
	            if(childAns.sum > ans.sum){
	                ans = childAns;
	            }
	        }
	        return ans;
	    }
	
	public static TreeNode<Integer> takeInput( ){
		  Scanner s = new Scanner(System.in);
			System.out.println("Enter the root");
			int rootData = s.nextInt();
			//creating a queue
			Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
			//creating a TReeNode to store rootData
			TreeNode<Integer> root = new TreeNode<Integer>(rootData);
			
			pendingNodes.add(root);
			
			while(! pendingNodes.isEmpty()) {
				TreeNode<Integer> frontNode = pendingNodes.poll();
				System.out.println("Enter number of chilfren of " + frontNode.data);
				int numChild = s.nextInt();
				
				for(int i = 0 ; i< numChild ; i++) {
					System.out.println("Enter the " +(i + 1) + "th child of "+frontNode.data);
					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					//connecting child with root
					frontNode.children.add(childNode);
					pendingNodes.add(childNode);
				}
			}
			return root;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode<Integer>root = takeInput();
		int value = maxSumNode(root).data;
		System.out.println("The Node having sum of all Children nd the node itself is max is : "+ value);
	}

}
