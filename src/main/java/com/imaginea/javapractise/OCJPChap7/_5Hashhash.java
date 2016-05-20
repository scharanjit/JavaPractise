package OCJPChap7;

//we are doing overriding of equals() & hashCode() methods

public class _5Hashhash {

	public static void main(String[] args) {
		_5Hashhash cc = new _5Hashhash(51);
		_5Hashhash cc1 = new _5Hashhash(51);
		if (cc.equals(cc1))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("NoT");
		}

		System.out.println(cc.hashCode());
		System.out.println(cc1.hashCode());

	}



	public int x;
	_5Hashhash(int xVal)
	{
		x = xVal;
	}

	public boolean equals(Object o) {
		_5Hashhash h = (_5Hashhash) o; // Don't try at home without
		// instanceof test
		if (h.x == this.x)
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	public int hashCode()	
	{ 
		return (x * 17); 
	}
}
