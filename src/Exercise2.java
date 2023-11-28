import java.util.ArrayList;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter data for binary tree: ");

        ArrayList<BinaryTree> nodes = new ArrayList<BinaryTree>();

        String line = in.nextLine();
        String[] data = line.split(" ");

        for (int i = 0; i < data.length; i++) {
            BinaryTree<String> node = new BinaryTree<String>();
            node.makeRoot(data[i]);
            nodes.add(node);
        }

        BinaryTree<String> root = nodes.get(0);

        for (int i = 1; i < nodes.size(); i++) {
            buildTree(root, nodes.get(i));
        }

        // test statements
        System.out.printf("Height of the tree is: %d\n", BinaryTree.height(root));

        System.out.printf("Number of nodes in the tree is: %d\n", BinaryTree.nodes(root));

        System.out.println();

        System.out.print("Inorder:\t");
        BinaryTree.inorder(root);
        System.out.println();

        System.out.print("Preorder:\t");
        BinaryTree.preorder(root);
        System.out.println();

        System.out.print("Postorder:\t");
        BinaryTree.postorder(root);
        System.out.println();

        System.out.print("Level order:\t");
        BinaryTree.levelOrder(root);
        System.out.println();
        System.out.println();

        System.out.printf("And is it height balanced... %s\n", BinaryTree.heightBalanced(root) ? "Yes!" : "No.");

        System.out.println();
    }
    private static void buildTree(BinaryTree<String> root, BinaryTree<String> node) {
        if (root == null || node == null)
            return;

        ArrayList<BinaryTree<String>> trees = new ArrayList<>();
        trees.add(root);

        int index = 0;
        while (index < trees.size()) {
            BinaryTree<String> curr = trees.get(index);

            if (curr.getLeft() == null) {
                curr.attachLeft(node);
                return;
            }
            trees.add(curr.getLeft());

            if (curr.getRight() == null) {
                curr.attachRight(node);
                return;
            }
            trees.add(curr.getRight());

            index++;
        }
    }
}


