package Tire;

public class TrieImpl {
    public static class Node {
        public Node[] children;
        public boolean endOfWord;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++)
                children[i] = null;

            endOfWord = false;
        }
    }

   public static Node root = new Node();

    public void insert(String word) {
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

    public boolean search(String key) {
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


    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};
        TrieImpl trie = new TrieImpl();

        for (String word : words) {
            trie.insert(word);
        }

        System.out.println(trie.search("the"));
        System.out.println(trie.search("thor"));
        System.out.println(trie.search("an"));
    }
}
