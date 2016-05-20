package OCJPChap6;
//#IGNORE o/p
import java.io.File;
import java.io.IOException;

public class Ex11Directores {
	
	
	public static void main(String [] args) throws IOException {
		
		File dir1 = new File("dir1");
		dir1.mkdir();
		File file1 = new File(dir1, "file1");
		file1.createNewFile();
		
		File dir2 = new File("dir2");
		dir2.mkdir();
		File file2 = new File(dir2, "file2");
		file2.createNewFile();
		
		String [] dirs = {"dir1", "dir2"};
		
	for (String d : dirs) {
		String path = d;
		
	File file = new File(path, dirs[0]);
	// insert code 2 here  
	System.out.print(file.isFile() + " ");
	System.out.print(file.isFile() + " ");
	
	}
	}

}

/*
 * import java.io.*;
class Directories {
static String [] dirs = {"dir1", "dir2"};
public static void main(String [] args) {
for (String d : dirs) {
// insert code 1 here
File file = new File(path, args[0]);
// insert code 2 here
}
}
}
and that the invocation
java Directories file2.txt
is issued from a directory that has two subdirectories, "dir1" and "dir2", and that "dir1" has a file
"file1.txt" and "dir2" has a file "file2.txt", and the output is "false true", which set(s)
of code fragments must be inserted? (Choose all that apply.)
A. String path = d;
System.out.print(file.exists() + " ");
B. String path = d;
System.out.print(file.isFile() + " ");
C. String path = File.separator + d;
System.out.print(file.exists() + " ");
D. String path = File.separator + d;
System.out.print(file.isFile() + " ");

Answer:
 A and B are correct. Because you are invoking the program from the directory whose
direct subdirectories are to be searched, you don't start your path with a File.separator
character. The exists() method tests for either files or directories; the isFile()
method tests only for files. Since we're looking for a file, both methods work.
 * 
 * 
 * 
 * 
 * 
 * 
 * */
