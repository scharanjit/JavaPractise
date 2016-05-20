package j2ee1001;


//lot of error is question...so ignore
public  class Thread_for extends Thread
{
	
public static void main(String argv[])
{
	Thread_for C = new Thread_for();
	C.start();
}

public void run()
{
	for(int i=0 ; i<10 ; i++);    //,,--look at he semi colun
	{
		
		
		//System.out.println(i); // why bec  i died after coming out of for loop
	}
	
}
}

