package OCJPChap10;

public class _3 {

}


/*
 *
 3. Given the default classpath:
/foo
And this directory structure:
foo
|
test
|
xcom
|--A.class
|--B.java
And these two files:
package xcom;
public class A { }
package xcom;
public class B extends A { }



Which allows B.java to compile? (Choose all that apply.)
A. Set the current directory to xcom then invoke
javac B.java
B. Set the current directory to xcom then invoke
javac -classpath . B.java
C. Set the current directory to test then invoke
javac -classpath . xcom/B.java
D. Set the current directory to test then invoke
javac -classpath xcom B.java
E. Set the current directory to test then invoke
javac -classpath xcom:. B.java

Answer:

C is correct. In order for B.java to compile, the compiler first needs to be able to find
B.java. Once it's found B.java it needs to find A.class. Because A.class is in the
xcom package the compiler won't find A.class if it's invoked from the xcom directory.
Remember that the -classpath isn't looking for B.java, it's looking for whatever classes
B.java needs (in this case A.class).
 * 
 * */
 