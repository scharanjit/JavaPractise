package OCJPChap10;

public class _9 {

}

/*colon--> :
 * semi colon -->;

**********************Declaring and Using Classpaths********************

-classpath /com/foo/acct:/com/foo

specifies two directories in which classes can be found: /com/foo/acct and
/com/foo

In both cases, these directories are absolutely tied to the root of the file
system, which is specified by the leading forward slash


It's important to remember that when you specify a sub directory, you're NOT 
specifying the directories above it.
For instance, in the preceding example the directory /com will NOT be searched

The way to tell java or javac to search in the current directory is to add a dot (.) to the classpath:

-classpath /com/foo/acct:/com/foo:.

This classpath is identical to the previous one EXCEPT that the dot (.) at the end
of the declaration instructs java or javac to also search for class files in the current
directory.


It's also important to remember that classpaths are searched from left to right.
Therefore in a situation where classes with duplicate names are located in several
different directories in the following classpaths, different results will occur:

-classpath /com:/foo:.

is not the same as

-classpath .:/foo:/com



9. Given the following directory structure:
x-|
  |- FindBaz.class
  |
  |- test-|
   		  |- Baz.class
		  |
		  |- myApp-|
				   |- Baz.class

And given the contents of the related .java files:
1. public class FindBaz {
2. public static void main(String[] args) { new Baz(); }
3. }
In the test directory:
1. public class Baz {
2. static { System.out.println("test/Baz"); }
3. }


In the myApp directory:
1. public class Baz {
2. static { System.out.println("myApp/Baz"); }
3. }

If the current directory is x, which invocations will produce the output "test/Baz"? (Choose
all that apply.)
HINT :- search start from left to right


A. java FindBaz  --> wrong syntax
B. java -classpath test FindBaz  --> nothing
C. java -classpath .:test FindBaz
D. java -classpath .:test/myApp FindBaz--> o/p nothing
E. java -classpath test:test/myApp FindBaz--> o/p nothing
F. java -classpath test:test/myApp:. FindBaz--> step 2 --> nothing...fer current directory me findbaz
G. java -classpath test/myApp:test:. FindBaz--> inside test/myApp...we dnt hav other test


C and F are correct. The java command must find both FindBaz and the version of
Baz located in the test directory. The "." finds FindBaz, and "test" must come before
"test/myApp" or java will find the other version of Baz. Remember the real exam will
default to using the Unix path separator.

*/
