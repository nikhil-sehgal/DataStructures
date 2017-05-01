package BinaryTree;
/* Objective is to print Binary tree elements level wise . 
 * Example:  
 * Current tree:
 * 				  1				
			    /   \	
			  2 	  3			
			 / \ 	 / \ 
			4   5	6   7		
  			 
  	1 2 3 4 5 6 7 
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

public class BinaryTreePrintLevelWise {

	Node root;
	BinaryTreePrintLevelWise()
	{
		root = null;		
	}
	
	BinaryTreePrintLevelWise(int data)
	{
		root = new Node(data);
	}	
	
	void printLevelWise()
	{
		printLevelWise(root);
	}
	
	void printLevelWise(Node root)
	{
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node tempNode = queue.poll();
			System.out.print(tempNode.data+" ");
			
			if(tempNode.left!=null)
				queue.add(tempNode.left);
				
			if(tempNode.right!=null)
				queue.add(tempNode.right);			
		}
		
	}
	
	public static void main(String[] args)
	{
		BinaryTreePrintLevelWise binaryTreePrintLevelWise = new BinaryTreePrintLevelWise();
		
		binaryTreePrintLevelWise.root = new Node(1);
		binaryTreePrintLevelWise.root.left = new Node(2);
		binaryTreePrintLevelWise.root.right = new Node(3);
		binaryTreePrintLevelWise.root.left.left = new Node(4);
		binaryTreePrintLevelWise.root.left.right = new Node(5);
		binaryTreePrintLevelWise.root.right.left = new Node(6);
		binaryTreePrintLevelWise.root.right.right = new Node(7);
				
		binaryTreePrintLevelWise.printLevelWise();		
	}
}
