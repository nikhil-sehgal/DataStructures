package BinaryTree;
/* Objective is to print the binary tree bottom to top. 
 * Example:  
 * Current tree:
 * 			      1
			    /   \
			  2 	  3
			 / \ 	 / \ 
			4   5	6   7
  			 
  	Binary tree bottom to top: 
	4 5 6 7 2 3 1 
 * 
 * */
import java.util.Stack;
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

public class BinaryTreeLevelOrderInReverse {
	Node root;
	BinaryTreeLevelOrderInReverse()
	{
		root = null;
	}
	
	BinaryTreeLevelOrderInReverse(int data)
	{
		root = new Node(data);
	}
	
	void printInReverse()
	{
		printInReverse(root);
	}
	
	void printInReverse(Node root)
	{
		if(root==null)
			return;
		
		if(root!=null)
		{
			Node temp;
			Queue<Node> queue = new LinkedList<Node>();
			Stack<Node> stack = new Stack<Node>();
				
			queue.add(root);
			while(!(queue.isEmpty()))
			{
				temp = queue.poll();								
				stack.add(temp);
				
				if(temp.right!=null)
					queue.add(temp.right);
				
				if(temp.left!=null)
					queue.add(temp.left);		
			}
		
			Node value;
			while(!stack.isEmpty())
			{
				 value = stack.pop();
				System.out.print(value.data+" ");
			}
		}
	}

	public static void main(String[] args)
	{
		BinaryTreeLevelOrderInReverse binaryTreeLevelOrderInReverse = new BinaryTreeLevelOrderInReverse();
		binaryTreeLevelOrderInReverse.root = new Node(1);
		binaryTreeLevelOrderInReverse.root.left = new Node(2);
		binaryTreeLevelOrderInReverse.root.right = new Node(3);
		binaryTreeLevelOrderInReverse.root.left.left = new Node(4);
		binaryTreeLevelOrderInReverse.root.left.right = new Node(5);
		binaryTreeLevelOrderInReverse.root.right.left = new Node(6);
		binaryTreeLevelOrderInReverse.root.right.right = new Node(7);
		
		System.out.println("Binary tree bottom to top: ");
		binaryTreeLevelOrderInReverse.printInReverse();
	
	}
}
