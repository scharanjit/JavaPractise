package OCJPChap5;
// On stack
/*
 * We will represent the stack as growing upward (although it can also be visualized
as growing downward). As you can see, the last method called is at the top of the
stack, while the first calling method is at the bottom. The method at the very top of
the stack trace would be the method you were currently executing. If we move back
down the call stack, we're moving from the current method to the previously called
method. Figure 5-1 illustrates a way to think about how the call stack in Java works.

c
b
a
main

Now let's examine what happens to ducked exceptions. Imagine a building, say,
five stories high, and at each floor there is a deck or balcony. Now imagine that on
each deck, one person is standing holding a baseball mitt. Exceptions are like balls
dropped from person to person, starting from the roof. An exception is first thrown
from the top of the stack (in other words, the person on the roof), and if it isn't
caught by the same person who threw it (the person on the roof), it drops down
the call stack to the previous method, which is the person standing on the deck one
floor down. If not caught there, by the person one floor down, the exception/ball
again drops down to the previous method (person on the next floor down), and
so on until it is caught or until it reaches the very bottom of the call stack. This is
called exception propagation.
If an exception reaches the bottom of the call stack, it's like reaching the bottom
of a very long drop; the ball explodes, and so does your program. An exception that's
never caught will cause your application to stop running. A description (if one is
available) of the exception will be displayed, and the call stack will be "dumped."
This helps you debug your application by telling you what exception was thrown,
from what method it was thrown, and what the stack looked like at the time.
 */
public class duckingException {
	public static void main(String[] args) {
		a();

		badMethod();
	}

	private static void a() {
		// TODO Auto-generated method stub
		b();
	}

	private static void b() {
		// TODO Auto-generated method stub
		c();
	}

	private static void c() {
		// TODO Auto-generated method stub

	}


	static void badMethod() { // No need to declare an Error
		doStuff();
	}
	static void doStuff() { //No need to declare an Error

		try {
			throw new Error();
		}
		catch(Error me) {
			throw me; // We catch it, but then rethrow it  // feel the difference remove comment part
		}
	}
}

//checked (declared)exception:- all are checked exeption except runtime


/*
 * 
 * Exception 		 (Chapter Location) 		 Description 		Typically Thrown
ArrayIndexOutOfBoundsException
(Chapter 3, "Assignments")
Thrown when attempting to access an array
with an invalid index value (either negative
or beyond the length of the array).
By the JVM
ClassCastException
(Chapter 2, "Object Orientation")
Thrown when attempting to cast a reference
variable to a type that fails the IS-A test.
By the JVM
IllegalArgumentException
(This chapter)
Thrown when a method receives an argument
formatted differently than the method
expects.
Programmatically
IllegalStateException
(Chapter 6, "Formatting")
Thrown when the state of the environment
doesn’t match the operation being attempted,
e.g., using a Scanner that’s been closed.
Programmatically
NullPointerException
(Chapter 3, "Assignments")
Thrown when attempting to access an object
with a reference variable whose current value
is null.
By the JVM
NumberFormatException
(Chapter 3, "Assignments")
Thrown when a method that converts a
String to a number receives a String that it
cannot convert.
Programmatically
AssertionError
(This chapter)
Thrown when a statement’s boolean test
returns false.
Programmatically
ExceptionInInitializerError
(Chapter 3, "Assignments")
Thrown when attempting to initialize a static
variable or an initialization block.
By the JVM
StackOverflowError
(This chapter)
Typically thrown when a method recurses
too deeply. (Each invocation is added to the
stack.)
By the JVM
NoClassDefFoundError
(Chapter 10, "Development")
Thrown when the JVM can’t find a class it
needs, because of a command-line error, a
classpath issue, or a missing .class file.
By the JVM
 * */

