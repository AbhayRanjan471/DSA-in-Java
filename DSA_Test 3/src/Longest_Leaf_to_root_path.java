import java.util.*;
public class Longest_Leaf_to_root_path {
	

	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer>root){
		if(root == null) {
			return null;
		}
		if(root.left == null && root.right == null) {
			ArrayList<Integer> ans = new ArrayList<Integer>();
			ans.add(root.data);
			return ans;
		}
		ArrayList<Integer> leftans = longestRootToLeafPath(root.left);
		ArrayList<Integer> rightans = longestRootToLeafPath(root.right);
		
		if(leftans == null) {
			rightans.add(root.data);
			return rightans;
		}
		if(rightans == null) {
			leftans.add(root.data);
			return leftans;
		}
		if(leftans.size() > rightans.size()) {
			leftans.add(root.data);
			return leftans;
		}
		else {
			rightans.add(root.data);
			return rightans;
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
		 ArrayList<Integer> arr = longestRootToLeafPath(root);
		 
		 for(int i =0 ; i < arr.size() ; i++) {
			 System.out.println(arr.get(i));
		 }

	}

}
