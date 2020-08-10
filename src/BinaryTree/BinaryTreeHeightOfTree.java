package BinaryTree;
/*Objective is to find the height of Binary tree
* height is the number of edges between root and the deepest node.
* * 
* Example:  
* Current tree:
* 			      1
			    /   \
			  2 	  3
			 / \ 	 / 
			4   5	6     
		       / 
		      7  
 		     /
 		    8	
 			 
    In Above tree:
    Height of left SubTree 4 : 1-2-4-7-8
	Height of right SubTree 2 : 1-3-6
 	*/

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

public class BinaryTreeHeightOfTree {

	Node root;
	BinaryTreeHeightOfTree()
	{
		root = null;
	}
	
	BinaryTreeHeightOfTree(int data)
	{
		root = new Node(data);
	}
	
	void heightOfTree()
	{
		int leftTreeHeight = heightOfTree(root.left);
		int rightTreeHeight = heightOfTree(root.right);
		
		System.out.println("Height of left SubTree "+ leftTreeHeight);
		System.out.println("Height of right SubTree "+ rightTreeHeight);
	}
	int heightOfTree(Node node)
	{
		if(node == null)
			return 0;
		 
		return (1+Math.max(heightOfTree(node.left), heightOfTree(node.right)));		
	}
	public static void main(String[] args)
	{
		BinaryTreeHeightOfTree binaryTreeHeightOfTree = 
				new BinaryTreeHeightOfTree();
		
		binaryTreeHeightOfTree.root = new Node(1);
		binaryTreeHeightOfTree.root.left = new Node(2);
		binaryTreeHeightOfTree.root.right = new Node(3);
		binaryTreeHeightOfTree.root.left.left = new Node(4);
		binaryTreeHeightOfTree.root.left.right = new Node(5);
		binaryTreeHeightOfTree.root.right.left = new Node(6);		
		binaryTreeHeightOfTree.root.left.left.left = new Node(7);
		binaryTreeHeightOfTree.root.left.left.left.left = new Node(8);
		 
		binaryTreeHeightOfTree.heightOfTree();
	}
}
