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
import java.util.Queue;
import java.util.LinkedList;

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

public class BinaryTreePrintLeafs {
	Node root;
	int leafCount=0;
	BinaryTreePrintLeafs()
	{
		root= null;
	}
	
	BinaryTreePrintLeafs(int data)
	{
		root = new Node(data);
	}	
	
	void PrintLeafs()
	{
		printLeafs(root);
	}
	
	void printLeafs(Node root)	
	{
		if(root==null)
			return;
		
		else 
		{	
			leafCount = 0;
			Node temp;
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);			
			while(!queue.isEmpty())
			{
				temp = queue.poll();
				if((temp.left==null) && (temp.right==null))
				{
					leafCount++;
					System.out.print(temp.data+ " ");
				}
				
				if(temp.left!=null)
					queue.add(temp.left);
				
				if(temp.right!=null)
					queue.add(temp.right);
			}
			System.out.println();
			System.out.println("Total Leaf count "+leafCount);
		}
	}
	public static void main(String[] args)
	{
		BinaryTreePrintLeafs binaryTreePrintLeafs = new BinaryTreePrintLeafs();
		
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
