package hihi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

//saving the state of of an objec on a file in a squence of bytes
//(bytecode is calld ser....& retrieving is kown des)

public class serializationEample {
	
	public static void main(String[] args) throws IOException {
		
		 serializationEample s= new serializationEample();
		 
		FileOutputStream fle= new FileOutputStream("data.ser");
		ObjectOutputStream obj= new ObjectOutputStream(fle);
		obj.writeObject(s);
		obj.close();
	}

}
