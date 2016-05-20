package OCJP;

public class StaticCity
{
	/*static*/ int frog=0;

	public StaticCity()
	{

		frog=frog+1;

	}

	public static void main(String[] args)
	{
		new StaticCity();
		new StaticCity();
		new StaticCity();
		new StaticCity();
		//System.out.println(frog);
		//calling nonstatic instance from static method main
		//so it shud be static

		StaticCity s = new StaticCity();

		System.out.println(s.frog);


	}

}
