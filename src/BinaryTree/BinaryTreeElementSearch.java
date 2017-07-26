package BinaryTree;
/*Objective is to search an element in a Binary Tree
 * I solved the problem without recursion
 * Current tree:
 * 			      1
			    /   \
			  2 	  3
			 / \ 	 / \
			4   5	6   7
			
	Solution: 
	Element 0 not found in tree
	Element 1 found in tree
	Element 2 found in tree
	Element 3 found in tree
	Element 4 found in tree
	Element 5 found in tree
	Element 6 found in tree
	Element 7 found in tree
	Element 8 not found in tree
	Element 9 not found in tree
	Element 10 not found in tree
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

public class BinaryTreeElementSearch {
	Node root;
	
	BinaryTreeElementSearch()
	{
		root = null;
	}
	
	BinaryTreeElementSearch(int data)
	{
		root = new Node(data);
	}
	
	boolean SearchElement(int data)
	{
		return SearchElement(data, root);
	}
	boolean SearchElement(int dataToSearch, Node root)	
	{
		boolean isElementFound = false;
		if(root == null)
			isElementFound = false;
		
		if(root.data==dataToSearch)
			isElementFound = true;		
		
		else if(root!=null)
		{
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			Node temp;
			while(!(queue.isEmpty()))
			{
				temp = queue.poll();
				if(temp.data == dataToSearch){
					isElementFound = true;
					break;
				}
				
				if(temp.left != null)
				 queue.add(temp.left);
				
				if(temp.right!=null)
					queue.add(temp.right);
			}
		}		
			return isElementFound;
	}
	
	public static void main(String[] args)
	{
		BinaryTreeElementSearch binaryTreeElementSearch = new BinaryTreeElementSearch();
		
		binaryTreeElementSearch.root = new Node(1);
		binaryTreeElementSearch.root.left = new Node(2);
		binaryTreeElementSearch.root.right = new Node(3);
		binaryTreeElementSearch.root.left.left = new Node(4);
		binaryTreeElementSearch.root.left.right = new Node(5);
		binaryTreeElementSearch.root.right.left = new Node(6);
		binaryTreeElementSearch.root.right.right = new Node(7);
		
		int elementToFind;
		for(int i=0; i<11; i++)
		{
			elementToFind = i;
			
			if(binaryTreeElementSearch.SearchElement(elementToFind) == true)
				System.out.println("Element "+ i +" found in tree");
			else
				System.out.println("Element "+ i +" not found in tree");
		}
	}
}
