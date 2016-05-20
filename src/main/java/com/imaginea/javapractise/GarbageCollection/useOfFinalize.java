package GarbageCollection;

public class useOfFinalize {
	
	protected void finalize() throws Throwable {
	     try {
	         close();        // close open files
	     } finally {
	         super.finalize();
	     }
	 }
	
	private void close() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) throws Throwable {
		useOfFinalize f = new useOfFinalize();
	
		f.finalize();
	}

}



/*
 
 The native keyword is applied to a method to indicate that the method is
  implemented in native code using JNI. It marks a method, that it will be implemented in other languages, not in Java. 
  
  Java Native Interface
 
 */
 
 
 

/*
protected void finalize() throws Throwable {}
every class inherits the finalize() method from java.lang.Object
the method is called by the garbage collector when it determines no more references to the object exist
the Object finalize method performs no actions but it may be overridden by any class
normally it should be overridden to clean-up non-Java resources ie closing a file
if overridding finalize() it is good programming practice to use a try-catch-finally statement and to always call super.finalize().
 This is a safety measure to ensure you do not inadvertently miss closing a resource used by the objects calling class

protected void finalize() throws Throwable {
     try {
         close();        // close open files
     } finally {
         super.finalize();
     }
 }
any exception thrown by finalize() during garbage collection halts the finalization but is otherwise ignored
finalize() is never run more than once on any object

*/
