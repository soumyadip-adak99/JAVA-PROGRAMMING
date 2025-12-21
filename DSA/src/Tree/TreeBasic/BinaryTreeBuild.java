package Tree.TreeBasic;

public class BinaryTreeBuild {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BuildTree {
        static int index = -1;

        public Node buildTree(int[] nodes) {
            index++;

            if (index > nodes.length || nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BuildTree tree = new BuildTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
