package OCJP;


class Gameshape
{
	public void displayShape()
	{
		System.out.println("displaying shape");
	}
}

class Player extends Gameshape
{
	public void Moveshape()
	{
		System.out.println("move");
	}
}

class Tittle extends Gameshape
{
	public void getAdjacent()
	{
		System.out.println("getting");
	}
}


public class Testshape {


	public static void main(String[] args) {
		Player p = new Player();
		Tittle t = new Tittle();
		doShhapes(p);
		doShhapes(t);
		// any subclass of gameshape can be passed to a method  with an argument of type gameshape
	}

	public static void doShhapes(Gameshape shape)
	{
		shape.displayShape();
	}
}

