package OCJPChap6;

/*Serilization:- save the state of object
 * What does it really mean to save an object? If the instance variables are all primitive
types, it's pretty straightforward. But what if the instance variables are themselves
references to objects? What gets saved?*/

public class CollarDog {
	public static void main(String[] args) {
		Collar c = new Collar(3);
		Dogxx d = new Dogxx(c, 8);

		/*Now what happens if you save the Dog? If the goal is to save and then restore a
Dog, and the restored Dog is an exact duplicate of the Dog that was saved, then the
Dog needs a Collar that is an exact duplicate of the Dog's Collar at the time the Dog
was saved. That means both the Dog and the Collar should be saved.*/


		/*Java serialization takes care of saving that object's entire "object
graph." That means a deep copy of everything the saved object needs to be restored.
For example, if you serialize a Dog object, the Collar will be serialized automatically.*/
	}

}

class Dogxx {
	private Collar theCollar;
	private int dogSize;
	public Dogxx(Collar collar, int size) {
		theCollar = collar;
		dogSize = size;
	}
	public Collar getCollar() { return theCollar; }
}


class Collar {
	private int collarSize;
	public Collar(int size) { collarSize = size; }
	public int getCollarSize() { return collarSize; }
}


