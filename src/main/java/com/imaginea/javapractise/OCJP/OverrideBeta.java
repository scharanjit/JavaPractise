package OCJP;
/*
 * We know what is overload (same{/WE WILL PRVOE DIFF CLASS TOO} class ...diff argument)
 * 
 * we know what is override( diff class...but arg list , return type OF METHOD  must be same..ie. method def/signature must be same)
 * 
 * we have type of method...String method() or void method()...this method type must same in Override  case (for legal)
 * 
 * in override only inside body of method change
 * 
 * in overload only argment list change & to make illegal over ride(constatnt arg lis) legal...we can change arg list...see Phone3.java
 * 
 * 
 * Compilation Error :- when we change method type
 * 						now the catch is...we can change method type...but argument list shud be change
 * 
 * 				unless it will be illegal overload ...so (Rule 1 & last rule of override ...method type & arg list must be same)
 * 				so new case....
 * 
 *  WE CAN DO OVERLOADING IN DIFFERENT CLASSES TWO
 * 
 * */



 class OverrideAlpha {
	 OverrideAlpha doStuff()
	 {
		return null;
		 
	 }
	 
	 
	 public int geeta() //to remove the compilation error...change the argument list..i.i. add int r inside method signature
	 {
		 return 5;
	 }
}

 
 public class OverrideBeta extends  OverrideAlpha
 {
	 //this is legal
	 OverrideBeta doStuff()
	 {
		 return null;
	 }
	 //this is NOT legal override
//	 public String geeta()  // add arguments like int x
//	 {
//		 return "5";
//	 }
 }