
public class is {

	//ip n = new ip();
	//as interfaces are true abstract so they aslo cannt be instantiated
	
	ip n1= new ip()
	{
		public void ll()
		{}

		@Override
		public void met() throws NullPointerException {
			// TODO Auto-generated method stub
			
		}
	};
}


interface ip
{
	public void met() throws Exception;
	}