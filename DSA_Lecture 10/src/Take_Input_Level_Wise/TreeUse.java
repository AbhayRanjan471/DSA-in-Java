package Take_Input_Level_Wise;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
//import java.util.*;

public class TreeUse {
	
	public static void print(TreeNode<Integer> root) {
		// printing the root
		  System.out.println(root.data);
	        Queue<TreeNode<Integer>> pendingNodes= new LinkedList<>();
	        for(int i=0; i<root.children.size(); i++){ // printing the child of the root and inserting it into the Queue
	            System.out.print(root.children.get(i).data + " ");
	            pendingNodes.add(root.children.get(i));//inserting children into the queue
	        }
	        TreeNode<Integer> node = new TreeNode<Integer>(-1);//initially inserting -1 in the node
	        pendingNodes.add(node);
	        System.out.println();
	        
	        // Now here we are printing the children
			while(!pendingNodes.isEmpty()){
	            
	            TreeNode<Integer> frontNode= pendingNodes.poll();
	            if(frontNode==node){
	                if(pendingNodes.isEmpty()){
	                    break;
	                }
	                else{
	                    pendingNodes.add(node);
	                    System.out.println();
	                }
	            }
	            for(int i=0; i<frontNode.children.size(); i++){
	                System.out.print(frontNode.children.get(i).data+ " ");
	                pendingNodes.add(frontNode.children.get(i));
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
			//	Step 1 : creating a Queue in which we will insert the roots
			//	step 2 : take out the root from the Queue and ask no. of children it has
			//	step 3 : create TreeNode and insert the value of child
			//	step 4 : connecting child with the root (or with there parents)
			//	step 5 : inserting the child in the Queue to know use kitne child hai
			//	step 6 : after doing this we will return root

}
