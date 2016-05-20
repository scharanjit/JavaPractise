package hihi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;



public class consoless {

	public static void main(String[] args) throws IOException {
		String s1 = null;
		for(int i=0; i<args.length;i++)
		{
			s1=s1+" "+args[i];
		}
		RandomAccessFile rw= new RandomAccessFile("D:/abc.txt", "rw");
		rw.writeBytes(s1);
	
		System.out.println("");
	}
}
