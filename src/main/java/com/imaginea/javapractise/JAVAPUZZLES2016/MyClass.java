/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imaginea.javapractise.JAVAPUZZLES2016;

/**
 *
 * @author charanjits
 */
public class MyClass {

    private static void callMe(MyClass... m) {
        m[0]=m[1];
        m[1].name="new name";
    }
    private String name;
    
    public static void main(String[] args) {
        MyClass m1= new MyClass();
        MyClass m2 = new MyClass();
        
        m1.name=m2.name="m1";
        
        callMe(m1,m2);
        
        System.out.println(m1+"&"+m2);
    }
    
}

/*
This one is actually much more simple, just from looking at line 12 we can see that this code prints out m1 and m2, rather than, m1.name and m2.name. The tricky part here was remembering that when printing out a class, Java uses its toString method. The “name” field was artificially added. If you miss that and follow the rest of the code correctly, you might be tricked to choose m1 & new name.

This line sets both names to “m1”:

?
1
m1.name = m2.name = "m1";
Then callMe sets m2’s name to new name, and we’re done.

But this snippet will actually print out something like this, including the class name and hashcode:

?
1
MyClass@3d0bc85 & MyClass@7d08c1b7
And the correct answer would be “None of the above”.

*/
