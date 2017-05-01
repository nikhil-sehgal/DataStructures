package BinaryTree;
/* Objective is to find the level with maximum sum. 
 * Example:  
 * Current tree:
 * 				  1				sum = 1
			    /   \	
			  2 	  3			sum = 5
			 / \ 	 / \ 
			4   5	6   7		sum = 22
  			 
  	2 level has Maximum sum i.e 22
 * 
 * */
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

public class BinaryTreeLevelWithSum {
Node root;
	
BinaryTreeLevelWithSum()
	{
		root = null;
	}
	
BinaryTreeLevelWithSum(int data)
	{
		root = new Node(data);
	}
	
	
	void levelWithMaxSum()
	{
		levelWithMaxSum(root);
	}
	
	void levelWithMaxSum(Node root)
	{
		int maxSum= 0;
		int maxSumLevelNumber=0;
		int levelNumber = 0 ;
		int levelSum = 0;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty())		
		{			
			int nodeCount = queue.size();
			while(nodeCount > 0)
			{				
				Node tempNode = queue.poll();		
				levelSum = levelSum+tempNode.data;
								
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
			if(maxSum < levelSum){
				maxSum = levelSum;
				maxSumLevelNumber = levelNumber;
			}
			levelSum = 0;
			levelNumber++;
		}
		System.out.println(maxSumLevelNumber +" level has Maximum sum i.e "+ maxSum);
	}
	
	public static void main(String[] args)
	{
		
		BinaryTreeLevelWithSum binaryTreeLevelWithSum = 
				new BinaryTreeLevelWithSum();
		binaryTreeLevelWithSum.root = new Node(1);
		binaryTreeLevelWithSum.root.left = new Node(2);
		binaryTreeLevelWithSum.root.right = new Node(3);
		binaryTreeLevelWithSum.root.left.left = new Node(4);
		binaryTreeLevelWithSum.root.left.right = new Node(5);
		binaryTreeLevelWithSum.root.right.left = new Node(6);
		binaryTreeLevelWithSum.root.right.right = new Node(7);
		
		
		binaryTreeLevelWithSum.levelWithMaxSum();
	}
}
