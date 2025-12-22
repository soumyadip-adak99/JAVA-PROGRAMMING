package Tree.BinaryTree.TreeAdvance;

public class BuildBinaryTree {

    static class Node<T> {
        T data;
        Node<T> left, right;

        public Node(T data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class BuildTree<T> {
        static int index = -1;

        public Node<T> buildTree(T[] nodes) {
            index++;

            if (index >= nodes.length || nodes[index] == null) {
                return null;
            }

            Node<T> newNode = new Node<>(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void main(String[] args) {
        Integer[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildTree<Integer> tree = new BuildTree<>();
        Node<Integer> root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
