package TREES;
import java.util.*;

public class Take_Input_nd_print_Recursive {
	public static void print (TreeNode<Integer> root) {
		String s = root.data +":";
		
		for(int i =0; i < root.children.size(); i++) {
			s += root.children.get(i).data + ",";
			}
		System.out.println(s);
		for(int i =0 ; i< root.children.size(); i++) {
			print(root.children.get(i));
		}

	}

	public static TreeNode<Integer> takeInput(Scanner s){
		System.out.println("Enter the next node");
		int n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);

		System.out.println("Enter the no. of children of "+ n);
		int childCount = s.nextInt();

		for(int i = 0; i< childCount ; i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TreeNode<Integer> root = takeInput(s);
		print(root);

	}

}
