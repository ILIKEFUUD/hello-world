/*
 * Rahul Shah
 * Pd7 Amberg
 * Represents a Binary Search Tree
 */
public class BinarySearchTree extends BinaryTree {

	// FIX WITH NO RECURSION
	@Override
	public void insert(Comparable item) {
		// TODO Auto-generated method stub
		boolean isAdded = false;
		//if the search tree is empty 
		if (isEmpty()) {
			setRoot(new TreeNode(item));
			return;
		}
		TreeNode current = getRoot();
		while(!isAdded){
			//item is less than node
			if(item.compareTo(current.getValue()) <= 0)//include equal to node
				if(current.getLeft() == null){
					current.setLeft(new TreeNode(item));
					isAdded = true;
				}
				else
					current = current.getLeft();
			else{//item is greater than node
				if(current.getLeft() == null){
					current.setLeft(new TreeNode(item));
					isAdded = true;
				}
				else
					current = current.getLeft();
			}
		}
		System.out.println("done");
	}//end of insert
	
	
	//finds and returns the node containing a value equal to the key
	public TreeNode find(Comparable key){
		
		TreeNode currentNode = getRoot();
		
		while(currentNode != null){
			if(key.compareTo(currentNode.getValue()) == 0){
				return currentNode;
			}else if(key.compareTo(currentNode.getValue()) < 0){
				currentNode = currentNode.getLeft();
			}else if(key.compareTo(currentNode.getValue()) > 0){
				currentNode = currentNode.getRight();
			}else{
				currentNode = null;
			}
			
		}//end while
		
		return currentNode;
	
	}//end of find
	
	
	//removes a node and patches up the tree
	public boolean remove(Comparable item){
		boolean found = false;
		TreeNode removeThis = getRoot();
		TreeNode previous = null;
		
		//keep going until something is removed or node you're looking at is null
		while(!found && removeThis != null){
			int difference = item.compareTo(removeThis.getValue()); 
			if(difference == 0)//it is found
				found = true;
			else{
				previous = removeThis;
				if(difference < 0)
					removeThis = removeThis.getLeft();
				else
					removeThis = removeThis.getRight();
			}
		}//end while
		
		if(!found) 
			return false;
		
		
		//removeThis contains the node 
		
		//TWO BIRDS WITH ONE STONE!
		//case1: no children, case 2: one of the children is null
		
		if(removeThis.getLeft() == null || removeThis.getRight() == null){
			
			//new child node
			TreeNode newChild;
			//if the left is null, set the value to the right one,
			//and vice versa
			if(removeThis.getLeft() == null)
				newChild = removeThis.getRight();
			else
				newChild = removeThis.getLeft();
			
			//set the previous to the next value
			if(previous == null)//found in root
				setRoot(newChild);
			else if(previous.getLeft() == removeThis)//if left is to be removed 
				previous.setLeft(newChild);
			else
				previous.setRight(newChild);//if right is to be removed
			
			return true;
		}//end of first 2 cases
		
		
		//
		
		//if neither subtree is empty
		
		//get the element that is closest
		//to the one being removed 
		TreeNode smallPrev = removeThis;
		TreeNode small = removeThis.getRight();
		
		//find smallest
		while(small.getLeft() !=null){
			smallPrev = small;
			small = small.getLeft();
		}
		
		//small now contains smallest node in the
		//right side. This is the node closest in value to the 
		//removed one
		
		//change values to delete node and patch up tree
		//LET THE CHILD DIE
		removeThis.setValue(small.getValue());
		smallPrev.setLeft(null);
		return true;
	}//end of removed
	
	

}//end of BinarySearchTree
