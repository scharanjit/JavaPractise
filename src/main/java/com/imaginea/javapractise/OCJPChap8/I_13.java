package OCJPChap8;

public class I_13 {

}
/*
 *3. Which are true about a method-local inner class? (Choose all that apply.)
A. It must be marked final
B. It can be marked abstract
C. It can be marked public
D. It can be marked static
E. It can access private members of the enclosing class
Answer:
 
  B and E. B is correct because a method-local inner class can be abstract, although it
means a subclass of the inner class must be created if the abstract class is to be used (so
an abstract method-local inner class is probably not useful). E is correct because a
method-local inner class works like any other inner class—it has a special relationship to
an instance of the enclosing class, thus it can access all members of the enclosing class.

 A is incorrect because a method-local inner class does not have to be declared final
(although it is legal to do so). C and D are incorrect because a method-local inner class
cannot be made public (remember—local variables can't be public) or static. 
 * */
 