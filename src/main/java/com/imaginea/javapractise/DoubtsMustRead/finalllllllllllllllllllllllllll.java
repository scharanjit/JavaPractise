package DoubtsMustRead;

final class A {
    private int type;
    public int getType() {return type;}
}

public class finalllllllllllllllllllllllllll  // extends A   //because A is final
{
    public static void main(String args[])
    {
    	long time=System.currentTimeMillis();
    	
    	
            int N = 100000;
            int i = N;
            int t = 0;
            A aref = new A();   // because A is finla...it can be imstantiated but cannt be subclasesed or inherit
            while (i-- > 0)
            {
                    t = aref.getType();
                    System.out.println(t);
            }
            
            long time1= System.currentTimeMillis();
            
            System.out.println("Time diff : "+(time1-time));
    }
}

/*

Final Classes
When used in a class declaration, the final keyword means
the class can't be subclassed. In other words, no other class can ever extend (inherit
from) a final class, and any attempts to do so will give you a compiler error.
So why would you ever mark a class final? After all, doesn't that violate the
whole object-oriented (OO) notion of inheritance? You should make a final class
only if you need an absolute guarantee that none of the methods in that class will
ever be overridden. If you're deeply dependent on the implementations of certain
methods, then using final gives you the security that nobody can change the
implementation out from under you.

For example, the
String class cannot be subclassed. Imagine the havoc if you couldn't guarantee how
a String object would work on any given system your application is running on!

IF STRING WNT BE FINAL...PPL OVERRIDE string.lenght() METHOD & MAKE STUPID O/PS

 
 */
