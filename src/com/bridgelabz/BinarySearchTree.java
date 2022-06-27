package com.bridgelabz;

public class BinarySearchTree {
    public static Node insert(Node root, int value) {
        //comparison
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            // left-subtree
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to binary search tree !");

        int values[] = {56, 30, 70, 22, 40, 11, 3, 16, 60, 95, 65, 63, 67};

        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

    }
}

