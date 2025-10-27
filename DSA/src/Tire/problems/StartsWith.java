package Tire.problems;

import Tire.TrieImpl;

/**
 * Create a function boolean startsWith(String prefix) for a trie. Returns true if there is previously inserted string word
 * that has the prefix, and false otherwise.
 *
 */

public class StartsWith {
    public static boolean isStartWith(String prefix) {
        TrieImpl.Node currentNode = TrieImpl.root;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if(currentNode.children[idx] == null) {
                return false;
            }
            currentNode = currentNode.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "app", "mango", "man", "woman"};
        String prefix = "app";

        TrieImpl trie = new TrieImpl();

        for(String str : words) {
            trie.insert(str);
        }

        System.out.println(isStartWith(prefix));
    }
}
