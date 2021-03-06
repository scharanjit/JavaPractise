package OCJPChap10;

public class T_10 {

}


/*
 * 
 * ******************************************JAR FILES
let's make the current directory ws, and then make a JAR file called MyJar.jar:
cd ws
jar -cf MyJar.jar myApp
The jar command will create a JAR file called MyJar.jar and it will contain the
myApp directory and myApp's entire subdirectory tree and files. You can look at the
contents of the JAR file with the next command (this isn't on the exam either):
jar -tf MyJar.jar


10. Given the following directory structure:
test-|
	 |- Test.java
	 |
	 |- myApp-|
			  |- Foo.java
			  |
			  |- myAppSub-|
						  |- Bar.java
If the current directory is test, and you create a .jar file by invoking this,
jar -cf MyJar.jar myApp


then which path names will find a file in the .jar file? (Choose all that apply.)
A. Foo.java
B. Test.java
C. myApp/Foo.java  -->
D. myApp/Bar.java
E. META-INF/Foo.java
F. META-INF/myApp/Foo.java
G. myApp/myAppSub/Bar.java  -->

Answer:

C and G are correct. The files in a .jar file will exist within the same exact directory tree
structure in which they existed when the .jar was created. Although a .jar file will contain
a META-INF directory, none of your files will be in it. Finally, if any files exist in the
directory from which the jar command was invoked, they won�t be included in the
.jar file by default.

A, B, D, E, and F are incorrect based on the above. (Objective 7.5)
*/