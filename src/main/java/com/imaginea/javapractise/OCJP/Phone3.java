package OCJP;

interface Device
{
	public void doIt();	
}





class Electronics implements Device
{
	public void doIt()
	{

	}

}

public class Phone3 extends Electronics implements Device {

	public String doIt(int x)//ver clever...changed number of arguments inside method def
	{
		return null;

	}
	 
	//we CAN overload
}