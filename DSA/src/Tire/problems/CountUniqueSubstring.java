package Tire.problems;

/**
 * Given a string of length n of lowercase alphabet characters, we need to count total numbers of distinct substrings of this string.
 *
 */

public class CountUniqueSubstring {
    public static class Node {
        Node[] children;
        boolean endOfWord;

        public Node() {
            children = new Node[26];
            endOfWord = false;
        }
    }

    static Node root = null;

    public static void insert(String word) {
        Node currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (currentNode.children[idx] == null)
                currentNode.children[idx] = new Node();

            if (i == word.length() - 1)
                currentNode.children[idx].endOfWord = true;

            currentNode = currentNode.children[idx];
        }
    }

    public static int countOfNode(Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countOfNode(root.children[i]);
            }
        }

        return count + 1;
    }

    public static void main(String[] args) {
        String str = "ababa";
        root = new Node();

        // Insert all suffixes
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(STR."Total distinct substrings: \{countOfNode(root)}");
    }
}

