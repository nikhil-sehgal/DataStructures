package BinarySearchTree;
/*Objective is to perform PostOrder traversal of BST
 * 
 * Output:
 * PostOrder Traversal of tree is:
 * 10 20 30 40 50 60 
 * */
public class BinarySearchTreePostOrderTraversal {
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
	
	BinarySearchTreePostOrderTraversal()
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
		System.out.println("Postorder implementation");
		showPostOrderTree(root);
		System.out.println("");
	}
	void showPostOrderTree(Node root)
	{
		if(root!=null)
		{
			showPostOrderTree(root.left);			
			showPostOrderTree(root.right);
			System.out.print(root.key+" ");
		}
	}
	public static void main(String args[])
	{
		BinarySearchTreePostOrderTraversal binarySearchTreePostOrderTraversal = 
				new BinarySearchTreePostOrderTraversal();
				
		binarySearchTreePostOrderTraversal.Insert(60);
		binarySearchTreePostOrderTraversal.Insert(50);
		binarySearchTreePostOrderTraversal.Insert(40);
		binarySearchTreePostOrderTraversal.Insert(30);
		binarySearchTreePostOrderTraversal.Insert(20);
		binarySearchTreePostOrderTraversal.Insert(10);
		
		binarySearchTreePostOrderTraversal.show();
	}
}

