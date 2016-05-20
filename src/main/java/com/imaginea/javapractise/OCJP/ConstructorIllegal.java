package OCJP;


//If your class has parameterised constructor & some CHILD inheriting your class 
// we have to EXPLICILTY DEFINE 	DEFAULT constructor
 class Toad
 
{
	Toad()
	{
		
	}
	Toad(String S)
	{
		
	}
	
}

public class ConstructorIllegal extends Toad{
//	public ConstructorIllegal() {
//	
//	}
//	public ConstructorIllegal(String S)
//	{
//		
//	}
        
        
        
        public static void main(String[] args) {
        
            System.out.println("Construcotr default");
    }
}
