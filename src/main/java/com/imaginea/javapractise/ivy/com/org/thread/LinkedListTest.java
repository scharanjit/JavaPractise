/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivy.com.org.thread;

/**
 *
 * @author charanjit.singh
 */
public class LinkedListTest {

    public static void main(String args[]) {
//creating LinkedList with 5 elements including head 
        LinkedList linkedList = new LinkedList();
        linkedList.appendIntoTail(new LinkedList.Node("101"));
        linkedList.appendIntoTail(new LinkedList.Node("201"));
        linkedList.appendIntoTail(new LinkedList.Node("301"));
        linkedList.appendIntoTail(new LinkedList.Node("401"));
        System.out.println("Linked List : " + linkedList);
        if (linkedList.isCyclic()) {
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        } else {
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }
        
        
        //creating LinkedList with 5 elements including head
        LinkedList linkedList1 = new LinkedList(); 
        linkedList1.appendIntoTail(new LinkedList.Node("101")); 
        LinkedList.Node cycle = new LinkedList.Node("201");
        linkedList1.appendIntoTail(cycle); 
        linkedList1.appendIntoTail(new LinkedList.Node("301")); 
        linkedList1.appendIntoTail(new LinkedList.Node("401"));
        linkedList1.appendIntoTail(cycle);

        
        if(linkedList1.isCyclic()){
            System.out.println("Linked List is cyclic as it contains cycles or loop"); 
        }
        else
        {
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        } 


    }
}
