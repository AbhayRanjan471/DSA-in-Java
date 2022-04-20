package Take_Input_Level_Wise;

import java.util.Scanner;

public class TreeUse2 {
	
	// 1st method of printing (according to sir)
	public static void print(TreeNode<Integer> root) {
		if(root == null) { // its a edge case 
			return;
		}
		QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<>();
		TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
		queue.enqueue(root);
		queue.enqueue(nullNode);
		//System.out.println(root.data);
		while(queue.size() != 1) {
			String s ="";
			TreeNode<Integer> temp = null;
			try {
				temp = queue.dequeue();
			      s = temp.data +" : ";
			} catch (QueueEmptyException e) {
				 //should not come here
			}
			if(temp == nullNode) {
				queue.enqueue(nullNode);
				//System.out.println();
				continue;
			}
			for(int i =0 ; i< temp.children.size(); i++) {
				//System.out.print(pendingNodes.children.get(i).data + " ");
				s += temp.children.get(i).data + ",";
				queue.enqueue(temp.children.get(i));
			}
			System.out.println(s);
		}
	}
	//2nd way of printing the output (according to coding Ninja sol)
	public static void print_2nd_Way(TreeNode<Integer> root) {
		if(root == null) { // its a edge case 
			return;
		}
		QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<>();
		TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
		queue.enqueue(root);
		queue.enqueue(nullNode);
		System.out.println(root.data);
		
		while(queue.size() != 1) {
			 
			TreeNode<Integer> temp = null;
			try {
				temp = queue.dequeue();
			               
			} catch (QueueEmptyException e) {
				 //should not come here
			}
			if(temp == nullNode) {
				queue.enqueue(nullNode);
				System.out.println();
				continue;
			}
			for(int i =0 ; i< temp.children.size(); i++) {
				System.out.print(temp.children.get(i).data + " ");
				 queue.enqueue(temp.children.get(i));
			}
			 
		}
	}
	
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner (System.in);

		System.out.println("Enter the root");
		int rootData = s.nextInt();
		// creating a queue
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>(); //1.hum ak QueueUsingLL banaye ge jisme data <TreeNode> dale ge jiska type <Integer> hai
		TreeNode<Integer> root  = new TreeNode<Integer>(rootData);// using rootData we have created a TreeNode
		// here we have created the root 
		pendingNodes.enqueue(root);// here we have inserted the root in the Queue
		// now we will aks for its children
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();// queue me jo pada how hai ab hum use bahar nikale ge or uske children ko input kre ge queue me
				System.out.println("Enter num of children of " + frontNode.data);
				int numChildren = s.nextInt();// here we have taken the input ki kiske kitne children hai

				for(int i = 0 ; i< numChildren ; i++) {
					System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
					int child = s.nextInt(); //taking input the child
					//now creating a node and inserting the child
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					
					//now connecting children with root
					frontNode.children.add(childNode); // frontNode ka child hai to humne childNode to front node me add kr diya
					
					//now we will enqueue childNode in the Queue bcz childNode ke age ke child hume av nai pata hai to usse pata krne k liye
					pendingNodes.enqueue(childNode);//
				}
			} catch (QueueEmptyException e) {
				//  Shouldn't come here
				return null;
			}
		}
		return root;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeNode<Integer> root = takeInputLevelWise();
		print(root);
	}

}
