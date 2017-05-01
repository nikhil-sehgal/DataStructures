package BinarySearchTree;
/*Objective is to get the smallest value.
 * Given tree:
	20 30 40 50 60 70 80 
	Smallest Element is 20
 * */
public class BinarySearchTreeSmallestElement {
	
	static Node root;
	class Node
	{
		int key;
		Node left, right;
		
		Node(int data)
		{
			key = data;
			left = right = null;			
		}
	}
	
	BinarySearchTreeSmallestElement()
	{
		root= null;
	}
	
	void InsertNode(int data)
	{
		root = InsertNewNode(root, data);		
	}
	
	Node InsertNewNode(Node root, int data)
	{
		if(root==null)
		{
			root = new Node(data);
			return root;
		}
		
		if(data < root.key)
			root.left =  InsertNewNode(root.left, data);
		else if(data > root.key)
			root.right = InsertNewNode(root.right, data);
		
		return root;
	}
	
	void showTree()
	{
		printTree(root);
	}
	void printTree(Node root)
	{
		if(root!=null)
		{
			printTree(root.left);
			System.out.print(root.key+" ");
			printTree(root.right);
		}
	}
	
	int smallestElement()
	{
		int value;
		value = smallest(root);
		return value;
		
	}
	int smallest(Node root)
	{
		Node current = root;
		while(current.left != null)
		{
			current = current.left;
		}
		return current.key;
	}
	
	
	public static void main(String args[])
	{
		BinarySearchTreeSmallestElement binarySearchTreeSmallestElement = 
				new BinarySearchTreeSmallestElement();
		
		binarySearchTreeSmallestElement.InsertNode(50);
		binarySearchTreeSmallestElement.InsertNode(30);
		binarySearchTreeSmallestElement.InsertNode(20);
		binarySearchTreeSmallestElement.InsertNode(40);
		binarySearchTreeSmallestElement.InsertNode(70);
		binarySearchTreeSmallestElement.InsertNode(60);
		binarySearchTreeSmallestElement.InsertNode(80);
		
		System.out.println("Given tree:");
		binarySearchTreeSmallestElement.showTree();
		
		System.out.println("");
		int element = binarySearchTreeSmallestElement.smallestElement();
		System.out.println("Smallest Element is "+ element);
	}
}
