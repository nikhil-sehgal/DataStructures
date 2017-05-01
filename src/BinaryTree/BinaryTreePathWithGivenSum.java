package BinaryTree;
/* Objective is to find a pair path in Binary tree with a given sum value. 
 * Example:  we have to find s
 * Current tree:
 * 				  1				
			    /   \	
			  2 	  3			
			 / \ 	 / \ 
			4   5	6   7		
  			 
  	There is a path from root to leaf with sum 10 
	There is no path from root to leaf with sum :12
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

public class BinaryTreePathWithGivenSum {
Node root;
	
	BinaryTreePathWithGivenSum()
	{
		root = null;
	}
	
	BinaryTreePathWithGivenSum(int data)
	{
		root = new Node(data);
	}
	
	boolean pathWithSum(int sum)
	{
		return pathWithSum(root, sum);
	}
	boolean pathWithSum(Node root,int sum)
	{
		if(root==null)
			return false;
		else 
			{
				boolean isPath = false; 
				int remainingSum = sum - root.data;
				
				if(remainingSum == 0 && root.left==null && root.right == null)
					return true;
				
				if(root.left!=null)
					isPath = isPath || pathWithSum(root.left, remainingSum);
				
				if(root.right!=null)
					isPath = isPath || pathWithSum(root.right, remainingSum);
				
				return isPath;
			}
	}
	
	public static void main(String[] args)
	{
		
		BinaryTreePathWithGivenSum binaryTreePathWithGivenSum = 
				new BinaryTreePathWithGivenSum();
		binaryTreePathWithGivenSum.root = new Node(1);
		binaryTreePathWithGivenSum.root.left = new Node(2);
		binaryTreePathWithGivenSum.root.right = new Node(3);
		binaryTreePathWithGivenSum.root.left.left = new Node(4);
		binaryTreePathWithGivenSum.root.left.right = new Node(5);
		binaryTreePathWithGivenSum.root.right.left = new Node(6);
		binaryTreePathWithGivenSum.root.right.right = new Node(7);
		
		int sumToFind = 10;
		if(binaryTreePathWithGivenSum.pathWithSum(sumToFind)==true)
			System.out.println("There is a path from root to leaf with sum "+sumToFind);
		else
			System.out.println("There is no path from root to leaf with sum "+sumToFind);
		
		
		sumToFind = 12;
		if(binaryTreePathWithGivenSum.pathWithSum(sumToFind)==true)
			System.out.println("There is a path from root to leaf with sum :"+sumToFind);
		else
			System.out.println("There is no path from root to leaf with sum :"+sumToFind);
	}
}

