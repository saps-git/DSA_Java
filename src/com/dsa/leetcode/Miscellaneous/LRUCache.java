package com.dsa.leetcode.Miscellaneous;

import java.util.HashMap;

//Leetcode-146
public class LRUCache {
    class Node {
        int key;
        int val;
        Node prev;
        Node next;
    }
    Node head = new Node();
    Node tail = new Node();

    HashMap<Integer, Node> map;
    int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        int result = -1;
        if(map.containsKey(key)) {
            Node curr = map.get(key);
            result = curr.val;
            remove(curr);
            add(curr);
        }
        return result;
    }

    public void put(int key, int value) {
        Node curr;
        if(map.containsKey(key)) {
            curr = map.get(key);
            remove(curr);
            curr.val = value;
            add(curr);
        } else {
            if(map.size() == capacity) {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            curr = new Node();
            curr.key = key;
            curr.val = value;
            map.put(key, curr);
            add(curr);
        }
    }

    public void add(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public static void main(String[] args) {
        int capacity = 2;
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lRUCache.get(2));     // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lRUCache.get(1));     // return -1 (not found)
        System.out.println(lRUCache.get(3));    // return 3
        System.out.println(lRUCache.get(4));     // return 4
        lRUCache.put(4,5);
        System.out.println(lRUCache.get(4));
    }
}
