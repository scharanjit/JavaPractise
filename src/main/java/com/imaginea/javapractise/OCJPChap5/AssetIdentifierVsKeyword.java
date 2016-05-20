package OCJPChap5;

public class AssetIdentifierVsKeyword {
	public static void main(String[] args) {


		//int assert = getInitialValue();  //<--identifier
		//	if (assert == getActualResult()) {   
		// do something
	}

	//Notice that in the preceding code, assert is used as an identifier
	static int getInitialValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * Command Line 					If assert Is an Identifier		 If assert Is a Keyword
	javac -source 1.3 TestAsserts.java 	Code compiles with warnings. 		Compilation fails.
	javac -source 1.4 TestAsserts.java 	Compilation fails.			 		Code compiles.
	javac -source 1.5 TestAsserts.java 	Compilation fails. 					Code compiles.
	javac -source 5 TestAsserts.java 	Compilation fails. 					Code compiles.
	javac -source 1.6 TestAsserts.java 	Compilation fails. 					Code compiles.
	javac -source 6 TestAsserts.java	Compilation fails. 					Code compiles.
	javac TestAsserts.java 				Compilation fails. 					Code compiles.*/
}



/*
 *
 * 1. Given two files:
1. class One {
2. public static void main(String[] args) {
3. int assert = 0;  //<--assert as identifier
4. }
5. }

1. class Two {
2. public static void main(String[] args) {
3. assert(false);			//<asset as keyword
4. }
5. }
And the four command-line invocations:
javac -source 1.3 One.java
javac -source 1.4 One.java
javac -source 1.3 Two.java
javac -source 1.4 Two.java

 *
 *What is the result? (Choose all that apply.)
A. Only one compilation will succeed
B. Exactly two compilations will succeed
C. Exactly three compilations will succeed
D. All four compilations will succeed
E. No compiler warnings will be produced
F. At least one compiler warning will be produced
 *
 *B and F are correct. Class One will compile (and issue a warning) using the 1.3 flag, and
class Two will compile using the 1.4 flag.
 */
