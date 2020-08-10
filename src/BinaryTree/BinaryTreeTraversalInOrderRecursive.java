package welcome.binaryTree;
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
  			
  			 
  	Output for above tree will be 4-2-7-5-1-6-3
  	1
 * 
 * */
public class BinaryTreeTraversalInOrderRecursive {
	Node root;
	BinaryTreeTraversalInOrderRecursive(){
		root = null;
	}
	static void traverseInOrder(Node root) {
		if(root==null)
			return;
		
		else {
			if(root.left!=null)
				traverseInOrder(root.left);
			
			System.out.print(root.data+" ");
			
			if(root.right!=null)
				traverseInOrder(root.right);
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeTraversalInOrderRecursive binaryTreeTraversalInOrderRecursive = new BinaryTreeTraversalInOrderRecursive();
		binaryTreeTraversalInOrderRecursive.root = new Node(1);
		binaryTreeTraversalInOrderRecursive.root.left = new Node(2);
		binaryTreeTraversalInOrderRecursive.root.right = new Node(3);
		binaryTreeTraversalInOrderRecursive.root.left.left = new Node(4);
		binaryTreeTraversalInOrderRecursive.root.left.right = new Node(5);
		binaryTreeTraversalInOrderRecursive.root.right.left = new Node(6);		
		binaryTreeTraversalInOrderRecursive.root.left.right.left = new Node(7);
		
		traverseInOrder(binaryTreeTraversalInOrderRecursive.root);
	} 
	
}
