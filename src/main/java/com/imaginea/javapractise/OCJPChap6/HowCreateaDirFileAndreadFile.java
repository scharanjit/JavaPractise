package OCJPChap6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowCreateaDirFileAndreadFile {

	public static void main(String[] args) throws IOException {
		File f = new File("dir451");
		f.mkdir();
		File f1 = new File(f,"InsideFile1");
		f1.createNewFile();
		FileWriter fw = new FileWriter(f1);
		fw.write("Tuhadi \\n pen di");
		fw.flush();
		fw.close();
		
		
		FileReader fr = new FileReader(f1);
		String str=null;
		
		
		try {
		    FileInputStream fstream = new FileInputStream("D:/JavaTest/dir451/InsideFile1");
		    BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		    String strLine;         
		    
		    // Read File Line By Line
		    while ((strLine = br.readLine()) != null) {
		    	System.out.println(strLine);
		                
		    }
		    
		    
		    // Close the input stream
		         
		} catch (Exception e) {// Catch exception if any
		    System.err.println("Error: " + e.getMessage());
		}


	}
}
