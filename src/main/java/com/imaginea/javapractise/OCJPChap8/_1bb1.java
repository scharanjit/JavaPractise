package OCJPChap8;
//INNER CLASS
// A Class can never be private
//we can declare the class either public & defaut
//take example of chating client
//Funda of inner class is

/*We want this separate inner
class instance to have an intimate relationship with the outer class instance, but we
still want to keep everyone else out. And besides, if you wrote the outer class, then
you also wrote the inner class! So you're not violating encapsulation*/

//a private inner class even access private variables of outer class & vice versa


public class _1bb1 {
	private static int i=9;
	
	 class bigb
	{
		private int b=100;
	private void bib() {
		System.out.println(i);
		System.out.println(b);
	}
	
	
	
	}
	
public static void main(String[] args) {
	_1bb1.bigb n = new _1bb1().new bigb();
	n.bib();
	
	}
	

}
