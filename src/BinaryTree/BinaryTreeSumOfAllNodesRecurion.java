package BinaryTree;
/* Objective is to find the sum of all nodes of Binary Tree. 
 * Example:  
 * Current tree:
 * 				  1				
			    /   \	
			  2 	  3			
			 / \ 	 / \ 
			4   5	6   7		
  			 
  	Total sum of nodes is 28
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

public class BinaryTreeSumOfAllNodesRecurion {
Node root;
	
BinaryTreeSumOfAllNodesRecurion()
	{
		root = null;
	}
	
BinaryTreeSumOfAllNodesRecurion(int data)
	{
		root = new Node(data);
	}
	
	void sumOfNodes()
	{
		System.out.println("Total sum of nodes is "+sumOfNodes(root));		
	}
	
	int sumOfNodes(Node root)
	{		
		if(root==null)
			return 0;
		else
			return (root.data + sumOfNodes(root.left) + sumOfNodes(root.right));
	}
	
	public static void main(String[] args)
	{
		
		BinaryTreeSumOfAllNodesRecurion binaryTreeSumOfAllNodes = 
				new BinaryTreeSumOfAllNodesRecurion();
		binaryTreeSumOfAllNodes.root = new Node(1);
		binaryTreeSumOfAllNodes.root.left = new Node(2);
		binaryTreeSumOfAllNodes.root.right = new Node(3);
		binaryTreeSumOfAllNodes.root.left.left = new Node(4);
		binaryTreeSumOfAllNodes.root.left.right = new Node(5);
		binaryTreeSumOfAllNodes.root.right.left = new Node(6);
		binaryTreeSumOfAllNodes.root.right.right = new Node(7);
		
		binaryTreeSumOfAllNodes.sumOfNodes();
	}
}


