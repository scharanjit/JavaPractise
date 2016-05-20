/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoRithms;

/**
 *
 * @author Charanjit.Singh
 */
public class BinarySearchTree {

    public Node root;

    public void insert(int value) {
        Node node = new Node<>(value);

        if (root == null) {
            root = node;
            return;
        }

        insertRec(root, node);

    }

    private void insertRec(Node latestRoot, Node node) {

        
        if (latestRoot.value < node.value) {
            if (latestRoot.left == null) {
                latestRoot.left = node;
                return;
            } else {
                insertRec(latestRoot.left, node);
            }
        } else {
            if (latestRoot.right == null) {
                latestRoot.right = node;
                return;
            } else {
                insertRec(latestRoot.right, node);
            }
        }
    }

    /**
     * Returns the minimum value in the Binary Search Tree.
     */
    public int findMinimum() {
        if (root == null) {
            return 0;
        }
        Node currNode = root;
        while (currNode.left != null) {
            currNode = currNode.left;
        }
        return currNode.value;
    }

    /**
     * Returns the maximum value in the Binary Search Tree
     */
    public int findMaximum() {
        if (root == null) {
            return 0;
        }

        Node currNode = root;
        while (currNode.right != null) {
            currNode = currNode.right;
        }
        return currNode.value;
    }

    /**
     * Printing the contents of the tree in an inorder way.
     */
    public void printInorder() {
        printInOrderRec(root);
        System.out.println("");
    }

    /**
     * Helper method to recursively print the contents in an inorder way
     */
    private void printInOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        printInOrderRec(currRoot.left);
        System.out.print(currRoot.value + ", ");
        printInOrderRec(currRoot.right);
    }

    /**
     * Printing the contents of the tree in a Preorder way.
     */
    public void printPreorder() {
        printPreOrderRec(root);
        System.out.println("");
    }

    /**
     * Helper method to recursively print the contents in a Preorder way
     */
    private void printPreOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        System.out.print(currRoot.value + ", ");
        printPreOrderRec(currRoot.left);
        printPreOrderRec(currRoot.right);
    }

    /**
     * Printing the contents of the tree in a Postorder way.
     */
    public void printPostorder() {
        printPostOrderRec(root);
        System.out.println("");
    }

    /**
     * Helper method to recursively print the contents in a Postorder way
     */
    private void printPostOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        printPostOrderRec(currRoot.left);
        printPostOrderRec(currRoot.right);
        System.out.print(currRoot.value + ", ");

    }
//    public  Node search(int ele,int k){
//        Node x=root;
//        if (x==null) return null;
//        if (k==root.value) return x;
//        
//    
//        
//    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(40);
        bst.insert(25);
        bst.insert(78);
        bst.insert(10);
        bst.insert(3);
        bst.insert(17);
        bst.insert(32);
        bst.insert(30);
        bst.insert(38);
        bst.insert(78);
        bst.insert(50);
        bst.insert(93);
        System.out.println("Inorder traversal");
        bst.printInorder();

        System.out.println("Preorder Traversal");
        bst.printPreorder();

        System.out.println("Postorder Traversal");
        bst.printPostorder();

        System.out.println("The minimum value in the BST: " + bst.findMinimum());
        System.out.println("The maximum value in the BST: " + bst.findMaximum());

    }
}
