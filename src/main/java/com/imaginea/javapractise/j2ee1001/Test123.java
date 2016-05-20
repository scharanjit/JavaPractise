package j2ee1001;


class basi
{
	void display()
	{System.out.println("hihi");}
}
class dasi extends basi
{
	void display()
	{System.out.println("hihi dasiiiii");}

	}

public class Test123 {
	public static void main(String[] args) {
		basi b = new dasi();
				b.display();
	}

}
