package newProblems;

public class Qssssssssssssssssssssssss {
    public static void main(String[] args) {
      int a[]={1,2};
    }
}


/*
 * 
 * Java enums are a special Java type used to define collections of constants. An enum type is a special kind of Java class.
 * It can contain constants, methods etc.

Enum Example
Here is a simple enum definition:

public enum Level {
    HIGH,
    MEDIUM,
    LOW
}




 * 
 * You said "Good","Developer". Here are my 2 cents too.. :)

    What does a "checked exception" mean?
    all exceptions except run time...they can be checked while coding

    Which one is better to use and when: Assertions or Exceptions to handle unexpected conditions?
    Why String class is final? (or is it not? ;) )
    immutable...string.length

    are the wait, notify and notifyAll methods in Object class?
    yes

    Why isn't Thread class final? Why would I extend Thread, ever?
    a final class cannt be subcalssed..it can be instantiated

    Why there are two Date classes; one in java.util package and another in java.sql?
    The java.sql.Date is a subclass (an extension) of java.util.Date.
What changed in java.sql.Date:

    toString() generates a different string representation: yyyy-mm-dd
    a static valueOf(String) methods to create a Date from a String with above representation
    the getters and setter for hours, minutes and seconds are deprecated

The java.sql.Date class is used with JDBC and it was intended to not have a time part, that is, hours, minutes, seconds,
 and milliseconds should be zero... but this is not enforced by the class.







    What happens if an exception is thrown in finally block? Is the remaining finally executed or not?
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
     * 
     * 
     * package newProblems;

public class exceptionInFinally {
    
    public static void main(String[] args) {
        int i=5;
        try 
        {
            
            
             
        }
        catch (Exception e) {
            // TODO: handle exception
        }
        
        
        finally
        {
            int j=i/0;
        }
        
        
        System.out.println("Hiu");
        //finally{} // --only one finally is possible
    }

}


/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
--    There is a garbage collector alright, but then is memory leak totally absent in a Java applications? If not, how so?

---Java VisualVM software used to check memory leakage 


It�s mandatory that our key class provides a correct implementation of the equals() and hashcode() methods. 
Without them, there is no guarantee that a good key will be generated.

By not defining the equals() and hashcode() methods, we add the same key to the HashMap over and over and, 
instead of replacing the key as it should, the HashMap grows continuously, failing to identify these identical
 keys and throwing an OutOfMemoryError.

Here�s the MemLeak class:

package com.post.memory.leak;

import java.util.Map;

public class MemLeak {
    public final String key;
    
    public MemLeak(String key) {
        this.key =key;
    }
    
    public static void main(String args[]) {
        try {
            Map map = System.getProperties();
            
            for(;;) {
                map.put(new MemLeak("key"), "value");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
Note: the memory leak is not due to the infinite loop on line 14: the infinite loop can lead to a resource exhaustion,
 but not a memory leak. If we had properly implemented equals() and hashcode() methods, 
the code would run fine even with the infinite loop as we would only have one element inside the HashMap.






~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



For J2EE:

    Is it good to have instance/static variables in a servlet? Why not? Then where do you store "state"?
    NO
    static means that every instance will access to the same value.
    So every user connected to the servlet will access to the same value. Your jobId will be probably wrong 
    when 2 users or more are connected together.
    You have to get your own value a each connection and store it somewhere else.
    
    
    State can be stored in cookies, URL rewriting etc etc

    
    
    continuing on above question: what & where is a "state" for a (web) application?
    
    public class TestServlet extends HttpServlet {
....
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
    request.getSession().setAttribute("test", new Date());
  }
....
}
    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    What happens if I started creating/closing DB connections in "JSP"?
    
    public static void Connect() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
        System.out.println(ex.getMessage());
    }
    try {

        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,username,password);

    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
}
    
    
    So now, when I need to connect inside a JSP page, I write this.

<% MySQL.Connect();
   Statement stmt = MySQL.getConnection().createStatement();
   ResultSet rset = stmt.executeQuery("....");
   //Some codes here
   //Then I close both rset and stmt
   rset.close();
   stmt.close();
%>
    Ideally you would just use the one connection for the duration of rendering the page and then close it at the end of the page.

That has the effect of ensuring that once you start rendering the page, you can complete as you don't loose a connection
 half way through due to exhausting the connection pool 
(and you should be using a connection pool rather than establishing connections directly if you value your page performance.


1, getting connection directly in jsp is not good idea.

2, No need to create sepereate connections for each queries to be executed in a same page.also that is based on operations
 you are doing with that connection.

3, where ever you open connection, connection must be closed.otherwise leakage will be problem.

4, Before closing connections make sure they are not null.So nullity check is important otherwise you may 
get nullpointer exception.

5, Close connections in finally block so when object is to be garbage collected there no more operation will happen based on
 the connection. Do the closing connection work in finally block. *
    
    
    
    &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    
    What are the ways to handle JSP exceptions? try-catch? Hmmm.. is there anything else?
    
    create error.jsp page
    
 */


