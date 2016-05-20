package OCJPChap8;


//abstarct is used just like that...wnt affect o/p
public abstract class I_16 
{
	public int getNum() 
	{
		return 45;
	}
	public abstract class Bar
	{
		public int getNum() 
		{
			return 38;
		}
	}
	public static void main(String[] args)
	{
		I_16 t = new I_16() 
		{
			public int getNum()
			{
				return 22000; 		//simple overriding
			}
		};
		I_16.Bar f = t.new Bar() 
		{
			public int getNum()
			{
				return 57;  //simple overriding
			}
		};
		System.out.println(f.getNum() + " " + t.getNum());
	}
}

/*You can define an inner class as abstract, which means you can instantiate only
concrete subclasses of the abstract inner class. The object referenced by the variable t
is an instance of an anonymous subclass of AbstractTest, and the anonymous class
overrides the getNum() method to return 22. The variable referenced by f is an instance
of an anonymous subclass of Bar, and the anonymous Bar subclass also overrides the
getNum() method (to return 57). Remember that to create a Bar instance, we need an
instance of the enclosing AbstractTest class to tie to the new Bar inner class instance.
AbstractTest can't be instantiated because it's abstract, so we created an anonymous
subclass (non-abstract) and then used the instance of that anonymous subclass to tie
to the new Bar subclass instance.*/