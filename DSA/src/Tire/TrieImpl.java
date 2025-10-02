package Tire;

import java.util.Arrays;

public class TrieImpl {
    static class Node {
        Node[] children;
        boolean endOfWord;

        public Node() {
            children = new Node[26]; // a to z
            Arrays.fill(children, null);
            endOfWord = false;
        }
    }

    // root node (always empty)
    static Node root = new Node();

    /**
     * insert function in Trie Data structure,
     * insert function takes O(L) time complexity [L -> means length of string]
     */
    public static void insert(String word) {
        Node curr = root; 

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                // add new node
                curr.children[idx] = new Node();
            }

            if (i == word.length() - 1) {
                curr.children[idx].endOfWord = true;
            }

            curr = curr.children[idx];
        }
    }

    /**
     * search function in Trie Data structure,
     * search function takes O(L) time complexity [L -> means length of string]
     */
    public static boolean search(String key) {
        Node curr = root; 

        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null)
                return false;

            if (i == key.length() - 1 && !node.endOfWord)
                return false;

            curr = node;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] word = { "then", "a", "there", "their", "any" };
        for (String str : word) {
            insert(str);
        }

        System.out.println(search("then")); // true
        System.out.println(search("thor")); // false
        System.out.println(search("a")); // true
        System.out.println(search("any")); // true
    }
}
