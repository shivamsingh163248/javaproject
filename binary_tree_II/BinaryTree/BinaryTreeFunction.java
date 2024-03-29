package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;






public class BinaryTreeFunction {
	
	// creating the function of the taking the input 
	
	public BinaryTreeNode<Integer>TakeInput(boolean isRoot , int parent , boolean isLeft){
		
		// creating the print function 
		// creating the print function 
	if (isRoot) {
		System.out.println("enter the root : - ");
	}else if (isLeft) {
		System.out.println("enter the Left node of "+parent);
	}else {
		System.out.println("enter the Right Node of "+parent);
	}
	
	// now creating the condtion 
	// creating the scanner
	Scanner input = new Scanner(System.in) ; 
	
	// now taking the input 
	int rootDeta = input.nextInt();
	
	// now creating the condition 
	if (rootDeta == -1) {
		return null; 
	}
	
	
	// now now calling the function 
	
	BinaryTreeNode<Integer>root = new BinaryTreeNode<Integer>(rootDeta) ; 
	
	// now calling the node 
	
	// now calling the left and right node 
	BinaryTreeNode<Integer>leftNode = TakeInput(false, rootDeta, true);
	// now calling the for the right node 
	BinaryTreeNode<Integer>RightNode = TakeInput(false, rootDeta, false);
	
	
	// now  linking process 
	
	root.LeftNode = leftNode ; 
	root.RightNode = RightNode ; 
	
	// now return function 
	
	return root ; 
	
	
	
	}
	
	// now creating the function of the oputput 
	public void PrintBinaryTree(BinaryTreeNode<Integer>root) {
		
		// now creating the base function 
		if (root == null) {
		 return  ; 
		}
		
		// now print function 
		
	// calling the function 
		System.out.print(root.data+" : ");
		
		if (root.LeftNode != null) {
			System.out.print("L : "+ root.LeftNode.data +" , ");
		}
		if (root.RightNode != null) {
			System.out.print("R : "+ root.RightNode.data + " , ");
		}
		
		System.out.println();
		
		PrintBinaryTree(root.LeftNode);
		PrintBinaryTree(root.RightNode);
		
	}
	
	
	// now creating the function of the size of the node 
	
	public int deftNode(BinaryTreeNode<Integer>root) {
		// creating the base condtion 
		if (root == null) {
			return 0 ; 
		}
		
		int left = deftNode(root.LeftNode) ; 
		int right = deftNode(root.RightNode) ; 
		
		// now size 
		if (left > right) {
		   return left +1  ; 	
		}else {
			return right+1 ; 
		}
		
		
		
	}
	
	
	// again creatig the total number of the node 
	
	public int totalNode(BinaryTreeNode<Integer>root) {
		// creating the base condition 
		if (root == null) {
			return 0 ; 
		}
		
		
		// now calling the both of the node 
		int leftnode = totalNode(root.LeftNode) ; 
		int rightnode = totalNode(root.RightNode) ; 
		
		return 1 + leftnode+rightnode ; 
		
	}
	
	// creating the function printing the leaf node 
	
	public int  totalLeafNode(BinaryTreeNode<Integer>root) {
		
		// creating the base condition 
		if (root == null ) {
			return 0 ; 
		}
		
		// creating the condtition 
		if (root.LeftNode == null && root.RightNode == null) {
			return 1 ; 
		}
		
		// now calling the function 
		int left = totalLeafNode(root.LeftNode) ; 
		int right = totalLeafNode(root.RightNode) ; 
		
		// now return the fucntion 
		return left+right ; 
		
	}
	
	
	// creating thr function of the at deft k node 
	
	public void printATk(BinaryTreeNode<Integer>root , int k) {
		
		
		// creating the base condition 
		if (root == null) {
			return  ; 
		}
		
		if (k == 0 ) {
			System.out.println(root.data);
			return  ; 
		}
		
		
		// calling the root left and right 
		printATk(root.LeftNode, k-1);
		printATk(root.RightNode, k-1);
		
		
		
			}
	
	
	
	// creating the function remove the leaf node  
	
