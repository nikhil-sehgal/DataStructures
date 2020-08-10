/* Objective is to traverse binary tree in pre-order 
 * 
 * Example:  
 * Current tree:
 * 			      1
			    /   \
			  2 	  3
			 / \ 	 / 
			4   5	6   
		       / 
		      7  
  			
  			 
  	Output for above tree will be 1-2-4-5-7-3-6
 * 
 * */
package welcome.binaryTree;

public class BinaryTreeTraversalPreOrderRecursive {
	
	Node root;
	BinaryTreeTraversalPreOrderRecursive(){
		root = null;
	}
	
	public static void traversePreOrder(Node root) {
		if(root == null)
			return;
		
		else {			
			System.out.print(root.data+ " ");
			
			if(root.left!=null)
				traversePreOrder(root.left);
			
			if(root.right!=null)
				traversePreOrder(root.right);
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeTraversalPreOrderRecursive binaryTreeTraversalPreOrder = new BinaryTreeTraversalPreOrderRecursive();
		binaryTreeTraversalPreOrder.root = new Node(1);
		binaryTreeTraversalPreOrder.root.left = new Node(2);
		binaryTreeTraversalPreOrder.root.right = new Node(3);
		binaryTreeTraversalPreOrder.root.left.left = new Node(4);
		binaryTreeTraversalPreOrder.root.left.right = new Node(5);
		binaryTreeTraversalPreOrder.root.right.left = new Node(6);		
		binaryTreeTraversalPreOrder.root.left.right.left = new Node(7);
		
		traversePreOrder(binaryTreeTraversalPreOrder.root);
	}
}
