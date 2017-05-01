package BinarySearchTree;
/*Objective is to perform InOrder traversal of BST
 * 
 * Output:
 * InOrder Traversal of tree is:
 * 10 20 30 40 50 60 
 * */
public class BinarySearchTreeInOrderTraversal {
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
	
	BinarySearchTreeInOrderTraversal()
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
		showInOrderTree(root);
		System.out.println();
	}
	void showInOrderTree(Node root)
	{
		if(root!=null)
		{
			showInOrderTree(root.left);
			System.out.print(root.key+" ");
			showInOrderTree(root.right);
		}
	}
	
	public static void main(String args[])
	{
		BinarySearchTreeInOrderTraversal binarySearchTreeInOrderTraversal = 
				new BinarySearchTreeInOrderTraversal();
				
		binarySearchTreeInOrderTraversal.Insert(60);
		binarySearchTreeInOrderTraversal.Insert(50);
		binarySearchTreeInOrderTraversal.Insert(40);
		binarySearchTreeInOrderTraversal.Insert(30);
		binarySearchTreeInOrderTraversal.Insert(20);
		binarySearchTreeInOrderTraversal.Insert(10);
		
		System.out.println("InOrder Traversal of tree is:");
		binarySearchTreeInOrderTraversal.show();
		}
}

