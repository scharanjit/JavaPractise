package OCJPChap10;

//insert code here
//import static java.lang.Integer.*;
import static java.lang.Integer.MAX_VALUE;
public class _1StateTest {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
	}
}


/*Which, inserted independently at line 1, compiles? (Choose all that apply.)
 A. import static java.lang;
 B. import static java.lang.Integer;
 C. import static java.lang.Integer.*;
 D. import static java.lang.Integer.*_VALUE;
 E. import static java.lang.Integer.MAX_VALUE;
 
 *
 C and E are correct syntax for static imports. Line 4 isn't making use of static imports,
so the code will also compile with none of the imports.
 */