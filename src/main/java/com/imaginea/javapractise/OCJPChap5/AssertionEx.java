package OCJPChap5;

public class AssertionEx {
	/*
	 * The assert keyword is used in assert statement which is a feature of the Java programming language since Java 1.4.
	 *  Assertion enables developers to test assumptions in their programs as a way to defect and fix bugs
	Syntax of an assert statement is as follow (short version):
	assert expression1;
	or (full version):
	assert expression1 : expression2;
	Where:
	expression1 must be a boolean expression.
	expression2 must return a value (must not return void).


The assert statement is working as follows:
If assertion is enabled, then the assert statement will be evaluated. Otherwise, it does not get executed.
If expression1 is evaluated to false, an AssertionError error is thrown which causes the program stops immediately. And depending on existence of expression2:

If expression2 does not exist, then the AssertionError is thrown with no detail error message.
If expression2 does exist, then a String representation of expression2’s return value is used as detail error message.


If expression1 is evaluate to true, then the program continues normally






Search... 





Java keyword: assert

  Print  M Email

 Last Updated on 28 September 2013
 Java Performance      Clean Code      The Clean Coder      The Pragmatic Programmer 

The assert keyword is used in assert statement which is a feature of the Java programming language since Java 1.4. Assertion enables developers to test assumptions in their programs as a way to defect and fix bugs.

 

Syntax of assert statement

 Syntax of an assert statement is as follow (short version):

assert expression1;

 

or (full version):

assert expression1 : expression2;

 



 

Enable assertion

java –ea ClassName
	 * */
	/*
	 *C It is NOT appropriate to use assertions to validate command-line arguments
D. It is appropriate to use assertions to generate alerts when you reach code that should not
be reachable
E. It is NOT appropriate for assertions to change a program’s state*/

	void noReturn() { }
	static int aReturn() { return 1; }
	public static void main(String[] args) {

		int x = 1;

		System.out.println((x==1)?"Same Old":"Newly One");   //this is not assert..this is just other form of if else

		boolean b = true;
		// the following six are legal assert statements
		assert(x == 1);
		assert(b);
		assert true;
		int y=1;
		assert(x == 2) : x;
		//x+1;
		assert(x == 1) : aReturn();
		assert(x == 1) : new AssertionEx();
		// the following six are ILLEGAL assert statements
		//assert(x = 1); // none of these are booleans
		//assert(x);
		//assert 0;
		//assert(x == 1) : ; // none of these return a value
		//assert(x == 1) : noReturn();
		//assert(x == 1) : AssertionEx va;
		boolean c;

		int y1 = 0;
		int m1 = 9;

		switch(m1) {
		case 1: y1 = 3; break;
		case 2: y1 = 9; break;
		case 3: y1 = 27; break;
		default: assert false; // we're never supposed to get here!
		}
		System.out.println(y1);
	}
	//"Do not use assertions to validate arguments to a public method

	private void doMore(int x) {
		assert (x > 0);
		// do things with x
	}

	public void doStuff(int x) {
		assert (x > 0); // inappropriate !
		// do things with x
	}

}


/*
 * do enforce constraints on private methods' arguments,
but do not enforce constraints on public methods. You're certainly free to compile
assertion code with an inappropriate validation of public arguments, but for the
exam (and real life) you need to know that you shouldn't do it.*/
