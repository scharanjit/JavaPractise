package OCJPChap7;

/*
 *Use == to determine if two reference variables refer to the same object.
 Use equals() to determine if two objects are meaningfully equivalent. but we can not use .equals on Primitive data type
 
 So we have different scenario comparing different types   like...
 comparing wrapper , primitive or String data types.
 
 Strings and wrappers override equals() and make good hashing keys.
 */
 


public class DiffBwequalequal {
	public static void main(String[] args) {
		int i =5;
		float j =5.0f;
		int k= 5;
		String m= "f";
		String n ="f";
		if(i==j)
		{
			System.out.println("== cond staisfied");
		}
		
		
		//if(i.equals(k)){} //equals cant be invoke on primitive data type
		if(n.equals(m))
		{
			System.out.println(".equals satisfied--------String");
		}
		else
		{
			System.out.println("No------String");
		}
		if(m==n){System.out.println("Both refers to same object---------String");}
		else {System.out.println("No ------string");}
		Integer Wi= 5; //wrapper class
		Float Wj=5.0f;
		Integer Wk=5;
		
		if(Wi==Wk){System.out.println("Both refers to same object");}
		//if(Wi==Wj){System.out.println("Both refers to same object");}  //incompatible..bec not referring to same object
		
		if(Wi.equals(Wj)){	System.out.println("Wrapper");	} //here they are meaning fully equivalent...but not referrring to same object
		else{System.out.println("No-----------------------wrapper");}
	
		if(Wi.equals(Wk )){	System.out.println("Wrapper Wk");	}
		else{System.out.println("No-----------------------wrapper");}
	}

}

/*If x.equals(y) is true, x.hashCode() == y.hashCode() is true.
If x.equals(y) is false, then x.hashCode() == y.hashCode() can
be either true or false, but false will tend to create better efficiency.*/
