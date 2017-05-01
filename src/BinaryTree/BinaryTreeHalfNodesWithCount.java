package BinaryTree;
/*Objective is to find half nodes in Binary Tree
Full nodes are the nodes where node has 2 children
	Current tree:
 * 				  1
			    /   \
			  2 	  3
			 / \ 	 / \
			4   5	6   7
			   /		 \
			  8			  9
	Solution
	Half Nodes :5 7 
	Total number of half nodes : 2
	*/
import java.util.LinkedList;
import java.util.Queue;

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

public class BinaryTreeHalfNodesWithCount {

	Node root;
	int count;
	BinaryTreeHalfNodesWithCount()
	{
		root = null;
	}
	
	BinaryTreeHalfNodesWithCount(int data)
	{
		root = new Node(data);
	}
	
	public void halfNodesAndCount()
	{
		System.out.print("Half Nodes :");
		halfNodesAndCount(root);
	}
	public void halfNodesAndCount(Node root)
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
				if(((temp.left!=null) && (temp.right==null)) || ((temp.left==null) && (temp.right!=null)) )
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
			System.out.println("Total number of half nodes : "+ count);
		}
	}
	public static void main(String[] args)
	{
		
		BinaryTreeHalfNodesWithCount binaryTreeHalfNodesWithCount = new BinaryTreeHalfNodesWithCount();
		
		binaryTreeHalfNodesWithCount.root = new Node(1);
		binaryTreeHalfNodesWithCount.root.left = new Node(2);
		binaryTreeHalfNodesWithCount.root.right = new Node(3);
		binaryTreeHalfNodesWithCount.root.left.left = new Node(4);
		binaryTreeHalfNodesWithCount.root.left.right = new Node(5);
		binaryTreeHalfNodesWithCount.root.right.left = new Node(6);
		binaryTreeHalfNodesWithCount.root.right.right = new Node(7);
		binaryTreeHalfNodesWithCount.root.left.right.left = new Node(8);
		binaryTreeHalfNodesWithCount.root.right.right.right = new Node(9);
		
		binaryTreeHalfNodesWithCount.halfNodesAndCount();
	}	
}
