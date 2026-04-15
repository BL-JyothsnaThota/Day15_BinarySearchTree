package com.bridgelabz.bst;
public class BSTDemo {
    public static void main(String[] args) {

        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();

        // UC1 nodes
        bst.add(56);
        bst.add(30);
        bst.add(70);

        // UC2 additional nodes (build full tree)
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(65);
        bst.add(3);
        bst.add(16);
        bst.add(63);
        bst.add(67);

        // ✅ Verify size
        System.out.println("Size of BST: " + bst.size());
    }
}