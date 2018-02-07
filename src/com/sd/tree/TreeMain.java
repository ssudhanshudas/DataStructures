package com.sd.tree;

public class TreeMain {
    public static void main(String[] args) {
        Operations op = new Operations();
        Node root = new Node(5);

        Node leftNode = new Node(3);
        Node rightNode = new Node(10);
        Node rightNode1 = new Node(6);
        Node rightNode2 = new Node(15);

        root.left = leftNode;
        root.right = rightNode;
        rightNode.left = rightNode1;
        rightNode.right = rightNode2;
        System.out.println("");
        op.preOrder(root);
        System.out.println("");
        op.inOrder(root);
        System.out.println("");
        op.postOrder(root);
        System.out.println("");
        System.out.println("Height : "+ op.height(root));
    }
}
