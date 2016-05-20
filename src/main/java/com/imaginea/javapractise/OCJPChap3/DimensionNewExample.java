package OCJPChap3;

import java.awt.Dimension;

public class DimensionNewExample {


	public static void main (String [] args)
	{
		Dimension d = new Dimension(5,10);
		DimensionNewExample rt = new DimensionNewExample();
		System.out.println("Before modify() d.height = " + d.height);
		rt.modify(d);
		System.out.println("After modify() d.height = "+ d.height);

		// lets do same with string
		String g = "GEL ";

		System.out.println("Before modifying,the value of g : "+g);

		System.out.println("Mustard :"+rt.mustard(g));
		System.out.println("After Modigying : "+g);
		g=g+"-Hilaa-";
		g=g.concat("-HSd");

		String m =g+"-Hilaa";
		System.out.println("M : "+m);
		System.out.println("G : "+g);
	}


	public String mustard(String g)
	{

		g=g+" Show";

		return g;
	}

	void modify(Dimension dim)
	{
		dim.height = dim.height + 1;
		System.out.println("dim = " + dim.height);
	}

}
