package GenericTree;

public class TreeFunction {

	
	 // now creating the printing function 
	public void printTree(TreeNode<Integer>root) {
		
		// now printing the data 
		System.out.print(root.data+" ");
		// now creating the loop 
		for (int i = 0; i < root.childeren.size(); i++) {
			// now creating the refrence of the tree 
			TreeNode<Integer>node = root.childeren.get(i);
			printTree(node);
		}
	}
}
