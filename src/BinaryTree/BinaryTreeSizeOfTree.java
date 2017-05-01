package BinaryTree;
/* Objective is to find the size of Binary Tree. 
 * Example:  
 * Current tree:
 * 				  1				
			    /   \	
			  2 	  3			
			 / \ 	 / \ 
			4   5	6   7		
  			 
  	Size of tree is 7
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

public class BinaryTreeSizeOfTree {
	Node root;
	BinaryTreeSizeOfTree()
	{
		root = null;
	}
	BinaryTreeSizeOfTree(int data)
	{
		root = new Node(data);
	}
	
	int sizeOfTree()
	{
		return sizeOfTree(root);
	}
	int sizeOfTree(Node root)
	{
		if(root==null)
			return 0;
		
		else 
			return (sizeOfTree(root.left)+1+sizeOfTree(root.right));
	}
	
	
	public static void main(String[] args)
	{
		BinaryTreeSizeOfTree binaryTreeSizeOfTree = new BinaryTreeSizeOfTree();
		binaryTreeSizeOfTree.root = new Node(1);
		binaryTreeSizeOfTree.root.left = new Node(2);
		binaryTreeSizeOfTree.root.right = new Node(3);
		binaryTreeSizeOfTree.root.left.left = new Node(4);
		binaryTreeSizeOfTree.root.left.right = new Node(5);
		binaryTreeSizeOfTree.root.right.left = new Node(6);
		binaryTreeSizeOfTree.root.right.right = new Node(7);
		
		System.out.println("Size of tree is "+binaryTreeSizeOfTree.sizeOfTree());
	}	
}

