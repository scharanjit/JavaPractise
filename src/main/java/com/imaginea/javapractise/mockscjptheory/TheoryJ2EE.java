package mockscjptheory;

public class TheoryJ2EE {

}
/*Out  of memory
 * Xms - the minimum size of the heap
Xmx - the maximum size of the heap
-XX:MaxPermSize - the maximum size of PermGen
 * 
 * Increase Xmx in small increments (eg 512mb at a time), until you no longer experience the OutOfMemory error.
 *  This is because increasing the heap beyond the capabilities of your server to adequately Garbage Collect
 *   can cause other problems (eg performance/freezing)
If your error is java.lang.OutOfMemoryError: PermGen space, increase the -XX:MaxPermSize parameter in 256mb 
increments until the error stops occurring.
If your error does not reference PermGen, there is no need to increase it. 
In a simplistic explanation, PermGen is used to store classes, and is generally quite static in size. More info here.
Consider setting Xms and Xmx to the same value, as this can decrease the time GC takes to occur,
 as it will not attempt to resize the heap down on each collection.
 * 
 * 
 * 
 * JavaBeans are reusable software components for Java. They are classes that encapsulate many objects 
 * into a single object (the bean). 
 * They are serializable, have a 0-argument constructor, and allow access to properties using getter 
 * and setter methods.
 * 
 * What is the J2EE?
 * java edition 2 enterprise edition
 * 
What are the components of J2EE application?
JSP,EJB,Session Bean, Mesage Driven Bean

What are the J2EE Technologies? 
 J2EE technologies such as Java Servlets , JavaServer Pages (JSP), Enterprise JavaBeans (EJB) and the 
 Java Message Service (JMS). 

Explain J2EE Architectures?
Layers--> Client layer(WEb services,HTTP), Web server Presentation Layer(Servlets,JSP,HTML),Business layer(EJB,POJO) ,Data access layer(JDBC,XML,DAO), Data layer

What are the Advantages of J2EE?
diff layers..easy to resolve issue.

What is Enterprise Java Bean(EJB)?
EJB provides an architecture to develop and deploy component based enterprise applications considering 
robustness, high scalability and high performance

When to Use EJB?

What are the EJB Roles in J2EE?

Explain about EJB Container ?

What are the Types of Enterprise JavaBeans?
Session Bean	Session bean stores data of a particular user for a single session. 
It can be stateful or stateless. It is less resource intensive as compared to entity beans. 
Session bean gets destroyed as soon as user session terminates.

Entity Bean	Entity beans represents persistent data storage. 
User data can be saved to database via entity beans and later on can be retrived from the database in the entity bean.

Message Driven Bean	Message driven beans are used in context of JMS (Java Messaging Service). 
Message Driven Beans can consumes JMS messages from external entities and act accordingly.

Explain about Session Beans?
What is Stateful session bean? Explain it’s life cycle?
A stateful session bean is a type of enterprise bean which preserve the conversational state with client.
 A stateful session bean as per its name keeps associated client state in its instance variables. 
 EJB Container creates a separate stateful session bean to process client's each request.
 As soon as request scope is over, statelful session bean is destroyed.

What is stateless session bean ? Explain Life Cycle?
 stateless session bean is a type of enterprise bean which is normally used to do independent operations. 
 A stateless session bean as per its name does not have any associated client state, but it may preserve its instance state.
  EJB Container normally creates a pool of few stateless bean's objects and use these objects to process client's request. 
 Because of pool, instance variable values are not guaranteed to be same across lookups/method calls.

What are the differences between the Stateful session bean and Stateless session bean ?
When to use Stateful session bean?

When to use a stateless session bean?

Can a Session Bean be defined without ejbCreate() method?

How do Stateful Session beans maintain consistency across transaction updates?

Can i call remove() on a Stateless Session bean?

What is an Entity Bean? Explain it’s life cycle?

What is Message driven bean and it’s life cycle?

When we can choose Entity Bean ?

What are difference between the Statefull Session and Entity Bean?

Explain about Deployment Descriptor ?
In the Java Platform, Enterprise Edition, a deployment descriptor describes how a component, module or application 
(such as a web application or enterprise application) should be deployed.[1] It directs a deployment tool to deploy 
a module or application with specific container options, security settings and describes specific configuration 
requirements. XML is used for the syntax of these deployment descriptor files.

For web applications, the deployment descriptor must be called web.xml and must reside in the WEB-INF directory in 
the web application root. For Java EE applications, the deployment descriptor must be named application.xml and must
 be placed directly in the META-INF directory at the top level of the application .ear file.



What are the Session Bean CallBack methods ?

Explain ACID Properties?
Atomicity.
Consistency.
Isolation.
Durability.

Database theory has a more rigorous definition of a transaction and states that a transaction has
 four fundamental properties, known as ACID properties:

Atomicity Transactions are committed or rolled back as a group, and are atomic, meaning that all
 SQL statements contained in a transaction are considered to be a single indivisible unit.

Consistency Transactions ensure that the database state remains consistent, meaning that the database
 starts at one consistent state and ends in another consistent state when the transaction finishes.
 
Isolation Separate transactions should appear to run without interfering with each other.

Durability Once a transaction has been committed, the database changes are preserved, even 
if the machine on which the database software runs later crashes.





9. What are the differences between NoClassDefFoundError and ClassNotFoundException?
-->NoClassDefFoundError and ClassNotFoundException are related to unavailability of a class at run-time.
-->Both ClassNotFoundException and NoClassDefFoundError are related to java classpath

ClassNotFoundException :  ClassNotFoundException occurs when class loader could not find the required class in class path .
So , basically you should check your class path and add the class in the classpath.
For example: The database driver is not found when trying to load the driver using Class.forName() method.
 
NoClassDefFoundError : This is more difficult to debug and find the reason. 
This is thrown when at compile time the required classes are present , but at run time the classes are changed  or
 removed or class's static initializes threw exceptions. 
 It means the class which is getting loaded is present in classpath , but one of the classes which are required by this class ,
  are either removed or failed to load by compiler .So you should see the classes which are dependent on this class .

Example :

public class Test1
{
}


public class Test 

{
   public static void main(String[] args)

   {
        Test1 = new Test1();    
    }

}
     
Now after compiling both the classes , if you delete Test1.class file , and run Test class , it will throw

Exception in thread "main" java.lang.NoClassDefFoundError: Test
        at Test1.main(Test1.java:5)
Caused by: java.lang.ClassNotFoundException: Test
        at java.net.URLClassLoader$1.run(Unknown Source)
        at java.net.URLClassLoader$1.run(Unknown Source)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        ... 1 more 



ClassNotFoundException :-
Thrown when an application tries to load in a class through its name, but no definition for the class with
 the specified name could be found

NoClassDefFoundError :-
Thrown if the Java Virtual Machine tries to load in the definition of a class and no definition of the class could be found.






ClassNotFoundException is a checked Exception derived directly from java.lang.Exception class
 and you need to provide explicit handling for it while NoClassDefFoundError is an Error derived from LinkageError.




10. When do you use a catch block and when do you use a finally block?

11. What is difference between throw and throws in Java?
throw new Excetion();

Void method()/Class Throws NULLpOointerException

















Tuesday, February 21, 2012
 



Difference between throw and throws in Exception handling - Java Example 







Difference between throw and throwskeyword on Exception handling in Java is a popular core java interview question.
 Exception handling being an important part of Java programming language, complete knowledge of all keywords related 
 to exception handling e.g. try, catch, finally, throw and throws is important.
 
  Main difference between throw and throws is in there usage and functionality.
   where throws is used in method signature to declare Exception possibly thrown by any method,
    throw is actually used to throw Exception in Java code, 
    here is an example of both throw and throws keyword which makes iteasy to understand difference between them.

 

 public void shutdown() throws IOException{
 
        throw new IOException("Unable to shutdown");
 
 }
 



if you see the code above, throws keyword is used to declare Exception thrown by this method shutdwon(), 
by looking at method signature we know that its throwing IOException.
 while inside method code throw keyword is actually used to throw instance of IOException.
  here are couple of more differences between throw and throws keyword in java:
 



Difference between throw and throws in Exception handling - Java Example
 
1) 
You can declare multiple exception thrown by method in throws keyword by separating
 them in common e.g. throws IOException, ArrayIndexBoundException etc, while you can only throw one 
 instance of exception using throw keyword e.g. throw new IOException("not able to open connection").




12. What is the purpose of throw keyword? What happens if we write “throw null;” statement in a Java program?
throw null;
Exception in thread "main" java.lang.NullPointerException
	at MockSCJP.S3_Array.main(S3_Array.java:13)
if anything occurs after this...it will give compilation error	
	

13. Have you every created custom exceptions?
14. What happens when we have a return statement in the try block as well as in the finally block.?
15. How does finally block differ from finalize() method?
finalize()--> Garbage collection

S3_Array cc = new S3_Array();
		try {
			cc.finalize();  //java.lang.object
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

Q1. Why do you want to work in this industry / company? 
Ans: First you should try to convince that this company gives huge opportunity in many aspect 
i.e. new technologies implementation, the policy of company suits you like professionalism.  
 Also you can mention that you are big fan of this company and its your dream company. 
 Basically show your all positive attitude towards company.
 



Q2. Which location do you want to work in and why?
 Ans : Give your own choice. Also mention a valid reason for why you are interested for that location.
  The reason should be always positive and clear. Example :- you can support your family from this location,
 

Q3. Describe a problem you faced and how you deal with it ?

In BIMA app, der was User Role Entry Module...in which admin setting the role of representatives under him..
there was some code Authentication Handler method...
This class import  javax.servlet.jsp.el.Expression class..
this class has one method...evaluate(exprvalue,resultClass(),pagecontext.getVar)...in which we are evaluating expression...
every representative has one segmenatation..& for every segment we have some expressions to evaluate

As of JSP 2.1, replaced by javax.el.ValueExpression





Q4. What are the types of class loaders in Java?
 Ans  :  As per my knowledge there are basically 3 types of class loader like bootstarp classloader,
 extension class loader and system class loader.
 •Bootstrap Class Loader
 Bootstrap class loader loads java’s core classes like java.lang, java.util etc. These are classes that
  are part of java runtime environment. Bootstrap class loader is native implementation and so they may differ across different JVMs.
 • Extensions Class Loader
 JAVA_HOME/jre/lib/ext contains jar packages that are extensions of standard
  core java classes. Extensions class loader loads classes from this ext folder.
   Using the system environment propery java.ext.dirs you can add ‘ext’ folders and jar files to be loaded using extensions class loader
 •System Class Loader
 
 Java classes that are available in the java classpath are loaded using System class loader
 



Q5. Write your own ArrayList in Java ? 

      Your own code here .
 



Q6. How to read and write image from a file ?
 



Ans : You can use ImageIo.read() and ImageIO.write()  method of javax.imageio package.
 



Q7. What is difference between static and init block in java.
 
Answer Here. 




Q8. How ConcurrentMap works?
 



Ans : The basic design of concurrentMap is to handling threading. 
Basically it locks each of the box (by default 16) which can be locked independently and thread safe for operation.
 And it does not expose the internal lock process.
 



Q9. Can a static block throw exception?
 



Ans : Yes. We can throw checked exception.
 



Q10. What is difference between iterator access and index access?
 



Ans : Basically iterator access process the traverse operation through each element,
 where index access process access direct the element by using the index.
 



Q11. Why character array is better than string for storing password in java?
Ans : Because, character array stores data in encrypted format which is not readable by human.
 But,the string stores the data in human readable format which is not secure.
 



Q12. what is daemon thread in java ?
 



Ans : A daemon thread is normally runs on background. And it does not prevent the JVM from exiting when 
the program finishes but the thread is still running.
 



Q13. What is Java Reflection API?
 



Ans  : Reflection is one of the most powerful api which help to work with classes, methods and variables 
 dynamically. Basically it inspect the class attributes at runtime. Also we can say it provides a metadata about the class. 
 



Q14. What is the difference between Serializable and Externalizable interfaces? 
 



Ans : Both interfaces are used for implement serialization. But, the basic difference is Serializable
 interface does not have any method (it’s a marker interface ) and 
 Externalizable interface having 2 methods such as readExternal() and writeExternal(). 
 Serializable interface is the super interface for Externalizable interface. 
 * 
 * */
 