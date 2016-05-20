package OCJPChap3;

public class pointsToremember {

}
/*
 * 
 * 
int--?>Integer..Boxing
byte-->int ..Widening
int-->(int)byte Narrowing (only possible in primitives)

use of static in garbage collection ...chk Tester.java

Imutuability of string:- it the base variable changes,the variable refers to it wont change..see Dimensions.java 
  
Look at the array declaration & 2d array assigned to some value
Legal 
int [] cloat= {5};
int[][] squeegees = new int[3][];
squeegees[0]=cloat;
Illegal
int[][] books = new int[3][];
int aNumber = 7;
books[0] = aNumber; 
Legal
books[0][0]=aNumber;

Boxing means adding into box...primitive int varaible to Wrapper Integer Class

Widening -->priority >low/high--->type cast

Refernce widening & Boxing are two concepts...one can happen at atime ...check..Dog3.java

 
 .equals actually compares value...& == or != compares address...hona ulta chaiee :'(
 
 
 static int x; if not assigned any value it will give 0
 But Wrapper Integer int x; not assigned will give null
 
 
 
 preference order is widening ......chk OverloadingAgain.java
self---->Widening-->Object-->-->Boxing--------->Variable ARGS
				(short-->int)		byte-->Byte
 
 Enumerations
 
 
 For garbage Collection chk Eggs_Dozens.java,GarbageCollector.java
 
 to understand the flow of control...check Hawk.java,Init.java
 
 Java is Call By Ref Not by Value..chk JavaCallByRefNotValue.java
 
 In main fuction..any variable declared MUST be intialized...chk NullExceptionCompileTime.java
  */

