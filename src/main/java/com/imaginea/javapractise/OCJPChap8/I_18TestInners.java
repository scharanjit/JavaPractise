package OCJPChap8;

class A 
{ 
	void m() 
	{ 
		System.out.println("outer");
		} 
	}

public class I_18TestInners 
{
	public static void main(String[] args)
	{
		new I_18TestInners().go();
	}
	void go() 
	{
		new A().m();
		class A 
		{ 
			void m()
			{ 
				System.out.println("inner");
				}
			}
	}
	class A 
	{
		void m() 
		{ 
			System.out.println("middle");
			} 
		}
}


/*The "inner" version of class A isn't used because its declaration comes
after the instance of class A is created in the go() method.*/