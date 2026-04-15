package com.bridgelabz.bst;
public class BSTDemo {
    public static void main(String[] args) {

        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.println("UC1 Done (56 root, 30 left, 70 right)");
    }
}