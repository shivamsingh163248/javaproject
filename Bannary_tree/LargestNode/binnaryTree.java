package LargestNode;

import FindNumberNodeBinaryTree.BinaryTree;
import FindNumberNodeBinaryTree.BinnaryTreeNode;

public class binnaryTree {
	
	// creating the function of the number of the node 
	// creating the function of the sum of the data 

	// creating function of the largest node 
	public static int numberNode (BinnaryTreeNode<Integer>root) {
		
		// now creating the base condtiton 
		if (root == null ) {
			return 0 ; 
		}

		// now creating the function 
		// calling the dunction 
		int leftnode = numberNode(root.leftNode);
		// agian creaing for the right 
		int rightnode = numberNode(root.RightNode);
		
		// now return 
		return 1+ leftnode+rightnode ; 
		
	}
	
	
	// mow creating the sum of the deta function 
	
	public static int sumNode(BinnaryTreeNode<Integer>root) {
		
		// creating the base condtion due to using the recosrion for the solving 
		if (root== null) {
			return 0 ;
		}
		
		// now calling the functiion 
		int left = sumNode(root.leftNode) ; 
		int right = sumNode(root.RightNode) ; 
		
		// now creating the return function 
		return left + right + root.data ; 
		
		
		
		
	}
	
	// again now creating the function of the larget number 
	
	public static int largestNode(BinnaryTreeNode<Integer>root) {
		
		// creating the base condition 
		if (root == null ) {
			return 0 ; 
		}
		
		// mow calling the function 
		
		int leftNode = largestNode(root.leftNode);
		int rightNode = largestNode(root.RightNode) ; 
		
		
		// now writing the return statement 
		return Math.max(root.data, Math.max(leftNode, rightNode)) ; 
		
		
	}
	
	// now creating the two function 
	// hight of the binnary tree 
	// number of the leif node 
	
	// creating the hight 
	public static int hight(BinnaryTreeNode<Integer>root) {
		
		// frist creating the base condtion 
		if (root == null ) {
			return 0 ; 
		}
		
		// mow calling the both node right check which is the bigger 
		
		int LeftNode = hight(root.leftNode) ; 
		// now calling the right node 
		int RightNode = hight(root.RightNode) ; 
		
		// now chek which one is the big 
		
		if (LeftNode > RightNode) {
			return LeftNode+1 ; 
		}else {
			return RightNode+1 ; 
		}
	}
	
	 // creating the second fucntion 
	public static int NumberLeafNode(BinnaryTreeNode<Integer>root) {
		
		// now creating the base condtion 
		if (root == null ) {
			return 0 ; 
		}
		
		// now creating the condtion 
		
		if (root.leftNode == null && root.RightNode == null) {
			return 1 ; 
		}
		
		// now calling the both 
		int left = numberNode(root.leftNode) ; 
		int right = numberNode(root.RightNode) ; 
		
		
		// now return the function 
		return left+right ; 
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		// now creating object 
		
		BinaryTree itisha = new BinaryTree() ; 
		
		// now creating a refeance for the storing node 
		BinnaryTreeNode<Integer>shivam = itisha.takeinputBinaryTree(true, 0, false);
		
		System.out.println("---------------------------");
		// creating the print function 
		itisha.printBinaryTree(shivam);
		
		System.out.println(" number of the node -------------------------");

		numberNode(shivam) ; 
		System.out.println(numberNode(shivam));
		System.out.println("sum of the node");
		sumNode(shivam) ;
		System.out.println(sumNode(shivam) );
		System.out.println("largest node ");
		
		largestNode(shivam) ; 
		System.out.println(largestNode(shivam) );
		
		
		// calling the two function for the finding the number 
		System.out.println("hight of the binnary treee");
		
		System.out.println(hight(shivam));
	 System.out.println("number of the leaf node");
	 System.out.println(numberNode(shivam));
		
		
		
	}

}