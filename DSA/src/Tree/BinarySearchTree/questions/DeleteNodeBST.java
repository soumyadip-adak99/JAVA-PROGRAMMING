package Tree.BinarySearchTree.questions;

import Tree.BinarySearchTree.BuildTree;
import Tree.BinarySearchTree.Node;

public class DeleteNodeBST {
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        BuildTree bst = new BuildTree();
        Node root = null;

        for (int val : values) {
            root = bst.insert(root, val);
        }

        bst.inorderTraversal(root);

        deleteNode(root, 3);

        System.out.println();
        bst.inorderTraversal(root);
    }

    public static Node deleteNode(Node root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.data) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.data) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                deleteNode(root.right, IS.data);
            }
        }

        return root;
    }

    private static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
}
