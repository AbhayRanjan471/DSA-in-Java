import java.util.ArrayList;


public class TreeNode<T> {
	T data ;
	ArrayList<TreeNode<T>>children ; //creating an ArrayList to store "children" and every children will be of type 'TreeNode' 
                                    //and bcz TreeNode is of type <T> therefore its children will also be having type<T>
	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<TreeNode<T>>(); // a new ArrayList has been created of name 'children'
		          // shortcut key:- Arraylis + ctrl + space
	}

}
