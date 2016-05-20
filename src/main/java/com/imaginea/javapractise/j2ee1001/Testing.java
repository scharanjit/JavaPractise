package j2ee1001;

public class Testing {
	
	void Testing()
	{
		System.out.println("Good Bye");
	}
	
	String Testing(int i)
	{
		this.Testing();
		return null;
	}
	
	Testing(String str)
	{
		int n=10;
		this.Testing(10);
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Testing t = new Testing("Hello");
	}

}
