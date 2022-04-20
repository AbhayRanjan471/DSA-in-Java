package Take_Input_nd_Print_Recursive;
import java.util.Scanner; // or import java.util.*;

public class TreeUse {

	public static TreeNode<Integer> takeInput(Scanner s){
		//Step 1: enter the root
		//Step 2: enter the no. of children of root
		//Step 3: we will call recursively over every child 
		//step 4: connect children with root

		int n;
		
		//creating roots
		System.out.println("Enter the next node");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<>(n);

		//creating its child
		System.out.println("Enter the number of children for " + n);
		int childCount = s.nextInt();

		//Now for every children we will call the takeInput() function
		for(int i =0 ; i < childCount ; i++) {
			TreeNode<Integer> child = takeInput(s); // recursive call for every child
			root.children.add(child); // here we are connecting the children with there parent that is "root"
		}
		return root;
	}
	public static void print(TreeNode<Integer>root) {
		String s = root.data + ":"; // storing the root data;
		//now storing all its child
		for(int i = 0 ; i< root.children.size(); i++) {
			s = s + root.children.get(i).data + ","; // root ke children ka 'i'th position ka data
		}
		System.out.println(s);// printing the root

		//Now recursively calling over every child
		for(int i = 0 ; i< root.children.size() ; i++) {
			print(root.children.get(i));
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		TreeNode<Integer> root = takeInput(s);
		print(root);
	}

}
