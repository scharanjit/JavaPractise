package j2ee1001;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WrapperPrimitvee {
	

	public static void main(String[] args) throws IOException {
		
		System.out.println("Q1-->");
		System.out.println(Byte.MIN_VALUE+","+Byte.MAX_VALUE);
		
		
		
		System.out.println("Q2--->");
		File f = new File("sample1.txt");
		f.createNewFile();
		
		
		
		FileReader fr;
		FileWriter fw = new FileWriter(f) ;
		
		fw.write("abcdef");
		//fw.flush();  //it will only write if we use flush...while reading flush not required
		int i = 0;
		try
		{
			fr = new FileReader("sample1.txt");
			//while((i=fr.read())!=1)
			{
				System.out.println((char)i);
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	
	
	System.out.println("Q3-->");
	System.out.println("---------------------------------");
    Double d1 = new Double(1.0);
  //  Double d2 = new Double("d1");
    //System.out.print(d1.equals(d2));  //here we can use primitive as object...on warapper dis facility not availble/
    			//but .equals nopt availble for priomitive
   
    /*The Double constructor is overloaded: one accepts an argument of type primitive double; 
     * the other accepts an argument of type String.
     *  There is no constructor that accepts a reference to an instance of type Double.*/
    
    System.out.println("Q4");
    int m=7;
    int h=8;

		//h.equals(m);   //error
	
    Integer m1= new Integer(7);
    Integer n1= new Integer(8);
    m1.equals(n1); 	//no error
	}
	
	
	

}


