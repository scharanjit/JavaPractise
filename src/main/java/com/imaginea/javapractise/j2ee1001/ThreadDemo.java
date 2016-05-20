package j2ee1001;

public class ThreadDemo extends Thread  {
	String name;
	double amount;
	
	public ThreadDemo(String name,double amount)
	{
		super(name);
		this.amount=amount;
		this.name=name;
	}
	
	public void display(double amount) throws InterruptedException
	{
		System.out.println("display :"+getName()+" amount : "+amount);
		Thread.sleep(1000);
		display1();
	}
	
	public void display1() throws InterruptedException
	{

		System.out.println("diaplay1 :"+getName()+ " amount1 : "+ amount);	
	}

	public void run()
	{
		try {
			display(this.amount);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ThreadDemo x = new ThreadDemo("Ram",1000);
		ThreadDemo y = new ThreadDemo("sam",2000);

		x.start();
		y.start();
	}

}
