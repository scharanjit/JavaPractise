package DoubtsMustRead;

public class TenMostDiffQuesInJava extends jojo {
	public static void jj(int t)
	{System.out.println("te");}
	
	public  void jj1(int t)
	{System.out.println("te1");}

	public static void main(String[] args) {
		jojo j = new TenMostDiffQuesInJava();
		j.jj(5);
		j.jj1(3);
		
	}
}

class jojo
{
	public static void jj(int t)
	{System.out.println("jojo");}
	
public  void jj1(int t)
{
	System.out.println("jojo1");}
}
/*

Why wait and notify is declared in Object class instead of Thread ?
Lock is configured at object level.
lock is one of the primary reason why wait and notify is defined in Object class.



Why multiple inheritance is not supported in Java ?
1) First reason is ambiguity around Diamond problem, consider a class A has foo() method and then B and C derived from A 
and has there own foo() implementation and now class D derive from B and C using multiple inheritance and if we refer just
 foo() compiler will not be able to decide which foo() it should invoke. This is also called Diamond problem because structure
 on this inheritance scenario is similar to 4 edge diamond, see below

           A foo()
           / \
          /   \
   foo() B     C foo()
          \   /
           \ /
            D
           foo()

In my opinion even if we remove the top head of diamond class A and allow multiple inheritances we will 
see this problem of ambiguity.

Some times if you give this reason to interviewer he asks if C++ can support multiple inheritance than why not Java.
 hmmmmm in that case I would try to explain him the second reason which I have given below that its not because of
 technical difficulty but more to maintainable and clearer design was driving factor though this can only be confirmed by
  any of java designer and we can just speculate. Wikipedia link has some good explanation on how different language address 
  problem arises due to diamond problem while using multiple inheritances.

2) Second and more convincing reason to me is that multiple inheritances does complicate the design and creates problem during
 casting, constructor chaining etc and given that there are not many scenario on which you need multiple inheritance its wise
  decision to omit it for the sake of simplicity. Also java avoids this ambiguity by supporting single inheritance with interfaces. 
  Since interface only have method declaration and doesn't provide any implementation there will only be just one 
  implementation of specific method hence there would not be any ambiguity.


Why Java does not support operator overloading ?

1) Simplicity and Cleanliness
Why operator overloading is not supported in JavaSimple and clear design was one of the goals of Java designers. They, just don't want to replicate the language, but wanted to have a clear, truly object oriented language. Adding Operator overloading would have definitely made design more complex than without it, and it might have lead to more complex compiler or slows the JVM ,because it needs to do extra work to identify the actual meaning of operators, and reduce the opportunity to optimize the language by guarantee behavior of operators in Java.

2) Avoid Programming Errors
Java doesn't allow user defined operator overloading, because if you allow programmer to do operator overloading, they will come up with multiple meanings for same operator, which will make the learning curve of any developer hard and things more confusing and messy. Its been observed that, there is increase in programming errors, when language supports operator overloading, which in turn increase e development and delivery time. Since Java and JVM has taken most of developers responsibility,  in memory management by providing garbage collector, it doesn't really make sense to left this feature to pollute the code, and as a loop hole for programming errors.

3) JVM Complexity
From JVM perspective, supporting operator overloading is more difficult, and if the same thing can be achieved, by using method overloading in more intuitive and clean way, it does make sense to not support operator overloading in Java. A complex JVM, may result in slower JVM, than a relatively simpler JVM ,and reduce the opportunity of optimization by taking out guaranteed behavior of operators in Java.

4) Easy Development of Tools
This is an additional benefit of not supporting operator overloading in Java. Omission of operator overloading has kept the language easier to handle and process, which in turn makes it easier to develop the tools, that process the language e.g. IDE or re-factoring tool. Re-factoring tools in Java are far better than C++.







Why String is immutable in Java?
Suppose it is not then
String A = "Test"
String B = "Test" 

Now String B called "Test".toUpperCase() which change the same object into "TEST" , 
so A will also be "TEST" which is not desirable.



Why char array is preferred to store password than String in Java?
char stores pwd in encrypted text A as 101 ...unicde
1) Since Strings are immutable in Java if you store password as plain text it will be
 available in memory until Garbage collector clears it and since String are used in
  String pool for reusability there is pretty high chance that it will be remain in memory 
  for long duration, which pose a security threat. Since any one who has access to memory dump
   can find the password in clear text and that's another reason you should always used an encrypted password than plain text.


2.)With String there is always a risk of printing plain text in log file or console but if 
use Array you won't print contents of array instead its memory location get printed. though
 not a real reason but still make sense.

String strPassword="Unknown";
char[] charPassword= new char[]{'U','n','k','w','o','n'};
System.out.println("String password: " + strPassword);
System.out.println("Character password: " + charPassword);



How to create thread-safe singleton in Java using double checked locking?
public class Singleton {
private static final Singleton instance = new Singleton();

private Singleton() {}

public static Singleton getInstance() {
return instance;
}
}



Write Java program to create deadlock in Java and fix it ?

What happens if your Serializable class contains a member which is not  serializable? How do you fix it?



Why wait and notify  called from synchronized method in Java?

Can you override static method in Java? if I create same method in subclass is it compile time error?

we cannt but if we did it wnt show nay error jst it wnt giv override result

no compile time rror


















*/
