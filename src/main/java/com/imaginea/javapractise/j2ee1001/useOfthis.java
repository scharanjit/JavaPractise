package j2ee1001;

class Try
{
	int x,y;
	public void init(int x, int y) {
		this.x = x;
		y = y;
	}
	public void show() {
		System.out.println ("x="+x);
		System.out.println ("y="+y);
	}
}
public class useOfthis
{
	public static void main(String args[])
	{
		
		
		Try t = new Try();
		t.init(4,4);
		t.show();
	}
}
