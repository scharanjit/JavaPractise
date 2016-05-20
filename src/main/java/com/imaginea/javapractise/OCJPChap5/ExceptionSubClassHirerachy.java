package OCJPChap5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ExceptionSubClassHirerachy {

	public static void main(String[] args) {
		try {
			RandomAccessFile raf =  new RandomAccessFile("myfile.txt", "r");
		} 
		catch (FileNotFoundException ex) {
			// handle just FileNotFoundException
		}

		catch (IOException e) {
			// handle general IOExceptions
		} 

		/*catch (FileNotFoundException ex) {
		// handle just FileNotFoundException
		}
		 */
		// FileNotFoundException is the subclass of IOException
	}

}
