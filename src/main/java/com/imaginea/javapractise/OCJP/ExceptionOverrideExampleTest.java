package OCJP;

public class ExceptionOverrideExampleTest {
	public static void main(String[] args) {
		
		ExceptionOverrideExampleParent P = new ExceptionOverrideExampleParent();
		ExceptionOverrideExampleParent p1= new ExceptionOverrideExampleChild();
		// parent throwing exception but child don't--> No effect
		//but opposite will create problem
		
		
		
	}

}
