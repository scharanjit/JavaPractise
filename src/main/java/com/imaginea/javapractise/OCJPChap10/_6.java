package OCJPChap10;

public class _6 {

}


/*6. Given two files:
 package pkgA;
 public class Foo {
 int a = 5;
 protected int b = 6;
 }

1. package pkgB;
2. import pkgA.*;
3. public class Fiz extends Foo {
4. public static void main(String[] args) {
5. Foo f = new Foo();
6. System.out.print(" " + f.a);
7. System.out.print(" " + f.b);
8. System.out.print(" " + new Fiz().a);
9. System.out.println(" " + new Fiz().b);
10. }
11. }
What is the result? (Choose all that apply.)
A. 5 6 5 6
B. 5 6 followed by an exception
C. Compilation fails with an error on line 6
D. Compilation fails with an error on line 7
E. Compilation fails with an error on line 8
F. Compilation fails with an error on line 9
Answer:

 C, D, and E are correct. Variable a (default access) cannot be accessed from outside the
package. Since variable b is protected, it can be accessed only through inheritance.

*/