package com.bridgelabz.bst;
class MyBinarySearchTree<K extends Comparable<K>> {

    private INode<K> root;
    private int size = 0;

    public void add(K key) {
        root = addRec(root, key);
    }

    private INode<K> addRec(INode<K> node, K key) {
        if (node == null) {
            size++;
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(node.getKey()) < 0) {
            node.setLeft(addRec(node.getLeft(), key));
        } else if (key.compareTo(node.getKey()) > 0) {
            node.setRight(addRec(node.getRight(), key));
        }

        return node;
    }

    public int size() {
        return size;
    }

    // ✅ UC3 ADDITION
    public boolean search(K key) {
        return searchRec(root, key);
    }

    private boolean searchRec(INode<K> node, K key) {
        if (node == null)
            return false;

        if (key.equals(node.getKey()))
            return true;

        if (key.compareTo(node.getKey()) < 0)
            return searchRec(node.getLeft(), key);
        else
            return searchRec(node.getRight(), key);
    }
}