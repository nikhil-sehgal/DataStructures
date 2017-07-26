package BinaryTree;
/* Objective is to find the diameter of Binary tree
 * Diameter is the number of nodes on the longest path 
 * between two leaves in the tree.
 * 
 * Example:  
 * Current tree:
 * 			      1
			    /   \
			  2 	  3
			 / \ 	 / 
			4   5	6   
		       / 
		      7  
  			\
  			 8
  			 
  	In Above tree diameter nodes are : 8-7-4-2-1-3-6
  	So, Diameter of Tree is 7
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

public class BinaryTreeDiameterOfTree {

	Node root;
	
	BinaryTreeDiameterOfTree()
	{
		root = null;
	}
	
	BinaryTreeDiameterOfTree(int data)
	{
		root = new Node(data);
	}
	
	int diameterOfTree()
	{
		return diameterofTree(root);
	}
	
	int diameterofTree(Node root)
	{
		if(root==null)
			return 0;
		
		int leftTreeHeight = heightOfTree(root.left);
		int rightTreeHeight = heightOfTree(root.right);
		
		int leftTreeDiameter = diameterofTree(root.left);
		int rightTreeDiameter = diameterofTree(root.right);
		
		return (Math.max(leftTreeHeight+rightTreeHeight+1, Math.max(leftTreeDiameter ,rightTreeDiameter)));
	}
	
	int heightOfTree(Node node)
	{
		if(node == null)
			return 0;
		
		return (1+Math.max(heightOfTree(node.left), heightOfTree(node.right)));
	}
	
	public static void main(String[] args)
	{
		BinaryTreeDiameterOfTree binaryTreeDiameterOfTree = 
				new BinaryTreeDiameterOfTree();
		
		binaryTreeDiameterOfTree.root = new Node(1);
		binaryTreeDiameterOfTree.root.left = new Node(2);
		binaryTreeDiameterOfTree.root.right = new Node(3);
		binaryTreeDiameterOfTree.root.left.left = new Node(4);
		binaryTreeDiameterOfTree.root.left.right = new Node(5);
		binaryTreeDiameterOfTree.root.right.left = new Node(6);		
		binaryTreeDiameterOfTree.root.left.left.left = new Node(7);
		binaryTreeDiameterOfTree.root.left.left.left.right = new Node(8);
					
		System.out.println("Diameter of Tree is "+binaryTreeDiameterOfTree.diameterOfTree()) ;
	}
}
