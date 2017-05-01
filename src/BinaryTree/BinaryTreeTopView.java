package BinaryTree;
/* Objective is to print top view of binary tree. 
 * Example:  
 * Current tree:
 * 				  1				
			    /   \	
			  2 	  3			
			 / \ 	 / \ 
			4   5	6   7		
  		   /		   /
  		  8           9
  		  
  	Top view of tree is : 
	8 4 2 1 3 7 
 * 
 * */
import java.util.Stack;

class Node
{
	int data;
	Node left, right;
	
	Node(int key)
	{
		data = key;
		left = right = null;			
	}		
}

public class BinaryTreeTopView {
Node root;
	BinaryTreeTopView()
	{
		root = null;
	}
	
	BinaryTreeTopView(int key)
	{
		root = new Node(key);
	}
	
	
	void top_view()
	{
		top_view(root);
	}
	void top_view(Node root)
	{
		if(root==null)
		      return;
		    
		            Node temp = root;
		            Stack<Node> stack = new Stack<Node>();
		        
		            while(temp.left!=null)
		                {                
		                    stack.push(temp.left);
		                    temp = temp.left;
		            }
		            
		            while(!stack.isEmpty())
		                {
		                    temp = stack.pop();
		                    System.out.print(temp.data+" ");	                
		                }      
		            
		            while(root!=null)
	                {        
		            	System.out.print(root.data+" ");
	                    root = root.right;
	                }  
	}
	
	public static void main(String[] args)
	{
		BinaryTreeTopView binaryTreeTopView = new BinaryTreeTopView();
		binaryTreeTopView.root = new Node(1);
		binaryTreeTopView.root.left = new Node(2);
		binaryTreeTopView.root.right = new Node(3);
		binaryTreeTopView.root.left.left = new Node(4);
		binaryTreeTopView.root.left.right = new Node(5);
		binaryTreeTopView.root.right.left = new Node(6);
		binaryTreeTopView.root.right.right = new Node(7);
		binaryTreeTopView.root.left.left.left = new Node(8);
		binaryTreeTopView.root.right.right.left= new Node(9);
		
		System.out.println("Top view of tree is : ");
		binaryTreeTopView.top_view();
	}
}
