package OCJPChap6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class pointsToremember {
}
/*

1.) Serialization:-
FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);<-- d is the object getting serialized
			os.close();
			
Deserialization:- 
FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog1) ois.readObject();
			ois.close();
			
 
 2.) super not serilise...object value will be the watevr value instantiated
 Transient and static variable cannot be serilised
 Transient die when serialised...default value..ie. 0
 
 Ex14Computer.java,Ex2CardPlayer.java, Ex10TestSer.java,Ex6Car.java
Serailization Concept:- it is not dependent of inheritance concept..
if we use instance/reference of non serailizable in serializable class,we will get exception
//if we extend non serialzable but wnt use its instance no exception..buss the object lost its state
 
 
 3.)--parse() method--> takes a String formatted in the style of the DateFormat and converts the String into a Date object
 
4.) chk DatinGermany1.javaq

5.) FormattingUsingPrintfFormat.java
sysout("%2$d ",i1,i2);

6.) regular expression--> RegexSmall.java,Ex1Regex2.java,Ex4Archie.java
7.)Tokenizing:-chk --> SplitTest.java; Parsing -->Ex5Slice.java

8.) StringBufferFunc.java ,StringImut.java,Ex9Theory.java
String is immutable bec JVM creates String Constatnt pool(if literable already availble..dont create..set new refernce gto the same)
 bec string is final class, we cnnt override its methods.
 
9.) File f = new File("dire_name");
f.mkDir();
File f1 = new File(f,"file_name.txt")
 f1.createNewFile();
 FileWriter fw = new FileWriter(file); // create an actual file
			// & a FileWriter obj
			fw.write("howdy\nfolks\n"); // write characters to
			// the file
			fw.flush(); // flush before closing
			fw.close(); // close file when done
FileReader fr = new FileReader(file); // create a FileReader
			// object
			size = fr.read(in); // read the whole file!
			System.out.println(size + " "); // how many bytes read
			for(char c : in) // print the array
				System.out.print(c);
 
 
 */
