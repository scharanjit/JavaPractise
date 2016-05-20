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
class NodeL {

    public int data1;
    public double data2;
    public NodeL nextNode;

    //Link constructor
    public NodeL(int d1, double d2) {
        data1 = d1;
        data2 = d2;
    }

    //Print NodeL data
    public void printNode() {
        System.out.print("{" + data1 + ", " + data2 + "} ");
    }
}

class LinkList {

    private NodeL first;

    //LinkList constructor
    public LinkList() {
        first = null;
    }

    //Returns true if list is empty
    public boolean isEmpty() {
        return first == null;
    }

    //Inserts a new NodeL at the first of the list
    public void insert(int d1, double d2) {
        NodeL link = new NodeL(d1, d2);
        link.nextNode = first;
        first = link;
    }

    //Deletes the link at the first of the list
    public NodeL delete() throws EmptyLinkedlistException {
        if (isEmpty()) {
            throw new EmptyLinkedlistException();
        } else {
            NodeL temp = first;
            first = first.nextNode;
            return temp;
        }

    }
    //Prints list data
    public void printList() throws EmptyLinkedlistException {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            NodeL currentLink = first;
            System.out.print("List: ");
            while (currentLink != null) {
                currentLink.printNode();
                currentLink = currentLink.nextNode;
            }
            System.out.println("");
        }
    }
}
public class LinkListTest {
    public static void main(String[] args) throws EmptyLinkedlistException {
        LinkList list = new LinkList();
        list.insert(1, 1.01);
        list.insert(2, 2.02);
        list.insert(3, 3.03);
        list.insert(4, 4.04);
        list.insert(5, 5.05);
        list.printList();
        while (!list.isEmpty()) {
            NodeL deletedLink = list.delete();
            System.out.print("deleted: ");
            deletedLink.printNode();
            System.out.println("");
        }
        list.printList();
    }
}
