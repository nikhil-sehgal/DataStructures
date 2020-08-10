package welcome.binaryTree;
/* Objective is to traverse binary tree in post-order 
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
  			
  			 
  	Output for above tree will be 4-7-5-2-6-3-1
 * 
 * */
public class BinaryTreeTraversalPostOrderRecursive {
	Node root;
	BinaryTreeTraversalPostOrderRecursive(){
		root = null;
	}
	
	static void traversePostOrder(Node root) {
		if(root==null)
			return;
		
		else {
			if(root.left!=null)
				traversePostOrder(root.left);
			
			if(root.right!=null)
				traversePostOrder(root.right);
			
			System.out.print(root.data+" ");
		}
	}
	public static void main(String[] args) {
		BinaryTreeTraversalPostOrderRecursive binaryTreeTraversalPostOrderRecursive = new BinaryTreeTraversalPostOrderRecursive();
		binaryTreeTraversalPostOrderRecursive.root = new Node(1);
		binaryTreeTraversalPostOrderRecursive.root.left = new Node(2);
		binaryTreeTraversalPostOrderRecursive.root.right = new Node(3);
		binaryTreeTraversalPostOrderRecursive.root.left.left = new Node(4);
		binaryTreeTraversalPostOrderRecursive.root.left.right = new Node(5);
		binaryTreeTraversalPostOrderRecursive.root.right.left = new Node(6);		
		binaryTreeTraversalPostOrderRecursive.root.left.right.left = new Node(7);
		
		traversePostOrder(binaryTreeTraversalPostOrderRecursive.root);
	}
}
