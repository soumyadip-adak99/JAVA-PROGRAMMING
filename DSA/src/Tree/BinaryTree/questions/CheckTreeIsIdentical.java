package Tree.BinaryTree.questions;


import Tree.BinaryTree.Node;
import Tree.BinaryTree.Tree;

public class CheckTreeIsIdentical {
    public static void main(String[] args) {
        int[] node1 = {1, 2, 4, -1, -1, 3, -1, -1};
        int[] node2 = {1, 2, 4, -1, -1, 3, -1, -1};
        Tree tree = new Tree();

        tree.index = -1;
        Node root1 = tree.buildTree(node1);

        tree.index = -1;
        Node root2 = tree.buildTree(node2);

        System.out.println(isIdentical(root1, root2));
    }

    public static boolean isIdentical(Node root1, Node root2) {
        // both are null
        if (root1 == null && root2 == null) {
            return true;
        }

        // one null another not
        if (root1 == null || root2 == null) {
            return false;
        }

        return
                // check root data
                (root1.data == root2.data)
                        // and check root 1 left and right nodes
                        && isIdentical(root1.left, root1.left)
                        // and check root 2 left and right nodes
                        && isIdentical(root2.left, root2.left);
    }
}
