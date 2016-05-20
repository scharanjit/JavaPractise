package DoubtsMustRead;

public class trycatch {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		something();
	}

	private static void something() {
		try {  
		   // something();  
		    System.out.println("f");
		    return ;  
		}  
		catch (Exception e) {   
		  //  return "fail";  
		}  
		finally {  
		    System.out.println("i don't know if this will get printed out.");
		}
	}

	
}
