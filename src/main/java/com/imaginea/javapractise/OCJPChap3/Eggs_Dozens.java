package OCJPChap3;

class Dozens1 
{
	int[] dz = {1,2,3,4,5,6,7,8,9,10,11,12};
}
public class Eggs_Dozens 
{

	public static void main(String[] args)
	{

		Dozens1 [] da = new Dozens1[3];		//4 reference & 1 object
		da[0] = new Dozens1();				//2 objects & 1 reference
		System.out.println(da.hashCode());
		System.out.println(da[0].hashCode());
		//System.out.println(da[1].hashCode());
		Dozens1 d = new Dozens1();			//2 objects & 1 reference
		da[1] = d;
		
		d = null;
		
		da[1] = null;
		//System.out.println(da[1].hashCode());
		//System.out.println(d.hashCode());		// 2 objects die
		System.out.println(da.hashCode());
		System.out.println(da[0].hashCode());
		// do stuff
	}
}

//total objects 1+2+2=5
//died =2...which are eligible for Garbage collection
