package OCJPChap7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import HiHa.nextHighestNumber;

public class DVDMain {
	
	public static void main(String[] args) throws IOException {
		File file = new File("dvdInfo.txt");
		 file.createNewFile();
		 
		 FileWriter fw = new FileWriter("dvdInfo.txt");
		 fw.write("Donnie Darko/sci-fi/Gyllenhall, Jake \n "+
		 		" Raiders of the Lost Ark/action/Ford, Harrison " +
		 		"\n 2001/sci-fi/?? \nCaddy Shack/comedy/Murray, Bill " +
		 		"\n Star Wars/sci-fi/Ford, Harrison " +
		 		"\n Lost in Translation/comedy/Murray, Bill" +
		 		" \n Patriot Games/action/Ford, Harrison");
		 fw.flush(); // flush before closing
		 fw.close(); // close file when done
	}

}
