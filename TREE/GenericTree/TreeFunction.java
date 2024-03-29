package GenericTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeFunction {

	
	 // now creating the printing function 
	public void printTree(TreeNode<Integer>root) {
		
		// now writing the base case 
		if (root == null) {
			return ; 
		}
		
		// now printing the data 
		System.out.print(root.data+" : ");
		for (int i = 0; i < root.childeren.size(); i++) {
			System.out.print(root.childeren.get(i).data+" ");
		}
		System.out.println();
		// now creating the loop 
		for (int i = 0; i < root.childeren.size(); i++) {
			// now creating the refrence of the tree 
			TreeNode<Integer>node = root.childeren.get(i);
			printTree(node);
		}
	}
	
	// creating the function counting the node of the tree 
	// now return the integer 
	public int TotalTreeNode(TreeNode<Integer>root) {
		
		int count = 1 ; 
		
		// now creating the loop 
		for (int i = 0; i < root.childeren.size(); i++) {
			int childcount = TotalTreeNode(root.childeren.get(i));
			System.out.println(childcount+" "+count);
			count += childcount ; 
		}
		return count ; 
		
	}
	
	public int SumTotalTreeNode(TreeNode<Integer>root) {
		
		// creating the for loop 
		int total = root.data ;  
		for (int i = 0; i < root.childeren.size(); i++) {
		//	int number = root.childeren.get(i).data ;  
			int number = SumTotalTreeNode(root.childeren.get(i)) ; 
			total += number ; 
		}
		return total ; 
	}
	
	// creating the function takining the input levelwise 
	
	public TreeNode<Integer> TaingInputLevelWiseTree(){
		
		// now creating the scanner function  
		Scanner input = new Scanner(System.in) ; 
		// enter the root and display 
		System.out.println("ente the root : ");
		 int rootData = input.nextInt() ; 
		 //now checking the element    
		 if (rootData == -1) {
			return null ; 
		}
		 
		 // now creating the root node
		 TreeNode<Integer>root = new TreeNode<Integer>(rootData) ; 
		 // now creating the queue 
		 Queue<TreeNode<Integer>>pendingNode = new LinkedList<TreeNode<Integer>>() ; 
		 pendingNode.add(root) ; 
		 
		 // now creating the loop and adding the children node in the queue 
		 
		 while (!pendingNode.isEmpty()) {
			
			 // now poll the node 
			 TreeNode<Integer>front = pendingNode.poll() ; 
			 // now user display of the number of the node 
			 System.out.println("enter the no of children "+front.data);
			 int childrenSize = input.nextInt();
			 
			 // now creating the loop 
			 for (int i = 0; i < childrenSize; i++) {
				 
				 // creating the child input 
				 System.out.println(front.data+" children "+i+":");
				 int childNodeData = input.nextInt();
				 // now creting the node 
				 TreeNode<Integer>childnode = new TreeNode<Integer>(childNodeData) ; 
			// now adding in the row 
				 pendingNode.add(childnode);
				 // now creating the connection 
				 front.childeren.add(childnode);
				 
				 
				  
				    
				 
				 
			}
			 
			 
		}
		 
		 return root ; 
		 
		 
	}
	
	// creatung the function for the levele wise print 
	// creating the level wise function 
	public void printLevelwise(TreeNode<Integer>root) {
		
		// now creating the base condition 
		if (root == null) {
			return ; 
		}
		
		// now creating  the queue using the link list for the adding the number in queue 
		Queue<TreeNode<Integer>> node =  new LinkedList<>();
		// now addding the root 
		node.add(root);
		node.add(null) ; 
		
		// now creating the looop for the printing the levele wise printing 
		while (!node.isEmpty()) {
			
			// now creating the loop for the adding deta in the row 
			TreeNode<Integer>frontNode = node.poll() ; 
			// creating the condition node poll null or not 
			     if (frontNode != null) {
				
			    	 // now printing the data 
			    	 System.out.print(frontNode.data+" ");
			    	 // now adding whole node of this root node using the for loop 
			    	 for (int i = 0; i < frontNode.childeren.size(); i++) {
					// now adding data 
			    		 node.add(frontNode.childeren.get(i)) ; 
			    		 
					}
				}else {
					System.out.println();
					if (!node.isEmpty()) {
						node.add(null) ; 
					}
					
				}
		}
		
		
	}
	
	
	// number of the greater node creating the function 
	
	public int NoGreateNode(TreeNode<Integer>root , int data) {
		
		// now creating the base 
		int temp = 0 ; 
		// checking the condition 
		if (root.data > data) {
			temp++ ; 
		}
		// now creating the loop for the calling the every node 
		for (int i = 0; i < root.childeren.size(); i++) {
			int total = NoGreateNode(root.childeren.get(i), data) ; 
			temp += total ; 
		}
		
		return temp ; 
	}
	
	// now creating the function for the finding the hight
	
	public int HightGenricTree(TreeNode<Integer>root) {
		
		
		// creating  the condition if the root is the nulll 
		if (root == null ) {
			return 0 ; 
		}
		
		int hight = 1 ; 
		
		// now creating the loop for the recursision of all the node 
		 for (int i = 0; i < root.childeren.size(); i++) {
			
			  int total   = 1 +  HightGenricTree(root.childeren.get(i)) ; 
			  
			  if (total > hight) {
				hight = total ; 
			}
			 
		}
		 
		 return hight ; 
	}
	
	// creating the function Post order Trevnsionl 
	public void postOrderPrintTree(TreeNode<Integer>root) {
		
		// creating the base condition 
		if (root == null) {
			return  ; 
		}
		
		// now creating the loop for the acesing the all the  element 
		for (int i = 0; i < root.childeren.size(); i++) {
			// now calling the same function for the recursion 
			postOrderPrintTree(root.childeren.get(i));
		}
		
		System.out.print(root.data+" ");
		
		
		
		}
	
	
}
