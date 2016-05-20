package j2ee1001;

class baseff
{
	void bb()
	{
		try {
			int  i =0;
			int  j=4;
			int k=0;

			k= j/i ;

			System.out.println(k);

		} catch (Exception e) {
			System.out.println("caught");
		}
	}
}

public class excep {

	public static void main(String[] args) {
		try {
			baseff b = new baseff();

			b.bb();
		} catch (Exception e) {
			System.out.println("recaught");
		}
	}
}
