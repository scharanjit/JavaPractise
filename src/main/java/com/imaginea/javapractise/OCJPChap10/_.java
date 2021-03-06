package OCJPChap10;

import static java.lang.System.*;
public class _ {
	static public void main(String... __A_V_) {
		String $ = "";
		for(int x=0; ++x < __A_V_.length; )
			$ += __A_V_[x];
		out.println($);
	}
}

/*
 * And the command line:

java _ - A .

What is the result?
A. -A
B. A.
C. -A.
D. _A.
E. _-A.
F. Compilation fails
G. An exception is thrown at runtime
Answer:

B is correct. This question is using valid (but inappropriate and weird) identifiers, static
imports, var-args in main(), and pre-incrementing logic.

*/