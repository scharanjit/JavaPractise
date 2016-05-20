package OCJP;

public class ExceptionOverrideChild extends ExceptionOverrideParent {
	
	public void beta() 
	{
		System.out.println("Child");
	}
	
	public static void main(String[] args) throws Exception  {
		ExceptionOverrideParent P = new ExceptionOverrideChild();
		ExceptionOverrideChild C = new ExceptionOverrideChild();
		
		
		C.beta();
		P.beta();
}
}

// if exception question come
// 1)firt check main method shud throws exception 
// 2.) if child method throwing exception..parent shud do
//3.) if parent throws exception...then  if btw child wnt ...dennot a big deal if main throws exception
//if  parent method throwing some exception, chil method(overriding method)