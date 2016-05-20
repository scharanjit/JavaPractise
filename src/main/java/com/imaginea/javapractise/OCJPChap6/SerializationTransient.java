package OCJPChap6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTransient {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		A as = new A();
		System.out.println(as.a+"   "+as.t1+"   "+as.c+"    "+as.g+" "+as.m);
		
		
		
		FileOutputStream f = new FileOutputStream("test.ser");
		ObjectOutputStream o1= new ObjectOutputStream(f);
		o1.writeObject(as);
		as.a=as.a+1;
		as.m=as.m+1;
		
		try {
			o1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileInputStream f1 = new FileInputStream("test.ser");
		ObjectInputStream o2 = new ObjectInputStream(f1);
		A as1 = (A)o2.readObject();
		System.out.println(as1.a+"   "+as1.t1+"   "+as1.c+"    "+as1.g+" "+as1.m);
		
		
	}
}


class A implements Serializable
{
	int m=5;
	static int a=8;
	transient int t1=6;
	transient char c ='f';
	transient String g= "Hello";
}
