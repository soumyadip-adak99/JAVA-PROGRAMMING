package Tree.BinaryTree.questions;

import Tree.BinaryTree.Node;
import Tree.BinaryTree.Tree;


public class SubTreeOfAnotherTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.buildTree(new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1});
        Node subRoot = tree.buildTree(new int[]{1, 2, 4});
        System.out.println(isSubTree(root, subRoot));
    }

    public static boolean isSubTree(Node root, Node subRoot) {
        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        return isIdentical(root.left, subRoot.left) || isIdentical(root.right, subRoot.right);
    }
}
