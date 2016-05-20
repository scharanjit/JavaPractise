/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.puzzles;

import java.sql.SQLException;

/**
 *
 * @author charanjits
 */
public class Mocker<T extends Exception> {

    private void pleaseThrow(final Exception t) throws T {
        throw (T) t;
    }

    public static void main(String[] args) {
        try {
            new Mocker<RuntimeException>().pleaseThrow(new SQLException());
        } catch(final SQLException ex) {
            ex.printStackTrace();
        }
    }
}


/*

1. RuntimeException and SQLException both inherit from Exception, while RuntimeException is unchecked and SQLException is a checked exception.
2. Java generics are not reified, meaning that in compile time, the generic type information is “lost” and treated as if the code is replaced with the type’s bound or with Object if it doesn’t exist. This is what you call type erasure.

Naively we’d expect line 7 to cause a compilation error since you can’t cast SQLException to RuntimeException, but that’s not the case. What happens is that T is replaced with Exception so we have:

?
1
throw (Exception) t;  // t is also an Exception
Since pleaseThrow expects an Exception, and T is replaced with Exception, the cast is eliminated as if it wasn’t written. We can see that in bytecode:

?
1
2
3
4
5
6
7
8
9
10
11
12
private pleaseThrow(Ljava/lang/Exception;)V throws java/lang/Exception
L0
LINENUMBER 8 L0
ALOAD 1
ATHROW
L1
LOCALVARIABLE this LTemp; L0 L1 0
// signature LTemp<TT;>;
// declaration: Temp<T>
LOCALVARIABLE t Ljava/lang/Exception; L0 L1 1
MAXSTACK = 1
MAXLOCALS = 2
Just for fun, we tried to see what the bytecode will look like without generics involved, and the cast appeared right before the ATHROW statement:

?
1
CHECKCAST java/lang/RuntimeException
Now that we’re convinced there’s no casting involved, we can scratch off these two answers:
“Compilation fails because we cannot cast SQLException to RuntimeException”
“Throws ClassCastException because SQLException is not instanceof RuntimeException”

So we throw a SQLException after all, and you’d expect it to get caught by the 
catch block and get its stack trace. Well, not really. This game is rigged. 
Turns out the compiler gets confused just as we do, and the code makes it think
that the catch block is unreachable. For the unsuspecting bystander, there is no 
SQLException. The correct answer is that compilation fails because the compiler
doesn’t expect a SQLException to be thrown from the try block – 
When in fact it does get thrown!
*/