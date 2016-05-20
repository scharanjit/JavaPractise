package OCJPChap3;

/*
 * 
 * What actually  happening is
 * 
 *  Abc[]  A = new ABC[4];
 * it creates 4 refernces....
 * i.e. A[0], A[1],A[2],A[3]
 * But only single object
 * 
 * 
 * A[0] = new ABC();
 * 
 * 
 * 
 * */



class Dozens 
{    
	int[] dz = {1,2,3,4,5};   
}    
public class Eggs
{    
	public static void main(String[] args)
	{    

		Dozens[] da = new Dozens[3]; //here create one array object type Dozens  
		da[0] = new Dozens(); //here two objects are created one is new Dozens() and one is containing instance variable int[] dz array   
		Dozens d = new Dozens(); //here also same two objects are created one is new Dozens() and it's containing int[] dz array    
		da[1] = d;   // you are copying reference    

		d = null; da[1] = null; //here both are pointing to d reference object so d reference no more it means d object and it's containing int[] dz objects are eligible for GC  
	}    
}  



/*
 * The statement Dozens[] da = new Dozens[3] creates the first object i.e. a Dozens array (1).
 *  The statement da[0] = new Dozens() creates 2 objects i.e. a Dozens object (2) and an int array (3).
 *   The statement Dozens d = new Dozens() creates 2 objects i.e. a Dozens object (4) and an int array (5).
 *    Total objects created is 5. 

The statements d = null and da[1] = null make objects (4) and (5) eligible for GC at line 14. 
Both statements are necessary or else objects (4) and (5) wont be eligible for GC at line 14. */







