package com.bridgelabz.bst;
class MyBinarySearchTree<K extends Comparable<K>> {

    private INode<K> root;

    public void add(K key) {
        root = addRec(root, key);
    }

    private INode<K> addRec(INode<K> node, K key) {
        if (node == null) {
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(node.getKey()) < 0) {
            node.setLeft(addRec(node.getLeft(), key));
        } else if (key.compareTo(node.getKey()) > 0) {
            node.setRight(addRec(node.getRight(), key));
        }

        return node;
    }
}