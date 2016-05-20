/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoRithms;

/**
 *
 * @author charanjit.singh
 */
public class StackArrayUsage {

    public static void main(String[] args) throws Exception {

        StackArrayImple r = new StackArrayImple();

        System.out.println("Stack is empty : true|false -->" + r.isEmpty());
        StackArrayImple r1 = new StackArrayImple(54);
        r1.push(3);
        r1.push(5);
        r1.push(7);
        r1.printElement();
        System.out.println("Element popped from top is :" + r1.pop());
        System.out.println("Size : " + r1.size());
        r1.push(9);
         r1.printElement();
        System.out.println("Top:- "+r1.top());
        r1.printElement();

    }

}
