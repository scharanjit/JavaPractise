package j2ee1001;

public class Inheritance {

	
	public static void main(String[] args) {
		parent p = new parent();
		childm c = (childm)p;
	}
}


class parent
{}

class childm extends parent
{}

class child2 extends parent
{}