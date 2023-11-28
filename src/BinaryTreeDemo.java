public class BinaryTreeDemo {
	public static void main(String[] args) {

		BinaryTree<String> apple = new BinaryTree<String>();
		BinaryTree<String> banana = new BinaryTree<String>();
		BinaryTree<String> orange = new BinaryTree<String>();
		BinaryTree<String> raspberry = new BinaryTree<String>();
		BinaryTree<String> strawberry = new BinaryTree<String>();
		BinaryTree<String> tangerine = new BinaryTree<String>();

		apple.makeRoot("apple");
		banana.makeRoot("banana");
		orange.makeRoot("orange");
		raspberry.makeRoot("raspberry");
		strawberry.makeRoot("strawberry");
		tangerine.makeRoot("tangerine");

		apple.attachLeft(banana);
		apple.attachRight(orange);
		banana.attachLeft(raspberry);
		banana.attachRight(strawberry);
		orange.attachLeft(tangerine);

		// test statements
		System.out.printf("Height of the tree is: %d\n", BinaryTree.height(apple));

		System.out.printf("Number of nodes in the tree is: %d\n", BinaryTree.nodes(apple));

		System.out.println();

		System.out.print("Inorder:\t");
		BinaryTree.inorder(apple);
		System.out.println();

		System.out.print("Preorder:\t");
		BinaryTree.preorder(apple);
		System.out.println();

		System.out.print("Postorder:\t");
		BinaryTree.postorder(apple);
		System.out.println();

		System.out.print("Level order:\t");
		BinaryTree.levelOrder(apple);
		System.out.println();
		System.out.println();

		System.out.printf("And is it height balanced... %s\n", BinaryTree.heightBalanced(apple) ? "Yes!" : "No.");

		System.out.println();
	}

}
