package BinaryTree;
/* Objective is to print Binary tree elements level wise with level number. 
 * Example:  
 * Current tree:
 * 				  1				
			    /   \	
			  2 	  3			
			 / \ 	 / \ 
			4   5	6   7		
  			 
  	0 level has 1 elements.
	1 
	1 level has 2 elements.
	2 3 
	2 level has 4 elements.
	4 5 6 7 
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

public class BinaryTreePrintLevelWiseWithLevelNumber {
	Node root;
	
	BinaryTreePrintLevelWiseWithLevelNumber()
	{
		root = null;
	}
	
	BinaryTreePrintLevelWiseWithLevelNumber(int data)
	{
		root = new Node(data);
	}
	
	
	void print()
	{
		print(root);
	}
	
	void print(Node root)
	{
		int levelNumber = 0 ;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty())		
		{
			System.out.println(levelNumber + " level has " + queue.size() + " elements.");			
			int nodeCount = queue.size();
			while(nodeCount > 0)
			{				
				Node tempNode = queue.poll();
				System.out.print(tempNode.data+ " ");
								
				if(tempNode.left!=null)
				{
					queue.add(tempNode.left);
				}
				
				if(tempNode.right!=null)
				{
					queue.add(tempNode.right);
				}	
				
				nodeCount-- ;
			}
			levelNumber++;
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		
		BinaryTreePrintLevelWiseWithLevelNumber binaryTreePrintLevelWiseWithLevelNumber = 
				new BinaryTreePrintLevelWiseWithLevelNumber();
		binaryTreePrintLevelWiseWithLevelNumber.root = new Node(1);
		binaryTreePrintLevelWiseWithLevelNumber.root.left = new Node(2);
		binaryTreePrintLevelWiseWithLevelNumber.root.right = new Node(3);
		binaryTreePrintLevelWiseWithLevelNumber.root.left.left = new Node(4);
		binaryTreePrintLevelWiseWithLevelNumber.root.left.right = new Node(5);
		binaryTreePrintLevelWiseWithLevelNumber.root.right.left = new Node(6);
		binaryTreePrintLevelWiseWithLevelNumber.root.right.right = new Node(7);
				
		binaryTreePrintLevelWiseWithLevelNumber.print();
	}
}
