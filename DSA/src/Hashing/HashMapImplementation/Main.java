package Hashing.HashMapImplementation;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    // HashMap class constructor
    public static class HashMap<K, V> {
        // Node class
        public class Node {
            K key;
            V value;

            // node class constructor
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n - nodes
        private int N; // N - size of an array/buckets
        private LinkedList<Node>[] buckets;

        //HasMap class constructor
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            return Math.abs(key.hashCode()) % N;
        }

        private int searchInLinkedList(K key, int bucketIdx) {
            LinkedList<Node> list = buckets[bucketIdx];

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).key == key)
                    return i;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N * 2];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (LinkedList<Node> list : oldBucket) {
                for (Node node : list) {
                    put(node.key, node.value);
                }
            }
        }

        // put function
        public void put(K key, V value) {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLinkedList(key, bucketIdx);

            if (dataIdx == -1) { // key doesn't exist
                buckets[bucketIdx].add(new Node(key, value));
                n++;
            } else { // key exists
                Node node = buckets[bucketIdx].get(dataIdx);
                node.value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                // rehashing
                rehash();
            }
        }

        // get function
        public V get(K key) {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLinkedList(key, bucketIdx);

            if (dataIdx == -1)
                return null;
            else
                return buckets[bucketIdx].get(dataIdx).value;
        }

        // contains key
        public boolean containsKey(K key) {
            return searchInLinkedList(key, hashFunction(key)) != -1;
        }

        // remove key
        public V remove(K key) {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLinkedList(key, bucketIdx);

            if (dataIdx == -1)
                return null;
            else
                return buckets[bucketIdx].remove(dataIdx).value;
        }

        // get key set function
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (LinkedList<Node> list : buckets) {
                for (Node node : list) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // is empty function
        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 30);
        map.put("USA", 20);
        map.put("Russia", 50);

        System.out.println(map.get("India"));

        if (map.containsKey("USA")) {
            System.out.println(map.remove("USA"));
        }

        System.out.println(map.keySet());
    }
}