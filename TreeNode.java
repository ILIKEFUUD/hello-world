/* Rahul Shah
 * PD 7 Amberg
 * TreeNode.java
 * Represents a node of a binary tree
 */
public class TreeNode {
	private Object value;
	private TreeNode left, right;
	
	//constructor for just node
	public TreeNode(Object initValue){
		value = initValue;
		left = null;
		right = null;
	}
	
	//constructor for a node with left and right nodes
	public TreeNode(Object initValue, TreeNode initLeft, TreeNode initRight){
		value = initValue;
		left = initLeft;
		right = initRight;
	}
	
	//return the value of the node
	public Object getValue(){
		return value;
	}
	
	//return the node's left TreeNode 
	public TreeNode getLeft(){
		return left;
	}
	
	//return the node's right TreeNode
	public TreeNode getRight(){
		return right;
	}
	
	//set the value of the node
	public void setValue(Object newVal){
		value = newVal;
	}
	
	//set the node's left TreeNode's value
	public void setLeft(TreeNode newLeft){
		left = newLeft;
	}
	
	//set the node's right TreeNode's value
	public void setRight(TreeNode newRight){
		right = newRight;
	}
	
}
