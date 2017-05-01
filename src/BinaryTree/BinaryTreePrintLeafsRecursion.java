package BinaryTree;
/* Objective is to print leafs of binary tree. 
 * Example:  
 * Current tree:
 * 				  1				
			    /   \	
			  2 	  3			
			 / \ 	 / \ 
			4   5	6   7		
  			 
  	4 5 6 7 
	Total Leaf count 4
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

public class BinaryTreePrintLeafsRecursion {
	Node root;
	int leafCount=0;
	BinaryTreePrintLeafsRecursion()
	{
		root= null;
	}
	
	BinaryTreePrintLeafsRecursion(int data)
	{
		root = new Node(data);
	}	
	
	void PrintLeafs()
	{
		PrintLeafs(root);
		System.out.println();
		System.out.print("Total Leaf count "+leafCount);
	}
	
	void PrintLeafs(Node root)
	{
		if(root==null)
			return;
		
		else if(root!= null)
		{
			PrintLeafs(root.left);
			PrintLeafs(root.right);
			if(root.left == null && root.right == null)
			{
				leafCount++;	
				System.out.print(root.data + " ");
			}
		}
		
	}	
	
	public static void main(String[] args)
	{
		BinaryTreePrintLeafsRecursion binaryTreePrintLeafs = new BinaryTreePrintLeafsRecursion();
		
		binaryTreePrintLeafs.root = new Node(1);
		binaryTreePrintLeafs.root.left = new Node(2);
		binaryTreePrintLeafs.root.right = new Node(3);
		binaryTreePrintLeafs.root.left.left = new Node(4);
		binaryTreePrintLeafs.root.left.right = new Node(5);
		binaryTreePrintLeafs.root.right.left = new Node(6);
		binaryTreePrintLeafs.root.right.right = new Node(7);		
		
		binaryTreePrintLeafs.PrintLeafs();
	}
}
