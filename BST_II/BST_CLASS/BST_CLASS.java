package BST_CLASS;

import BST_CHECK_BINARY_TREE.input_print_checkbst_function;

public class BST_CLASS {
	
	// crating the two private member 
	private BinaryTreeNode<Integer>root ; 
	private int size; 
	
	
	// NOW creating the function 
	// creating the helper function of the below function 
	public boolean isPresentHelper(BinaryTreeNode<Integer>node ,int x  ) {
		// creating the base condition 
		if (node == null) {
			return false ; 
		}
		
		// now creating the condition 
		
		if (node.data == x) {
			return true ; 
		}
		
		// now calling the both side according 
		if (root.data > x ) {
			// now caling the left side 
			return isPresentHelper(node.left, x) ; 
		}else {
			return isPresentHelper(node.right, x) ; 
		}
		
		
	}
	
	// now creating the function for the insurt 
	public boolean isPresent(int x) {
		
		// now calling the helper function 
		return isPresentHelper(root, x) ; 
		
	}
	
	// now creating again insurt function  fuction 
	
	public void insert(int x ) {
		
		// now creating the helper function 
		root = insertHelper(root, x) ; 
		// now increasing the size 
		size++ ; 
		
	} 
	
	// now now creating the helper function 
	private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer>root , int x ) {
		
		// creating the base condition 
		// two concept are working if bigger the root the attach with the right side and other wise 
		// attech with left side 
		if (root == null ) {
			// creating the new node object 
			BinaryTreeNode<Integer>newNode = new BinaryTreeNode<Integer>(x) ; 
			return newNode ; 
		}
		
		// now creating the condition of the calling the left and right side and linking 
		if (x >= root.data) {
			// now calling the right side 
			root.right = insertHelper(root.right, x) ; 
		}else {
			root.left = insertHelper(root.left , x);
		}
		return root ; 
		
	}
	
	
	
	// now creating the print function 
	public void print() {
		
		printHelpers(root);
	}
	
	// creating the helper function 
	private void printHelpers(BinaryTreeNode<Integer>root) {
		
		// now creating the base condition 
		if (root == null ) {
			return ; 
		}
		
		
		System.out.println("root : "+root.data);
		
		// now printing the left and right side 
		if (root.left != null) {
			System.out.println("L :"+root.left.data);
		}
		// creating the second condition for the right side 
		if (root.right != null) {
			System.out.println("R :"+root.right.data);
		}
		
		// now creating for the spcae 
		System.out.println(); 
		
		// now calling the lef side and the right side 
		printHelpers(root.left);
		printHelpers(root.right);
		
	}
	
	
	// now creating the delete function for the deleting the value 
	public boolean deletedata(int x) {
		bst_delete_return object = deletedataHelper(root, x) ; 
		root = object.root ; 
		if (object.deleted) {
			size-- ; 
		}
		return  object.deleted ; 
		
		
	}
	
	// creating the helper function of the delete data 
	private static  bst_delete_return deletedataHelper(BinaryTreeNode<Integer>root , int x) {
		
		 if (root == null ) {
			return new bst_delete_return(null, false);
		}
		 
		 
		 
		 
		 if (root.data < x ) {
				bst_delete_return newrootRight = deletedataHelper(root.right, x);
				root.right = newrootRight.root ; 
				newrootRight.root = root ; 
				return newrootRight ; 
			}
		 
		   if (root.data > x ) {
			
			 bst_delete_return newrootLeft = deletedataHelper(root.left, x);
			 root.left = newrootLeft.root ;
			 newrootLeft.root = root ;  
			 return newrootLeft ; 
		}
		   
		   
		   // now creating for the zero chiledren 
		   if (root.left == null && root.right == null ) {
			return new bst_delete_return(null, true) ; 
		}
		   // if left childeren present 
		   if (root.left != null && root.right == null) {
			return new bst_delete_return(root.left, true) ; 
		}
		   
		   // if the right childeren present 
		   if (root.right != null && root.left == null) {
			return new bst_delete_return(root.right, true) ; 
		}
		   
		   // if the both children are the present 
		   int min =  mimum_forDeletion(root.right);
		   root.data = min ; 
		   bst_delete_return outputright = deletedataHelper(root.right, min) ; 
		   root.right = outputright.root ; 
		   return new bst_delete_return(root, true);
		   
		
	}
	
	
	// crating  the minimum function 
	private static int  mimum_forDeletion(BinaryTreeNode<Integer>root) {
		
		if (root == null) {
			return Integer.MAX_VALUE ; 
		}
		
		// now calling left and right side 
		int leftmin = mimum_forDeletion(root.left);
		int rightmin = mimum_forDeletion(root.right) ; 
		
		// now return the function of the three node 
		return Math.min(root.data, Math.min(leftmin, rightmin)) ; 
		
		
	}
	
	


}
