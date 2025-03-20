package HashMapImplementation;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    static class HasMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n - nodes
        private int N;// N - buckets
        private LinkedList<Node>[] buckets; // N = buckets.length

        @SuppressWarnings("unchecked")
        public HasMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            return Math.abs(key.hashCode() % N);
        }

        private int searchInLinkedList(K key, int bucketIndex) {
            LinkedList<Node> list = buckets[bucketIndex];

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).key.equals(key)) {
                    return i;
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (LinkedList<Node> list : oldBucket) {
                for (Node node : list) {
                    put(node.key, node.value);
                }
            }
        }

        // put function
        public void put(K key, V value) { // time complexity O(lambda)
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);// its provide data index

            if (dataIndex == -1) { // key doesn't exit
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            } else { // kye exits
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = value;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                // rehashing
                rehash();
            }
        }

        //containsKey
        public boolean containsKey(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);
            return dataIndex != -1;
        }

        public V remove(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);

            if (dataIndex == -1) {
                return null;
            } else {
                Node node = buckets[bucketIndex].remove(dataIndex);
                n--;
                return node.value;
            }
        }

        public V get(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);// its provide data index

            if (dataIndex == -1) { // key doesn't exit
                return null;
            } else { // kye exits
                Node node = buckets[bucketIndex].get(dataIndex);
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (LinkedList<Node> list : buckets) {
                for (Node node : list) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HasMap<String, Integer> map = new HasMap<>();

        map.put("India", 199);
        map.put("China", 300);

        ArrayList<String> keySet = map.keySet();

        for (String key : keySet) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println(map.remove("India"));
        System.out.println(map.get("India"));
    }
}
