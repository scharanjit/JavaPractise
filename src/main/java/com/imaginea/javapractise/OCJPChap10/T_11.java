package OCJPChap10;

public class T_11 {

}

/*
 * 
 * 
 * Here are some rules concerning the structure of JAR files:
 The jar command creates the META-INF directory automatically.
 The jar command creates the MANIFEST.MF file automatically.
 The jar command won’t place any of your files in META-INF/.
 As you can see above, the exact tree structure is represented.
 java and javac will use the JAR like a normal directory tree.
 * 
 * 
 * 
 * 
 * Finding a JAR file using a classpath is similar to finding a
package file in a classpath. The difference is that when you specify a path for a JAR
file, you must include the name of the JAR file at the end of the path. Let's say you want
to compile UseStuff.java in the test directory, and UseStuff.java needs access
to a class contained in myApp.jar. To compile UseStuff.java say
cd test
javac -classpath ws/myApp.jar UseStuff.java
 * 
 * 
 * 
 * 
 * 
 11. Given the following directory structure:
test-|
	 |- GetJar.java
	 |
	 |- myApp-|
 			  |-Foo.java
And given the contents of GetJar.java and Foo.java:
3. public class GetJar {
4. public static void main(String[] args) {
5. System.out.println(myApp.Foo.d);
6. }
7. }
3. package myApp;
4. public class Foo { public static int d = 8; }


If the current directory is "test", and myApp/Foo.class is placed in a JAR file called MyJar.jar
located in test, which set(s) of commands will compile GetJar.java and produce the output 8?
(Choose all that apply.)
A. javac -classpath MyJar.jar GetJar.java
	java GetJar
B. javac MyJar.jar GetJar.java			<--syntax wrong
	java GetJar
C. javac -classpath MyJar.jar GetJar.java
	java -classpath MyJar.jar GetJar
D. javac MyJar.jar GetJar.java					<--syntax wrong
	java -classpath MyJar.jar GetJar


A is correct. Given the current directory and where the necessary files are located, these
are the correct command line statements.


B and D are wrong because javac MyJar.jar GetJar.java is incorrect syntax. C is wrong
because the -classpath MyJar.java in the java invocation does not include the test directory.
 * 
 * */
