package pRACTISE;

public class tryReturnfinally {
	public static void main(String[] args) {
		
		
		try
		{
			System.out.println("try");
			
			int i=7;
			/*try
			{
			    try
			    {
			    }
			   /* catch(Exception e)
			    {}   // try must be followed by catch
			  
			}
			catch(Exception e)
			{
			}*/
			int j=i/0;
			return;
			
		}
		catch (Exception e) {
			System.out.println("catc");
		}
		
		finally
		{
			System.out.println("finally");
		}
	}
	
	
	private class bb
	{
		
	}

}
