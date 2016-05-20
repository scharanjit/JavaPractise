
public class Ax extends bX{

	public cX c;
	public  int meth(int i,String j)
	{
		System.out.println(i+" "+j+" "+"Ax");
		return 7;
		}
	
	public static void main(String[] args) {
		Ax a = new Ax();
		a.meth(3, "f");
		
		bX b = new bX();
		b.meth(66, "bZBXBBXBXB");
		
		bX b1 = new Ax();
		b1.meth(3, "refOf B but object of A : ");
		
	//	Ax v = (Ax) new bX();
		//v.meth(2, "d"); //run time
		
		
		cX o = new cX();
		o.meth(55, "fdf");
		
		//cX odd= new Ax();
		//Ax bj = new cX();
		
		//compilation
	}
}


class bX
{
public int meth(int i,String j)
{
	System.out.println(i+" "+j+" "+"bX");
	return 7;
	}
}


class cX
{
public int meth(int i,String j)
{
	System.out.println(i+" "+j+" "+"cX");
	return 7;
	}
}