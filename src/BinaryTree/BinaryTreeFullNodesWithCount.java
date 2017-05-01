package BinaryTree;
/*Objective is to find full nodes in Binary Tree
Full nodes are the nodes where node has 2 children
	Current tree:
 * 				  1
			    /   \
			  2 	  3
			 / \ 	 / \
			4   5	6   7
	Solution
	Full nodes are: 1 2 3 
	Total number of full nodes : 3
*/
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

public class BinaryTreeFullNodesWithCount {
	Node root;
	int count;
	BinaryTreeFullNodesWithCount()
	{
		root = null;
	}
	
	BinaryTreeFullNodesWithCount(int data)
	{
		root = new Node(data);
	}
	
	public void fullNodesAndCount()
	{
		System.out.print("Full nodes are: ");
		fullNodesAndCount(root);
	}
	public void fullNodesAndCount(Node root)
	{
		if(root==null)
			return;
		
		else 
		{
			count = 0;
			Node temp;
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			while(!queue.isEmpty())
			{
				temp = queue.poll();
				if((temp.left!=null) && (temp.right!=null))
				{
					count++;
					System.out.print(temp.data+" ");
				}
				
				if(temp.left!=null)
					queue.add(temp.left);
				
				if(temp.right!=null)
					queue.add(temp.right);
			}
			System.out.println();
			System.out.println("Total number of full nodes : "+ count);
		}
	}
	
	public static void main(String[] args)
	{
		
		BinaryTreeFullNodesWithCount binaryTreeFullNodesWithCount = new BinaryTreeFullNodesWithCount();
		
		binaryTreeFullNodesWithCount.root = new Node(1);
		binaryTreeFullNodesWithCount.root.left = new Node(2);
		binaryTreeFullNodesWithCount.root.right = new Node(3);
		binaryTreeFullNodesWithCount.root.left.left = new Node(4);
		binaryTreeFullNodesWithCount.root.left.right = new Node(5);
		binaryTreeFullNodesWithCount.root.right.left = new Node(6);
		binaryTreeFullNodesWithCount.root.right.right = new Node(7);
		
		binaryTreeFullNodesWithCount.fullNodesAndCount();
	}	
}
