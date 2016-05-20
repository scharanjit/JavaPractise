package OCJPChap5;

public class pointsToRemember {

}

/*
1.) Must aware of correct assert syntax 
assert(boolean):exppression;  //if expression fails it will raise Assertion error
OR
assert(boolean);
........AssertionEx.java
Assertion Valid till java 1.4


2.)We can not use assert as an identifier (int assert;) AFTER version 1.3 of java..compilation gonna fails
we cannot use assert as keyword (assert():;) BEFORE version 1.4 of java ...compilation gonna fails
chk ... AssetIdentifierVsKeyword.java

3.) If we use two expressions in insert...2nd expression must return some  value. 

4.)Cast is important when we are generating random values.

5.)An overriding method should not through an exception broasder than it's overriding method of aprent class...chk CC.java
menas ...child overriding method either CANNOT throw  less than minimum level exception which his aprent is throwing.
suppose parents throwing SubException..it has to throw till Sub Exception..
it can throw upper level...either donot throw anything

Overloading--> this does not apply..

Suppose parent does not throw any excpetion...but child overriding method thowis userDefined Exception...
then Parent & calling fuction has to throws user defined exception ...Exception_Retread.java 

6.)Break--> go out ...end of iteration..
Continue..stop  execution of next statements...continue with next set of iteration
return--> Execution jumps immediately back to the calling method.
System.exit(0)--> All program execution stops; the JVM shuts down.

7.)go to duckingException.java & read abt different kind of exceptions

8.) Exception hirerachy is very important...ExceptionSubClassHirerachy.java

9.)When we do "throw e"  or throw new Exception();...we have to explicitly use "throws Exception" or try/catch

10) Value declared inside declaration part of for loop, it scope ends out of for loop...forloopsDeclaration.java




*/