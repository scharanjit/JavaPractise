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
public class StackArrayImple implements StackArray {

    public static final int CAPACITY = 1024;
    private int N; //maximum capacity
    private Object S[]; //array based Stack 
    private int t = -1;

    public StackArrayImple() { //initialize the stack with given capacity
        this(CAPACITY);
    }

    public StackArrayImple(int cap) { //initialize the stack with given capacity
        N = cap;

        S = new Object[N];
    }

    @Override
    public int size() {
        return (t + 1);
    }

    @Override
    public boolean isEmpty() {  // return true if stack is empty
        return (t < 0);
    }

    @Override
    public Object top() throws StackEmptyException {

        if (isEmpty()) {
            throw new StackEmptyException("Empty");
        } else //optional ti write else
        {
            return (S[t]);
        }
    }

    /**
     *
     * @param element
     * @throws StackOverFlowException
     */
    @Override
    public void push(Object element) throws StackOverFlowException {
        if (size() == N) {
            throw new StackOverFlowException("full");
        } else {
            S[++t] = element;
        }
    }

    @Override
    public Object pop() throws StackEmptyException {
        int ele;
        if (isEmpty()) {
            throw new StackEmptyException("Empty");
        } else {
            ele = (int) S[t];
            S[t--] = null;
        }
        return ele;
    }

    public void printElement() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("empty");
        } else {
            System.out.println("Stack is ");
            for (int i = 0; i < size(); i++) {
                System.out.print(" "+S[i]);
            }
            System.out.println("");

        }

    }

}
