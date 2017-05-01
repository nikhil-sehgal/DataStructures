package BinaryTree;
/* Objective is to find the largest element in Binary tree.
 * 
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

public class BinaryTreeLargestElement {
	int data; 
	Node root;
	
	BinaryTreeLargestElement()
	{
		root = null;
	}
	BinaryTreeLargestElement(int data)
	{
		root = new Node(data);
	}
	int largestValue()
	{
		return largestValue(root);
	}
	int largestValue(Node root)
	{
		int rootVal, minVal = Integer.MIN_VALUE;
		Queue<Node> queue = new LinkedList<Node>(); 
		Node temp;
		
		if(root!=null)
		{
			queue.add(root);
			while(!(queue.isEmpty()))
				{
					temp = queue.poll();
					rootVal = temp.data;
					
					if(rootVal > minVal)
						minVal = rootVal;
					
					if(temp.left!=null)
						queue.add(temp.left);
					
					if(temp.right!=null)
						queue.add(temp.right);
				}
		}
		return minVal;
	}
	
	
	public static void main(String args[])
	{
		BinaryTreeLargestElement binaryTreeLargestElement = new BinaryTreeLargestElement();
		
		binaryTreeLargestElement.root = new Node(1);
		binaryTreeLargestElement.root.left = new Node(2);
		binaryTreeLargestElement.root.right = new Node(7);
		binaryTreeLargestElement.root.left.left = new Node(4);
		binaryTreeLargestElement.root.left.right = new Node(9);
		binaryTreeLargestElement.root.right.left = new Node(6);
		binaryTreeLargestElement.root.right.right = new Node(8);
		
		System.out.println("");
		int maxVal = binaryTreeLargestElement.largestValue();
		if(maxVal == Integer.MIN_VALUE)
			System.out.println("Value not found");
		else
			System.out.println("Max value is : "+maxVal);
	}
}
