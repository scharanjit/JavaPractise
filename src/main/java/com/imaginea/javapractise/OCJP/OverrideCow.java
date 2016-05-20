package OCJP;

import java.io.FileNotFoundException;

public class OverrideCow  extends OverrideAnimal{
	//An overridding method does not have to declare any exception that it will never throw,
	//regardless of what the over rideen method
public String eat() throws FileNotFoundException
	{
		System.out.println("Cow Animal");
		return "COW";
		
	}

}
