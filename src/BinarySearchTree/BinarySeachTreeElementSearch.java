package BinarySearchTree;
/*Objective is to search element in BST.
 * Given tree:
	10 20 30 40 50 60 
	Searching Element
	Is 20 present in tree : true
	Is 180 present in tree : false
	*/
public class BinarySeachTreeElementSearch {
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
	
	BinarySeachTreeElementSearch()
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
	
	boolean search(int data)
	{
		Node found = searchElement(root, data);
		if(found!=null)
			return true;
		else 
			return false;
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
	
	Node searchElement(Node root, int data)
	{
		if(root == null || root.key == data)
			return root;
		else if(data < root.key)
			return searchElement(root.left, data);
		else if(data>root.key)
			return searchElement(root.right,data);
		else 
		return null;	
	}
	
	public static void main(String args[])
	{
		BinarySeachTreeElementSearch binarySeachTreeElementSearch = 
				new BinarySeachTreeElementSearch();
				
		binarySeachTreeElementSearch.Insert(60);
		binarySeachTreeElementSearch.Insert(50);
		binarySeachTreeElementSearch.Insert(40);
		binarySeachTreeElementSearch.Insert(30);
		binarySeachTreeElementSearch.Insert(20);
		binarySeachTreeElementSearch.Insert(10);
		
		System.out.println("Given tree:");
		binarySeachTreeElementSearch.show();
		
		System.out.println("Searching Element");
		int elementToSearch = 20;
		System.out.println("Is " + elementToSearch +" present in tree : "+	binarySeachTreeElementSearch.search(elementToSearch));
		
		elementToSearch = 180;
		System.out.println("Is " + elementToSearch +" present in tree : "+	binarySeachTreeElementSearch.search(elementToSearch));
		}
}
