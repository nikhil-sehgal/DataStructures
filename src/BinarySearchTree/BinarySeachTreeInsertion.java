package BinarySearchTree;
/*Objective is to insertion in BST
 * We will be adding value 10 20 30 40 50 60
 * 
 * Output
 * Added value
 * 10 20 30 40 50 60 
*/
public class BinarySeachTreeInsertion{
	
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
	
	BinarySeachTreeInsertion()
	{
		root = null;
	}
	
	void Insert(int key)
	{
		root = InsertNode(root, key);
	}
	
	//method inserting values to BST.
	Node InsertNode(Node root, int key)
	{
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		
		if(key > root.key)
			root.right = InsertNode(root.right, key);
		else if(key < root.key)
			root.left = InsertNode(root.left, key);
			
		return root;
	}
	
	void show()
	{
		showTree(root);
		System.out.println();
	}
	
	void showTree(Node root)
	{
		if(root!=null)
		{
			showTree(root.left);
			System.out.print(root.key+ " ");
			showTree(root.right);
		}
	}
	
	
	public static void main(String args[])
	{
		BinarySeachTreeInsertion BinarySeachTreeInsertion = 
				new BinarySeachTreeInsertion();
		
		//calling insert method to add values.
		BinarySeachTreeInsertion.Insert(60);
		BinarySeachTreeInsertion.Insert(50);
		BinarySeachTreeInsertion.Insert(40);
		BinarySeachTreeInsertion.Insert(30);
		BinarySeachTreeInsertion.Insert(20);
		BinarySeachTreeInsertion.Insert(10);
		
		System.out.println("Added value");
		BinarySeachTreeInsertion.show();
	}
}
