package BinaryTree;
/* Objective is to binary tree with 3 different types of traversals. 
 * Example:  
 * Current tree:
 * 				  1				
			    /   \	
			  2 	  3			
			 / \ 	 / \ 
			4   5	6   7	
  		  
  	Printing PostOrder tree
	4 5 2 6 7 3 1 
	Printing InOrder tree
	4 2 5 1 6 3 7 
	Printing PreOrder tree
	1 2 4 5 3 6 7 
 * 
 * */

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

public class BinaryTreeTraversals {

	Node root;
	
	BinaryTreeTraversals(int key)
	{
		root = new Node(key);		
	}
	
	BinaryTreeTraversals()
	{
		root = null;
	}
	
	
	void InOrder()
	{
		InOrder(root);
	}
	void InOrder(Node root)
	{
		if(root!=null)
		{
			InOrder(root.left);
			System.out.print(root.data +" ");
			InOrder(root.right);
		}
	}
	
	void PreOrder()
	{
		PreOrder(root);
	}
	void PreOrder(Node root)
	{
		if(root!=null)
		{
			System.out.print(root.data +" ");
			PreOrder(root.left);			
			PreOrder(root.right);
		}
	}
	
	void PostOrder()
	{
		PostOrder(root);
	}
	void PostOrder(Node root)
	{
		if(root!=null)
		{			
			PostOrder(root.left);			
			PostOrder(root.right);
			System.out.print(root.data +" ");
		}
	}
	
	public static void main(String[] args)
	{
		BinaryTreeTraversals binaryTreeTraverasals = new BinaryTreeTraversals();
	
		binaryTreeTraverasals.root = new Node(1);
		binaryTreeTraverasals.root.left = new Node(2);
		binaryTreeTraverasals.root.right = new Node(3);
		binaryTreeTraverasals.root.left.left = new Node(4);
		binaryTreeTraverasals.root.left.right = new Node(5);
		binaryTreeTraverasals.root.right.left = new Node(6);
		binaryTreeTraverasals.root.right.right = new Node(7);		
		
		System.out.println("Printing PostOrder tree");
		binaryTreeTraverasals.PostOrder(binaryTreeTraverasals.root);
		System.out.println("");
		
		System.out.println("Printing InOrder tree");
		binaryTreeTraverasals.InOrder(binaryTreeTraverasals.root);
		System.out.println("");
		
		System.out.println("Printing PreOrder tree");
		binaryTreeTraverasals.PreOrder(binaryTreeTraverasals.root);
		
	}
}
