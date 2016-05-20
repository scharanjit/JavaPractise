package pRACTISE;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StrinInAFile {
	public static void main(String[] args) throws IOException {
		
		File f = new File("ACat1.txt");
		f.createNewFile();
		
		
		FileWriter f1 = new FileWriter("ACat1.txt");
		
		
		f1.write("I am a good boy \n \n i am not a good boy");
		
		
		f1.flush();
		f1.close();
		
		
		FileReader fr = new FileReader("ACat1.txt");
		
		BufferedReader bf = new BufferedReader(fr);
		String line;
		String value= "not";
		int linecount=0;
		while((line=bf.readLine())!=null)
		{
			int ndex= line.indexOf(value);
			linecount++;
			if(line.contains(value))
			{
				System.out.println(value+ " found in file on line number "+linecount+" at index " +ndex);
			}
		}
	}
}
