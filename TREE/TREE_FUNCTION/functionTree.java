package TREE_FUNCTION;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class functionTree {
	
	// creating the input and output function 
	
	// creating the level wise user input function 
	public TreeNode<Integer> LevelWiseInput(){
		
		// creating the root node 
		// creating the scanner function for the taking input from the user 
		Scanner input = new Scanner(System.in) ; 
		// now user display for the enter the node 
		System.out.print("enter the root node : ");
		int rootData = input.nextInt();
		
		if (rootData == -1) {
			return null ; 
		}
		
		// now creating the node for the creating the object of the node 
		TreeNode<Integer>rootNode = new TreeNode<Integer>(rootData) ; 
		// creating the  queue using the linklist 
		Queue<TreeNode<Integer>>pendingNode = new LinkedList<TreeNode<Integer>>() ; 
		// now adding the root node in the pending node 
		pendingNode.add(rootNode) ; 
		
		// now creating the while loop when queue in null 
		
		while (!pendingNode.isEmpty()) {
			
			// now creating the another refrence  of the node 
			// for the polling of the node 
			TreeNode<Integer>CurrentNode = pendingNode.poll() ; 
			// now creating the size of child of the root node 
			System.out.println("enter the size of child node of root node "+CurrentNode.Data) ; 
			int sizeChildNode = input.nextInt();
			
			// now creating the loop 
			for (int i = 0; i < sizeChildNode; i++) {
				
				// now  creating the add in the child node 
				// now creating the new node 
				System.out.println("enter node "+i);
				int childData = input.nextInt();
				
				// creating the  child node 
				TreeNode<Integer>childNode = new TreeNode<Integer>(childData) ; 
				// now adding the data in the pending node 
				pendingNode.add(childNode) ; 
				// now adding the data in the root children 
				CurrentNode.children.add(childNode) ; 
			}
			
			
			
			
		} 
		
		return rootNode ; 
		
		
		
		
	}
	
	// creating the function for the finding the leaf node in tree 
	// they are the return the integer 
	public int CountLeafNode(TreeNode<Integer>root) {
		
		// creating the base condtion
		if (root == null) {
			return 0 ; 
		}
		
		int count = 0 ; 
		if (root.children.size() == 0 ) {
			count++ ; 
		}
		
		// now calling the for loop for the all the child 
		for (int i = 0; i < root.children.size(); i++) {
			int returnintger = CountLeafNode(root.children.get(i)) ; 
			count += returnintger ; 
		}
		
		return count ; 
		
		
	}  
	
	// creating the next larger element program 
	public TreeNode<Integer> nextLaregerElement(TreeNode<Integer>root , int n ){
		
		// n is the number find the next larger element 
		// creating the base condition 
		if (root == null) {
			return null ; 
		}
		
		// now creating the refrence of the object 
		TreeNode<Integer>nextNode = null ; 
		
		if (root.Data > n) {
			// now update the refrence 
			nextNode = root ; 
		}
		
		// now calling the all the children of all the root all the node 
		for (int i = 0; i < root.children.size(); i++) {
			
			// now return the node
			TreeNode<Integer>nextNodeChild = nextLaregerElement(root.children.get(i), n) ; 
			// now creating the codition 
			if (nextNodeChild != null) {
				
				if (nextNode == null || nextNodeChild.Data < nextNode.Data ) {
					
					nextNode = nextNodeChild ; 
				}
			}
			
		}
		return nextNode ; 
		
		
	}

}
