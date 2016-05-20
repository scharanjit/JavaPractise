package OCJP1;
//For a subclass outside the package, the protected member can be accessed only
//through inheritance. but we CANNOT use reference of parent class to access protected
import  OCJP.Access;

// b is visible becuase Access1 extends Access ---has a relation
public class Access1 extends Access {

	
	public static void main(String[] args) {
		Access A = new Access();
//		System.out.println(A.a);	// a is default
		System.out.println(b);    //look at the exceptional behaviour //protected shoud be visible 
		System.out.println(A.b);
//		System.out.println(A.c);    // c is private
		System.out.println(A.d);
		
		Access1 cc = new Access1();
		cc.ExceptionsBehaviouProtected();
		
	}
	
	public void ExceptionsBehaviouProtected()
	{
		System.out.println("protected varialble  b is  : "+b);  // here protected is accessible
	}
}
