package j2ee1001;

class Add {
	Add()
	{
		System.out.println("A() used");
	}
       }

public class Exception_Class {
    

	Exception_Class()
	{
		System.out.println("B() used");
	}

public static void main(String argv[]) throws ClassNotFoundException{ 
	   try {
                  Class.forName("Add").newInstance();
                
	   }
	   catch ( Exception ie ) {}
       } 
}
