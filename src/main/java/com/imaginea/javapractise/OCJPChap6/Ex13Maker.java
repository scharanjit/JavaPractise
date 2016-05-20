package OCJPChap6;
/*Using the fewest fragments possible (and filling the fewest slots possible), complete the code
below so that the class builds a directory named "dir3" and creates a file named "file3" inside
"dir3". Note you can use each fragment either zero or one times.*/

import java.io.File;
public class Ex13Maker {
	public static void main(String[] args) {
		try {
			File dir = new File("dir3");
			dir.mkdir();
			File file = new File(dir, "file3");
			file.createNewFile();
		} 
		catch (Exception x)
		{ }
	} 
}