/*
 * Rahul Shah
 * Pd 7 Amberg
 * represents a binary tree
 */
public abstract class BinaryTree {
	private TreeNode root;
	
	//constructor
	public BinaryTree(){
		root = null;
	}
	
	//return the root
	public TreeNode getRoot(){
		return root;
	}
	
	//set the root 
	public void setRoot(TreeNode newNode){
		root = newNode;
	}
	
	//checks if root is null
	public boolean isEmpty(){
		return root == null;
	}
	
	//Traversals
	
	//inOrder traversal: left, root, right
	public void inOrder(){
		doInorder(root);
	}
	
	//private inOrder helper
	private void doInorder(TreeNode t){
		
		//base case
		if(t == null) return;
		
		//call with left
		doInorder(t.getLeft());
		
		//print root 
		System.out.print(t.getValue() + " ");
		
		//call with right
		doInorder(t.getRight());
	}
	//__________________________________________________________________
	//postOrder traversal: left, right, root
	public void postOrder(){
		doPostOrder(root);
	}
	
	//private postOrder helper
	private void doPostOrder(TreeNode t){
		//base case
		if(t == null) return;
		
		//call with left
		doPostOrder(t.getLeft());
		
		//call with right
		doPostOrder(t.getRight());
		
		//print root
		System.out.print(t.getValue() + " ");
	}
	
	//preOrder traversal: root, left, right
	public void preOrder(){
		doPreOrder(root);
	}
	
	//private preOrder helper
	private void doPreOrder(TreeNode t){
		//base case
		if(t == null) return;
		
		//print root first
		System.out.print(t.getValue() + " ");
		
		//call left
		doPreOrder(t.getLeft());
		
		//call right
		doPreOrder(t.getRight());
		
	}
	
	//_________________________________________________________________
	//abstract methods for inserting and finding nodes
	public abstract void insert(Comparable item);
	
	public abstract TreeNode find(Comparable key);
	
	
}
