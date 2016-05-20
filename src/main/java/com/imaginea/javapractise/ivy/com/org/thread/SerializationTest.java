/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ivy.com.org.thread;

/**
 *
 * @author charanjit.singh
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 Serialization and singleton working properly

In order to make serialization and singleton work properly,we have to introduce readResolve() method in the singleton class.readResolve() method lets developer control what object should be returned  on deserialization.
For the current ConnectionFactory singleton class,readResolve() method will look like this.
 *
 */
public class SerializationTest {

 /**
  * @param args
  * @throws IOException 
  * @throws FileNotFoundException 
  * @throws ClassNotFoundException 
  */
 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
  ConnectionFactory INSTANCE=ConnectionFactory.getInstance();
  
  //Here I am serializing the connection factory instance
  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("connFactory.ser"));  
        oos.writeObject(INSTANCE);  
        oos.close();  
        
        //Here I am recreating the instance by reading the serialized object data store
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("connFactory.ser"));  
        ConnectionFactory factory1 = (ConnectionFactory) ois.readObject();  
        ois.close();  
        
        //I am recreating the instance AGAIN by reading the serialized object data store
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("connFactory.ser"));  
        ConnectionFactory factory2 = (ConnectionFactory) ois2.readObject();  
        ois2.close();
        
        //Lets see how we have broken the singleton behavior
        
        System.out.println("Instance reference check->" +factory1.getInstance());
        System.out.println("Instance reference check->" +factory2.getInstance());
        System.out.println("=========================================================");
        System.out.println("Object reference check->"+factory1);
        System.out.println("Object reference check->"+factory2);
 }

}