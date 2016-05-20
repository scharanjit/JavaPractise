package OCJPChap5;

/*The assertion statement has two forms. The first, simpler form is:
assert Expression1 ;
where Expression1 is a boolean expression. When the system runs the assertion, 
it evaluates Expression1 and if it is false throws an AssertionError with no detail message.
The second form of the assertion statement is:
assert Expression1 : Expression2 ;
where:
Expression1 is a boolean expression.
Expression2 is an expression that has a value.
 (It cannot be an invocation of a method that is declared void.)
*/

public class Clumsy1 {
	public static void main(String[] args) {
		int j = 7;
		int x=0;
		int y=0;
		assert(++j > 7):x=1;
		System.out.println(x);
		assert(++j > 8): "hi";
		assert(j > 10): j=12;
		// assert(j==12): doStuff();
		assert(j==12): new Clumsy1();
	}
	static void doStuff() {  }
}