package Tree.BinaryTree.TreeBasic;

import Tree.BinaryTree.Node;
import Tree.BinaryTree.Tree;

public class TreeTraversal {
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree tree = new Tree();
        Node root = tree.buildTree(nodes);

        System.out.print("preOrder traversal: ");
        preOrder(root);

        System.out.print("\ninOrder traversal: ");
        inOrder(root);

        System.out.print("\npostOrder traversal: ");
        postOrder(root);
    }

    // preOrder traversal
    static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // inOrder traversal
    static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // postOrder traversal
    static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
