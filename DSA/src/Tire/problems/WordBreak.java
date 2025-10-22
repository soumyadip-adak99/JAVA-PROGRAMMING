package Tire.problems;

import Tire.TrieImpl;

public class WordBreak {
    static class Node {
        Node[] children;
        boolean endOfWord;

        public Node() {
            this.children = new Node[26];

            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }

            endOfWord = false;
        }
    }

    static Node root = new Node();

    // insert in trie
    public static void insert(String word) {
        Node currentNode = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (currentNode.children[idx] == null) {
                currentNode.children[idx] = new Node();
            }

            if (i == word.length() - 1) {
                currentNode.children[idx].endOfWord = true;
            }

            currentNode = currentNode.children[idx];
        }
    }

    // search in trie
    public static boolean search(String key) {
        Node currentNode = root;

        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';

            if (currentNode.children[idx] == null)
                return false;

            if (i == key.length() - 1 && !currentNode.children[idx].endOfWord)
                return false;

            currentNode = currentNode.children[idx];
        }

        return true;
    }

    public static boolean wordBreak(String key) {
        if (key.isEmpty())
            return true;


        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);

            if (search(firstPart) && wordBreak(secondPart)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "sung", "samsung", "mobile"};
        String key = "ilikesamsung";

        for (String word : words)
            insert(word);

        System.out.println(wordBreak(key));
    }
}
