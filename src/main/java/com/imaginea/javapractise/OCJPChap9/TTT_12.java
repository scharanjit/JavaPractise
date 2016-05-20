package OCJPChap9;
//Funda of thread exception & synchronization
// if we are making our thread wait or sleep.....we have to throw or try/catch the exception...unless will get compilation error
//but if we dont synchronise the thread object even after catching the exception,we will get RUN time error.


//SO to avoid complie time error --we use try catch or throw
//& to avoid run time exception we use synchronize


public class TTT_12 
{
	static Thread laurel, hardy;
	public static void main(String[] args)
	{
		laurel = new Thread() 
		{
			public  void run()
			{
				//synchronized (hardy) {
					
				
				System.out.println("A");
				try 
				{
					hardy.sleep(1000);
				} catch (Exception e) 
				{
					System.out.println("B");
				}
				System.out.println("C");
				}
			//}
		};
		hardy = new Thread() 
		{
			public  void run()
			{
				//synchronized (laurel) {
					
					System.out.println("D");
				try 
				{
					laurel.wait();
				}
				catch (Exception e)
				{
					System.out.println("E");
				}
				System.out.println("F");
			//}
			}
			
		};
		laurel.start();
		hardy.start();
	}
}

//UNDERSTOOD..? why it is printing E...i.e. why exception is occuring
//laurel starts...printed A..& put hardy in wait...similrly  hardy stred printed D
// but laurel put hardy on wait...so exception occured  bec hardy has not synchronized on laurel
//if we synnchronized the code...then no exception is going to occur..ie.e uncoment the syn code