package BST;

import java.util.Scanner;

public class fuctionbinarytree {
	
	// creating the all function of the node 
	// creating the take function ]
	// 	creating the function of the teching the input 
	
	
	public BinnarySearchTreeNode<Integer>takeinput(boolean isRoot , int Present , boolean rootleft){
		
		// creating the condition 
		if (isRoot) {
			System.out.println("enter the root : ");
		}else if(rootleft) {
			System.out.println("enter the leftnode : "+Present);
		}else {
			System.out.println("enter the rightndoe : "+Present);
		}
		
		// creating the scanner function 
		Scanner input = new Scanner(System.in);
		
		int rootdata = input.nextInt();
		
		if (rootdata == -1) {
			return null ; 
		}
		
		// now creating the scanner function 
		
		// creating the object for the node 
		BinnarySearchTreeNode<Integer>node = new BinnarySearchTreeNode<Integer>(rootdata) ; 
		// now creating again new node 
		BinnarySearchTreeNode<Integer>leftnode = takeinput(false, rootdata, true) ;
		BinnarySearchTreeNode<Integer>rightnode = takeinput(false, rootdata, false);
		
		// now creating the linking process 
		
		node.leftnode = leftnode ; 
		node.rightnode = rightnode ; 
		
		// now creating the return function 
		return node ; 
		
		
		
		
		
		
	}
	
	// now creating the printing function 
	
	public void Bst_pritnt(BinnarySearchTreeNode<Integer>root) {
		
		// checking the root node is empty or not 
		
		if (root == null) {
			return  ; 
		}
		
		// now again creating the  algorithum 
		 // now printing the left 
		
		// now printing the root 
		System.out.println("root : "+root.data);
		
		if (root.leftnode != null) {
			System.out.println(" L : " +root.leftnode.data);
		}
		// now again printing the right node 
		if (root.rightnode != null ) {
			System.out.println(" R : " +root.rightnode.data);
		}
		
		System.out.print();
		
		
		// AGAIN CALLING THE FUNCTION 
		Bst_pritnt(root.leftnode);
		Bst_pritnt(root.rightnode);
		
	}

}
