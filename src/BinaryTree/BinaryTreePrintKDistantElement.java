package BinaryTree;
/* Objective is to print the elements at k distance from root. 
 * Example:  
 * Current tree:
 * 				  1				
			    /   \	
			  2 	  3			
			 / \ 	 / \ 
			4   5	6   7		
  			 
  	Elements at distance 0 to root
	1 
	Elements at distance 1 to root
	2 3 
	Elements at distance 2 to root
	4 5 6 7 
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

public class BinaryTreePrintKDistantElement {

	Node root;
	BinaryTreePrintKDistantElement()
	{
		root = null;		
	}
	
	BinaryTreePrintKDistantElement(int data)
	{
		root = new Node(data);
	}
	
	
	
	void printKDistant(int distance)
	{
		printKDistant(root, distance);
	}
	void printKDistant(Node node, int k) 
    {		
        if (node == null)
            return;
        if (k == 0) 
        {
            System.out.print(node.data + " ");
            return;
        } 
        else
        {
        	printKDistant(node.left, k - 1);
            printKDistant(node.right, k - 1);
        }
    }
	
	public static void main(String[] args)
	{
		
		BinaryTreePrintKDistantElement binaryTreePrintKDistantElement = 
				new BinaryTreePrintKDistantElement();
		
		binaryTreePrintKDistantElement.root = new Node(1);
		binaryTreePrintKDistantElement.root.left = new Node(2);
		binaryTreePrintKDistantElement.root.right = new Node(3);
		binaryTreePrintKDistantElement.root.left.left = new Node(4);
		binaryTreePrintKDistantElement.root.left.right = new Node(5);
		binaryTreePrintKDistantElement.root.right.left = new Node(6);
		binaryTreePrintKDistantElement.root.right.right = new Node(7);
		
		int kDistance = 0;
		System.out.println("Elements at distance 0 to root");
		binaryTreePrintKDistantElement.printKDistant(kDistance);
		System.out.println("");
		
		kDistance = 1;
		System.out.println("Elements at distance 1 to root");
		binaryTreePrintKDistantElement.printKDistant(kDistance);
		System.out.println("");
		
		kDistance = 2;
		System.out.println("Elements at distance 2 to root");
		binaryTreePrintKDistantElement.printKDistant(kDistance);
	}	
}
