package OCJP;

public interface Bounce  extends Moveable {
	//an interface can extend multiple interface
	// but a class CAN NOT EXTEND MULTIPLE CLASSES
	public void ball();
	public void fact(int f);

}


//class cannot extend multiple class
//interface can extend multiple interfaces
//interface cant EXTEND/IMPLEMENT A CLASS