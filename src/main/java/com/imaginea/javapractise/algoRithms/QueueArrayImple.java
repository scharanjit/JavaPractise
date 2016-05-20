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
public class QueueArrayImple {

    private int N=6;  //size of array
    private Object Q[]= new Object[N];;
    private int rI = 0;

    private int fI = 0;

   
        
       
  

    public int size() {
//        if (fI == rI) {
//            return 0;
//        } else {
            return ( rI-fI);
//        }
    }

    public boolean isEmpty() {
        return (fI == rI);
    }

    public void enQueue(Object ele) throws QueueFullException {
        if (size() == (N - 1)) {
            throw new QueueFullException(" full");
        } else {

            Q[rI] = ele;
           
            rI =rI + 1;
        }
    }

    public Object deQueue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException(" empty");
        } else {
int ele = (int) Q[fI];
            Q[fI] = null;
            fI = fI + 1;
            return "removed : " + ele;
        }

    }

    public Object front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException(" empty");
        } else {
            return "front ele : " + Q[fI];
        }
    }

}
