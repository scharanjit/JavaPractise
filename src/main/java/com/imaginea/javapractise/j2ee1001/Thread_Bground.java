package j2ee1001;
//IMPORTANT

//if we use implemnts Runnable then run method define krna necessaryx
public class Thread_Bground extends Thread
{
	public static void main(String argv[]) 
	{
		Thread_Bground b = new Thread_Bground();
		b.run();
    }
    public void start()
	{
       for (int i = 0; i< 10;i++)
       System.out.println("Value of i =" +i);
    }
 }
