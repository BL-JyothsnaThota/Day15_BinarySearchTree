package com.bridgelabz.bst;
public class BSTDemo {
    public static void main(String[] args) {

        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();

        // UC1 + UC2 data
        bst.add(56);
        bst.add(30);
        bst.add(70);
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

        System.out.println("Size of BST: " + bst.size());

        // ✅ UC3 → Search
        int searchKey = 63;
        boolean found = bst.search(searchKey);

        System.out.println("Is " + searchKey + " present? " + found);
    }
}