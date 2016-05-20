package OCJPChap10;

public class __ {

}


/*
Compiling java file

javac is used for that purpose

The javac command is used to invoke Java's compiler

Here's the structural overview for javac:
javac [options] [source files]

The following are both legal javac commands:

javac -help  --> doesn't compile any files, but prints a summary of valid options
javac -classpath com:. -g Foo.java Bar.java   --->passes the compiler two .java files to compile (Foo.java and Bar.java).


************************************COMPILING -d option*************************************************************

--> By default, the compiler puts a .class file in the same directory as the .java source
file. This is fine for very small projects, but once you're working on a project of any
size at all, you'll want to keep your .java files separated from your .class files.

-->The -d option lets you tell the compiler in which directory to put the .class file(s) it generates
(d is for destination)


The following command, issued from the myProject directory, will compile
MyClass.java and put the resulting MyClass.class file into the classes
directory. (Note: This assumes that MyClass does not have a package statement;
we'll talk about packages in a minute.)
cd myProject
javac -d classes source/MyClass.java
classes is the new directory


--->If you were in the source directory, you would compile MyClass.java and put
the resulting MyClass.class file into the classes/com/wickedlysmart directory
by invoking the following command:




javac -d ../classes com/wickedlysmart/MyClass.java   

Project--> Source_DIR-->com-->wickedlysmart-->MyClass.java
Project-->Classes_DIR-->com-->wickedlysmart-->MyClass.class



-->This command could be read: "To set the destination directory, cd back to
the myProject directory then cd into the classes directory, which will be your
destination. Then compile the file named MyClass.java. Finally, put the resulting
MyClass.class file into the directory structure that matches its package, in this
case, classes/com/wickedlysmart." Because MyClass.java is in a package,
the compiler knew to put the resulting .class file into the
classes/com/wickedlysmart directory.


**************************************Launching Applications with java********************************************

	java [options] class [args]

The [options] and [args] parts of the java command are optional, and they
can both have multiple values. You must specify exactly one class file to execute, and
the java command assumes you're talking about a .class file, so you don't specify
the .class extension on the command line. Here's an example:

java -DmyProp=myValue MyClass x 1

Sparing the details for later, this command can be read as "Create a system
property called myProp and set its value to myValue. Then launch the file named
MyClass.class and send it two String arguments whose values are x and 1."



import java.util.*;
public class TestProps {
public static void main(String[] args) {
Properties p = System.getProperties();
p.setProperty("myProp", "myValue");
p.list(System.out);
}
}
If this file is compiled and invoked as follows:
java -DcmdProp=cmdVal TestProps


You'll get something like this:


...


Two name=value properties were added
to the system's properties: myProp=myValue was added via the setProperty
method, and cmdProp=cmdVal was added via the -D option at the command line.
When using the -D option, if your value contains white space the entire value
should be placed in quotes like this:
java -DcmdProp="cmdVal take 2" TestProps



******************************************Handling Command-Line Arguments****************************
public class CmdArgs {
public static void main(String[] args) {
int x = 0;
for(String s : args)
System.out.println(x++ + " element = " + s);
}
}


compiled and then invoked as follows


java CmdArgs x 1


the output will be
0 element = x
1 element = 1


Like all arrays, args index is zero based. Arguments on the command line
directly follow the class name. The first argument is assigned to args[0], the second
argument is assigned to args[1], and so on.



The following are all legal declarations for main():
static public void main(String[] args)
public static void main(String... x)
static public void main(String bang_a_gong[])


*******************************************Declaring and Using Classpaths************************
835


*/
