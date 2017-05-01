package BinarySearchTree;

/*Objective is to perform PreOrder traversal of BST
 * 
 * Output:
 * Preorder implementation
 * 60 50 40 30 20 10 
 * */
public class BinarySearchTreePreOrderTraversal {

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
	
	BinarySearchTreePreOrderTraversal()
	{
		root= null;
	}
	
	void Insert(int key)
	{
		root = InsertNewNode(root, key);
	}
	
	Node InsertNewNode(Node root, int key)
	{
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		
		if(key < root.key)
			root.left = InsertNewNode(root.left, key);
		else if(key > root.key)
			root.right = InsertNewNode(root.right, key); 
			 
		return root;
	}

	void show()
	{
		System.out.println("Preorder implementation");
		showPreOrderTree(root);		
	}
	
	void showPreOrderTree(Node root)
	{
		if(root==null)
		{
			return;
		}
		if(root!=null)
		{
			System.out.print(root.key+" ");
			showPreOrderTree(root.left);			
			showPreOrderTree(root.right);
		}
	}

	public static void main(String args[])
	{
		BinarySearchTreePreOrderTraversal binarySearchTreePreOrderTraversal = 
				new BinarySearchTreePreOrderTraversal();
				
		binarySearchTreePreOrderTraversal.Insert(60);
		binarySearchTreePreOrderTraversal.Insert(50);
		binarySearchTreePreOrderTraversal.Insert(40);
		binarySearchTreePreOrderTraversal.Insert(30);
		binarySearchTreePreOrderTraversal.Insert(20);
		binarySearchTreePreOrderTraversal.Insert(10);
		
		//printing tree elements
		binarySearchTreePreOrderTraversal.show();	
	}
}
