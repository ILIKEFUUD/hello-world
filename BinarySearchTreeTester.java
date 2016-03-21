
public class BinarySearchTreeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree tree = new BinarySearchTree();
		
		//test insert method
		tree.insert("B");
		tree.insert("A");
		tree.insert("C");
		tree.insert("D");
		tree.insert("M");
		tree.insert("L");
		tree.insert("Z");
		tree.insert("K");
		
		//test find method
		System.out.println("Test find method\n");
		System.out.println("Find M, expecting: M");
		System.out.println("Test: " + tree.find("M").getValue());
		
		System.out.println();
		
		System.out.println("Find Z, expecting: Z");
		System.out.println("Test: " + tree.find("Z").getValue());
		
		//test inOrder traversal
		System.out.println("\nInOrder: ");
		tree.inOrder();
		System.out.println("\nA B C D K L M Z is expected");
		
		System.out.println("\nPostOrder: ");
		
		//test postOrder traversal
		tree.postOrder();
		System.out.println("\nA K L Z M D C B is expected");
		
		System.out.println("\nPreOrder: ");
		
		//test preOrder traversal
		tree.preOrder();
		System.out.println("\nB A C D M L K Z is expected\n\n");
		
		
		//test remove
		System.out.println("Tree:");
		tree.inOrder();
		
		System.out.println("Testing remove method. Removing A.");
		System.out.println(tree.remove("A"));
		System.out.println("Expecting: true");
		System.out.println("Expecting \nB C D K L M Z");
		tree.inOrder();
		System.out.println("\n--------------------------------------");
		System.out.println("Testing remove method. Removing M.");
		System.out.println(tree.remove("M"));
		System.out.println("Expecting: true");
		System.out.println("Expecting \nB C D K L Z");
		tree.inOrder();
		System.out.println("\n----------------------------------------");
		System.out.println("Testing remove method. Removing G.");
		System.out.println(tree.remove("G"));
		System.out.println("Expecting: false, does not exist");
		System.out.println("Expecting \nB C D K L Z");
		tree.inOrder();
	}//end main

}//end BinarySearchTreeTester
