package dyacmacllyTakingInput;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import BinaryTree.BalancedTreeReturn;
import BinaryTree.BinaryTreeNode;

public class BinaryTree {
	
	// lets creating the input function 
	
	public static BinnaryTreeNode<Integer>BinaryTreeInput (){
		// now creating the some basic codtion 
		// print something for the display for the user 
		System.out.println("enter root : ");
		// creating the object of the scanner 
		Scanner input = new Scanner(System.in) ; 
		
		// now taking the input inthe integer form 
		int rootDeta  = input.nextInt() ; 
		// now creating the object of the node mean creating the parent node 
		
		// now writing the base cindition 
		if (rootDeta == -1 ) {
			return null ; 
		}
		
		
		
		BinnaryTreeNode<Integer>root = new BinnaryTreeNode<Integer>(rootDeta) ; 
		
		// now again creting the two refrencre 
		BinnaryTreeNode<Integer>leftnode = BinaryTreeInput() ; 
		// now again creating the different refreance like right node 
		BinnaryTreeNode<Integer>RightNode = BinaryTreeInput() ; 
		
		
		// now crating the linking process 
		
		root.leftNode  = leftnode ; 
		root.RightNode = RightNode ; 
		
		// now we are return the root node that is parent node of the left and right child 
		return root ; 
		
		
		
		
		
	}
	
	// now creating the fucntion of the printing 
	
	public static void printBinaryTree (BinnaryTreeNode<Integer>root) {
		
		// fist wea are crating the base condtion 
		
		if (root == null ) {
			return  ; 
		}
		
		
		// after the creating the base condtion 
		// we are printng the root deta 
		System.out.print(root.data +" : ");
		
		// now creating the some condition for the 
		if (root.leftNode != null ) {
		System.out.print(" L : "+ root.leftNode.data +" , ");	
		}
		// again creating the second condition for the 
		if (root.RightNode != null ) {
			System.out.print(" R "+ root.RightNode.data+" , ");
		}
		
		System.out.println();
		
		
		// NOW calling the function  
		printBinaryTree(root.leftNode);
		// again calling the funcion for the right node 
		printBinaryTree(root.RightNode);
		
	}

	
	// now creating the new function for the taking taking input isly 
	
	public static BinnaryTreeNode<Integer> takeinputBinaryTree( boolean isRoot , int parent , boolean isLeft){
		
		// we are the using the two boolean function 
		
		if (isRoot) {
			// now printing the simple user display 
			System.out.println("Ener the root : ");
		}else if (isLeft) {
			System.out.println("Enter left node "+ parent);
		}else {
			System.out.println("Enter Right node "+ parent);
		}
		
		
		
		// now creating the scanner function 
		
		Scanner input = new Scanner(System.in) ; 
		// now taking user for the input 
		int rootdeta = input.nextInt();
		
		// now creating the condition 
		if (rootdeta == -1) {
			return null ; 
		}
		
		// now creating the object 
		
		BinnaryTreeNode<Integer>root = new BinnaryTreeNode<Integer>(rootdeta) ; 
		
		// now calling the function  nad creating the refrence 
		
		BinnaryTreeNode<Integer>LeftNode = takeinputBinaryTree(false, rootdeta, true) ;
		// now creating the refrence for the right node 
		BinnaryTreeNode<Integer>RightNode = takeinputBinaryTree(false, rootdeta, false);
		
		// now creating the the linking process 
		
		root.leftNode = LeftNode ; 
		root.RightNode = RightNode ; 
		
		
		// now return the function 
		return root ; 
		
	
		
	
		
		
		
	}
	
	// NOW CREATING TEH FUCNTION OF THE INPUT LEAVEL WISE 
	//
	
	public static BinaryTreeNode<Integer>inputLavelwise(){
		
		// creating the scanner function 
		Scanner input = new Scanner(System.in) ; 
		// display for the user 
		System.out.println("enter the root ");
		int rootdata  = input.nextInt();		
		// now creating the condtion 
		if (rootdata == -1) {
			// creating the display 
			// creating the object 
			return null ; 
			// now creating the queue 
			
		}
		BinaryTreeNode<Integer>root = new BinaryTreeNode<Integer>(rootdata) ; 
		Queue<BinaryTreeNode<Integer>> pendingchildnode =  new LinkedList<BinaryTreeNode<Integer>>();
		
		// now add data 
	      pendingchildnode.add(root) ; 

		
		// now creating the condtion  name = new ();
		// now creating loop 
		while (!pendingchildnode.isEmpty()) {
			// creating the refrence 
			BinaryTreeNode< Integer > front  = pendingchildnode.poll() ; 
			// now creating for the left node 
			System.out.println("enter the left node "+root.data);
			int leftnodedata = input.nextInt();
			// now creaing the condtion 
			
			if (leftnodedata != -1) {
				// now creating the new node for the store left 
				BinaryTreeNode<Integer>leftnode = new BinaryTreeNode<Integer>(leftnodedata);
				// now creating the linking 
				front.LeftNode = leftnode ; 
				// now add in the pending child 
				pendingchildnode.add(leftnode) ; 
			}
			
			// now creating the condtion for the right node 
			
			System.out.println("enter the right node "+front.data);
			int rightnodedata = input.nextInt() ; 
			// now creating the condtion 
			if (rightnodedata != -1) {
				// now creating the new node for the right node 
				BinaryTreeNode<Integer>rightnode = new BinaryTreeNode<Integer>(rightnodedata) ; 
				front.RightNode = rightnode ; 
				pendingchildnode.add(rightnode) ; 
			}
		}
		
		return root ;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BinnaryTreeNode<Integer>shivam = BinaryTreeInput() ; 
//		// calling FOR THE PRINTG 
//		printBinaryTree(shivam);
		
		BinnaryTreeNode<Integer>itisha = takeinputBinaryTree(true, 0, false) ; 
		
		// creating the printing function 
		printBinaryTree(itisha);

	}

}
