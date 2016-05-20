package OCJP;

import java.io.FileNotFoundException;

public class OverrideAnimal {
	 String eat() throws FileNotFoundException// throws FileNotFoundException  //access level default and public
	{
		System.out.println("Parent");
		return "Animal";
	}

}