	public BinaryTreeNode<Integer> RemoveLefeNode (BinaryTreeNode<Integer>root){
		
		// creating the base condition 
		if (root == null) {
			return null ; 
		}
		// now creating the condtion for the left and right 
		if (root.LeftNode == null && root.RightNode == null) {
			// now return the null 
			return null ; 
		}
		
		// now calling the both left and right root and left node '
		root.LeftNode = RemoveLefeNode(root.LeftNode) ; 
		root.RightNode = RemoveLefeNode(root.RightNode) ; 
		
		
		// now return the node 
		return root ; 
		
		
		
	}
	
	// now creating the function lavel wise inputtree 
	
	public static BinaryTreeNode<Integer> InputLavelWise(){
		
		Scanner input = new Scanner(System.in) ; 
		// for the user display 
		System.out.println("enter the root");
		int rootdata = input.nextInt();
		
		// creating the condtion 
		if (rootdata == -1 ) {
			return null ; 
		}
		
		// now crreating the refrence of the node of the tree 
		BinaryTreeNode<Integer>root = new BinaryTreeNode<Integer>(rootdata) ; 
		// now creating the queue using the collection 
		Queue<BinaryTreeNode<Integer>>pendigChilderen = new  LinkedList<BinaryTreeNode<Integer>>();
		// now adding the object of the refrence of the node 
		pendigChilderen.add(root);
		
		// now creating the while loop for again again time to take input 
		while (!pendigChilderen.isEmpty()) {
			// taeking the input for theleft of the linklist 
			// creating the object for the front 
			BinaryTreeNode<Integer>front = pendigChilderen.poll() ; 
			// now user creating the for the display 
			System.out.println("enter the left node "+front.data);
			// taking the input 
			int leftnodedata = input.nextInt() ; 
			
			// checking the condition input is the -1 or not 
			if (leftnodedata != -1) {
				// now creating the left node for the storing the deta of the laft node 
				BinaryTreeNode<Integer>leftnode = new BinaryTreeNode<Integer>(leftnodedata) ; 
				// now creating the linking 
				front.LeftNode = leftnode ; 
				// now add the node refrence int the queu 
				pendigChilderen.add(leftnode);
			}
			
			// now right condition for the same for the right 
			// creating the pritn function for the user display 
			System.out.println("enter the right node data "+front.data);
			// take input from the user 
			int rightdata = input.nextInt() ; 
			
			// now creating the if condtion if user enter the -1 the not store any value 
			if (rightdata != -1 ) {
				// now creating the object for the right node 
				BinaryTreeNode<Integer>RIghtnode = new BinaryTreeNode<Integer>(rightdata) ; 
				// now linkin process 
				front.RightNode = RIghtnode ; 
				// now this node add in the queue 
				pendigChilderen.add(RIghtnode) ; 
			}
			
		}
		
		return root ; 
		
	}
	
	
	// creating the function for the lavel wise uup
	
	// creating the function for the lavel wise printing 
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		// creating the base condition 
		if (root == null) {
			return ; 
		}

     // creating the while loop 
	 // creating the queue 
	 Queue<BinaryTreeNode<Integer>> pendingnode = new LinkedList<BinaryTreeNode<Integer>>();
	 // pulll 
	 pendingnode.add(root) ; 

	 // now creating the while loop 
	 while (!pendingnode.isEmpty()) {

		 // creating the frefence 
		 BinaryTreeNode<Integer> front = pendingnode.poll() ; 
		 
		 System.out.print(front.data+":");
		 

		 if (front.LeftNode != null ) {

			 System.out.print("L:"+front.LeftNode .data+"," );
			 // adding 
			 pendingnode.add(front.LeftNode) ; 
			 
		 }else{
			  System.out.print("L:-1,");
		 }


       	 if (front.RightNode != null ) {

			 System.out.print("R:"+front.RightNode.data );
			 // adding 
			 pendingnode.add(front.RightNode) ; 
			 
		 }else{
			  System.out.print("R:-1");
		 }
		 System.out.println();





	 }


	}
	
	
	

}
