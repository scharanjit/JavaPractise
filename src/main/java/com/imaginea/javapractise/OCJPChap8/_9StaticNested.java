package OCJPChap8;

public class _9StaticNested 
{
	 static class Nested { 
		 static void StaticMeth()
		 {
			 System.out.println("" +
		 "That means it can be accessed, as with other static members," +
			 		" without having an instance of the outer class.");
		 }
	}
	
	public static void main(String[] args) {
		
		Nested.StaticMeth();
		
	}
}


/*The class itself isn't really "static"; there's no such thing as a static class. The
static modifier in this case says that the nested class is a static member of the outer
class. That means it can be accessed, as with other static members, without having
an instance of the outer class.*/