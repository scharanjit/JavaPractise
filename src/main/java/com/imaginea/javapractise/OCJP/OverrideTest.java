package OCJP;

import java.io.FileNotFoundException;

public class OverrideTest {

	
	public static void main(String[] args) throws FileNotFoundException {
		OverrideAnimal A = new OverrideAnimal();
		OverrideAnimal B= new OverrideCow();
		// OverrideCow C = new OverrideAnimal(); illegal..child cant refer his parents
		
		
		
		System.out.println(A.eat());
		System.out.println("======================================");
		
		System.out.println(B.eat());
	}
}
