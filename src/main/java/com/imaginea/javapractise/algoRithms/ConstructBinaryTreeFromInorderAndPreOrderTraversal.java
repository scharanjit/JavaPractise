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
import java.util.ArrayList;
import java.util.List;

public class ConstructBinaryTreeFromInorderAndPreOrderTraversal {

    public static void main(String[] args) {
        new ConstructBinaryTreeFromInorderAndPreOrderTraversal();

    }

    public ConstructBinaryTreeFromInorderAndPreOrderTraversal() {
        int inorder[] = {20, 30, 35, 40, 45, 50, 55, 60, 70};
        int preorder[] = {50, 40, 30, 20, 35, 45, 60, 55, 70};

        Node n = constructTree(inorder, preorder);
        printINORDER(n);

    }

    public void printINORDER(Node root) {
        if (root != null) {
            printINORDER(root.left);
            System.out.print(" " + root.value);
            printINORDER(root.right);
        }
    }

    private static Node constructTree(int[] inorder, int[] preorder) {
        return constructTreeFromInOrderAndPreOrder(inorder, 0,
                inorder.length - 1, preorder, 0, preorder.length - 1);
    }

    private static Node constructTreeFromInOrderAndPreOrder(int[] inorder,
            int inStart, int inEnd, int[] preorder, int preStart, int preEnd) {
        if (inStart > inEnd) {
            return null;
        }

        if (inStart == inEnd) {
            return new Node(inorder[inStart]);
        }

        Node node = new Node(preorder[preStart]);

        int index = 0;

        //index will store the value of root in inorder tree
        for (int i = 0; i < inorder.length; i++) {
            if (preorder[preStart] == inorder[i]) {
                index = i;
                break;
            }
        }
          System.out.println(index);
        node.setLeft(constructTreeFromInOrderAndPreOrder(inorder, inStart,index - 1, preorder, preStart + 1, preStart + (index - inStart)));
        node.setRight(constructTreeFromInOrderAndPreOrder(inorder, index + 1,inEnd, preorder, preStart + (index - inStart) + 1, preEnd));
        return node;
    }

}
