package OCJPChap10;

public class T_12 {

}


/*
12. Given the following directory structure:
x-|
  |- GoDeep.class
  |
  |- test-| (test contains MyJar.jar...like import test.MYjar.jar.*; ese dekho
		  |- MyJar.jar
		  |
		  |- myApp-|
				   |-Foo.java
				   |-Foo.class
And given the contents of GoDeep.java and Foo.java:
3. public class GoDeep {
4. public static void main(String[] args) {
5. System.out.println(myApp.Foo.d);
6. }
7. }
3. package myApp;
4. public class Foo { public static int d = 8; }

HINT:- we need MyJar.jar containing Foo.class file for successful execution of GoDeep

 
And MyJar.jar contains the following entry:
myApp/Foo.class
If the current directory is x, which commands will successfully execute GoDeep.class and
produce the output 8? (Choose all that apply.)
A. java GoDeep			-->
B. java -classpath . GoDeep
C. java -classpath test/MyJar.jar GoDeep
D. java GoDeep -classpath test/MyJar.jar		--> syntax 
E. java GoDeep -classpath test/MyJar.jar:.		--> syntax
F. java -classpath .:test/MyJar.jar GoDeep
G. java -classpath test/MyJar.jar:. GoDeep

Answer:

 F and G are correct. The java command must find both GoDeep and Foo, and the
-classpath option must come before the class name. Note, the current directory
(.), in the classpath can be searched first or last.

*/