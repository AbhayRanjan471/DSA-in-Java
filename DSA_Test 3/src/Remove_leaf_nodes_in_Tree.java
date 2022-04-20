import java.util.*;

 public class Remove_leaf_nodes_in_Tree {

	public static void print(TreeNode<Integer> root) {
		if(root == null) { // its a edge case 
			return;
		}
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
		queue.add(root);
		queue.add(nullNode);
		 
		while(queue.size() != 1) {
 
			TreeNode<Integer> temp = queue.poll();
			String s = temp.data +":";
			if(temp == nullNode) {
				queue.add(nullNode);
				 
				continue;
			}
			for(int i =0 ; i< temp.children.size(); i++) {
				 
				s += temp.children.get(i).data + ",";
				queue.add(temp.children.get(i));
			}
			System.out.println(s);
		}
	}
	
	public static TreeNode<Integer> removeLeafNodes (TreeNode<Integer> root){
		if(root == null || root.children.size() == 0) {
			return null;
		}
		ArrayList<Integer> Indexes = new ArrayList<Integer>();
		for(int i =0 ; i< root.children.size() ; i++) {
			TreeNode<Integer> child = root.children.get(i);
			if(child.children.size() == 0) {
				Indexes.add(i);
			}
		}
		for(int i = Indexes.size() - 1 ; i >= 0 ; i--) {
			int j = Indexes.get(i);
			root.children.remove(j);
		}
		for(int i = 0 ; i < root.children.size() ; i++) {
			TreeNode<Integer> child = removeLeafNodes(root.children.get(i));
			if(child == null) {
				root.children.remove(i);
			}
		}
		return root;
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
		 TreeNode<Integer> root = takeInput();
		 root = removeLeafNodes(root);
		 print(root);

	}
 }

