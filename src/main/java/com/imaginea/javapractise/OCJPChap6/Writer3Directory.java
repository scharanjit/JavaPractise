package OCJPChap6;

import java.io.*;

public class Writer3Directory {
	public static void main(String[] args) {
		File myDir = new File("mydir"); // create an object
		myDir.mkdir(); // create an actual directory
		File myFile = new File(myDir, "myFile.txt");
		try {
			myFile.createNewFile();				// exception if no mkdir!
			
			
			
			File delDir = new File("deldir"); // make a directory
			
			delDir.mkdir();
			
			File delFile1 = new File(delDir, "delFile1.txt"); // add file to directory
			
			delFile1.createNewFile();
			
			File delFile2 = new File(delDir, "delFile2.txt"); // add file to directory
			delFile2.createNewFile();
			delFile1.delete(); // delete a file
			
			System.out.println("delDir is "+ delDir.delete()); // attempt to delete
			// the directory
			
			File newName = new File(delDir, "newName.txt"); // a new object
			
			delFile2.renameTo(newName); // rename file
			
			File newDir = new File("newDir"); // rename directory
			
			delDir.renameTo(newDir);
			
			
			
			
			
			
			//searching files present in the directory
			
			String[] files = new String[100];
			File search = new File("newDir");
			files = search.list(); // create the list
			for(String fn : files) // iterate through it
			System.out.println("found " + fn);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
