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
public class NewClassTreee {
    public static void main(String[] args) {
        int in[] = {20, 30, 35, 40, 45, 50, 55, 60, 70};
        int pre[] = {50, 40, 30, 20, 35, 45, 60, 55, 70};
        NodeS n = compute(pre, in);
    }
    public static NodeS compute(int[] pre, int in[]) {
        NodeS n=fin(in, 0, in.length - 1, pre, 0, pre.length - 1);
        printINORDER(n);
        return n;
        
    }
    public static NodeS fin(int[] in, int iStart, int iEnd, int pre[], int pStart, int pEnd) {
        //chekcking the length of inorder tree
        if (iStart > iEnd) {
            return null;
        }
        //if inorder contains one element
        if (iStart == iEnd) {
            return new NodeS(in[iStart]);
        }
        //setting the root node
        NodeS node = new NodeS(pre[pStart]); //becuase element of preOrder isroot
        int index = 0;
        //finding the index of root element in inorder...ie,e.50 is root...its index in Inorder is 5
        for (int i = 0; i < in.length; i++) {
            if ( pre[pStart]==in[i] ) {
                index = i;
                break;
            }
        } //recursion below
        node.setLeft(fin(in,iStart,index-1,pre,pStart+1,pStart+(index-iStart)));
        node.setRight(fin(in,index+1,iEnd,pre,pStart+(index-iStart)+1,pEnd));
        return node;

    }
    private static void printINORDER(NodeS root) {
  if (root != null) {
            printINORDER(root.left);
            System.out.print(" " + root.value);
            printINORDER(root.right);
        }
    }
}
class NodeS {
    public int value;
    public NodeS left;
    public NodeS right;
     public NodeS root1;
    public NodeS(int val) {
        this.value = val;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public NodeS getLeft() {
        return left;
    }
    public void setLeft(NodeS left) {
        this.left = left;
    }
    public NodeS getRight() {
        return right;
    }
    public void setRight(NodeS right) {
        this.right = right;
    }
}
