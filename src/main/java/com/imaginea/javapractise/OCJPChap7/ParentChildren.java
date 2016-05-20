package OCJPChap7;

public class ParentChildren {
	public static void main(String[] args) {
		Parents p = new Parents();
		Children c = new Children();
		
		Parents p1 = new Children();
		Children c2 = (Children) new Parents(); // why we need to type casted it
											//beacuse parent object conatin other types too
											//children can refer only those parents which have children type
											//but it will give run time error
	}

}
