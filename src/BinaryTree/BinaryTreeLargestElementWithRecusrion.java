package BinaryTree;
/* Objective is to find the largest element in Binary tree
 * Example:  
 * Current tree:
 * 				  1
			    /   \
			  2 	  7
			 / \ 	 / \ 
			4   9	6   8
  			 
  	Max value is : 9
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

public class BinaryTreeLargestElementWithRecusrion {
	int data; 
	Node root;
	
	BinaryTreeLargestElementWithRecusrion()
	{
		root = null;
	}
	BinaryTreeLargestElementWithRecusrion(int data)
	{
		root = new Node(data);
	}
	
	int LargestElement()
	{
		return LargestElement(root);
	}
	int LargestElement(Node root)
	{
		if(root == null)
			return Integer.MIN_VALUE;
		
		
		int rootVal, leftVal, rightVal, largestElementVal = Integer.MIN_VALUE;
		if(root != null)
		{
			rootVal = root.data;
			leftVal = LargestElement(root.left);
			rightVal = LargestElement(root.right);
			
			if(leftVal > rightVal)
				largestElementVal = leftVal;
			else 
				largestElementVal = rightVal;
			
			if(rootVal > largestElementVal)
				largestElementVal = rootVal;
		
		}
		return largestElementVal;
	}
	
	public static void main(String args[])
	{
		BinaryTreeLargestElementWithRecusrion binaryTreeLargestElement = new BinaryTreeLargestElementWithRecusrion();
		
		binaryTreeLargestElement.root = new Node(1);
		binaryTreeLargestElement.root.left = new Node(2);
		binaryTreeLargestElement.root.right = new Node(7);
		binaryTreeLargestElement.root.left.left = new Node(4);
		binaryTreeLargestElement.root.left.right = new Node(9);
		binaryTreeLargestElement.root.right.left = new Node(6);
		binaryTreeLargestElement.root.right.right = new Node(8);
		
		int maxVal = binaryTreeLargestElement.LargestElement();
		
		if(maxVal == Integer.MIN_VALUE)
			System.out.println("Value not found");
		else
			System.out.println("Max value is : "+maxVal);
		
	} 
}
