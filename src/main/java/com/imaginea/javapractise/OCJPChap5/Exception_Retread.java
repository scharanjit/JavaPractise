package OCJPChap5;
//MyExcption i a checked exception just loike Null pointerr & Arithmetic but it needs to be hndle and thrown at evrywhere
//because compiler will enforce the hndle or to declare the rule for thaat exception
class MyException extends Exception { 
	MyException()
	{
		System.out.println("Hi");
	}
}

class Tire 
{
	void doStuff()  { }
}


public class Exception_Retread extends Tire 
{
	public static void main(String[] args) {
		new Exception_Retread().doStuff();
	}
	// insert code here
        void doStuff() {
		//void doStuff() throws MyException {
		// void doStuff() throws RuntimeException {
		//void doStuff() throws ArithmeticException {
	//void doStuff() throws NullPointerException {
		System.out.println(7/0);
	}
}


/*
 * 
 * C. Some, but not all, will compile
 * D. All of those that compile will throw an exception at runtime
 * 
 * 
 * C and D are correct. An overriding method cannot throw checked exceptions that are
broader than those thrown by the overridden method. However an overriding method can
throw RuntimeExceptions not thrown by the overridden method.*/
