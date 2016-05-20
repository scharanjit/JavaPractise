package OCJPChap3;

class Box {
	int size;
	Box(int s) 
	{
		size = s; 
		}
}
public class Laser 
{

	public static void main(String[] args) 
	{
		Box b1 = new Box(5);
		Box[] ba = go(b1, new Box(6));
		ba[0] = b1;

		
		for(Box b : ba)

			System.out.print(b.size + " ");
				//samjha..??...very easy....ba contains a value & size..which go function returns
				// it will print size twice....bec array size is two
				//Box[] is a 2 dimen sional array
				//see the magic after commenting line ba[0] = b1;
	}
	static Box[] go(Box b1, Box b2) {
		b1.size = 4;

		Box[] ma = {b2, b1};
		return ma;
	}
}