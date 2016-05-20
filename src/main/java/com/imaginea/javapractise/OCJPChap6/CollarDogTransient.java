//package OCJPChap6;
//import java.io.*;
///*But what would happen if we didn't have access to the Collar class source code?
//In other words, what if making the Collar class serializable was not an option? Are
//we stuck with a non-serializable Dog?
//
////That's where the transient modifier comes in. If you mark the Dog's Collar
//instance variable with transient, then serialization will simply skip the Collar
//during serialization
//
//Consider the problem: we have a Dog object we want to save. The Dog has a Collar,
//and the Collar has state that should also be saved as part of the Dog's state. But…the
//Collar is not Serializable, so we must mark it transient. That means when the Dog
//is deserialized, it comes back with a null Collar. What can we do to somehow make
//sure that when the Dog is deserialized, it gets a new Collar that matches the one the
//Dog had when the Dog was saved?
//
////Using writeObject and readObject
//
// */
//public class CollarDogTransient 
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("hi");
//	}
//}
//
//class Dog implements Serializable 
//{
//	transient private Collar theCollar; // we can't serialize this
//	private int dogSize;
//	public Dog(Collar collar, int size) {
//		theCollar = collar;
//
//		dogSize = size;
//	}
//	public Collar getCollar() 
//	{ 
//		return theCollar;
//	}
//
//	private void writeObject(ObjectOutputStream os) {
//		// throws IOException { // 1
//		try {
//			os.defaultWriteObject(); // 2
//			os.writeInt(theCollar.getCollarSize()); // 3
//		} catch (Exception e) { e.printStackTrace(); }
//	}
//	private void readObject(ObjectInputStream is) {
//		// throws IOException, ClassNotFoundException { // 4
//		try {
//			is.defaultReadObject(); // 5
//			theCollar = new Collar(is.readInt()); // 6
//		} catch (Exception e) { e.printStackTrace(); }
//	}
//}
//
//
//
///*
// * 1. Like most I/O-related methods writeObject() can throw exceptions. You
//can declare them or handle them but we recommend handling them.
//2. When you invoke defaultWriteObject() from within writeObject()
//you're telling the JVM to do the normal serialization process for this object.
//When implementing writeObject(), you will typically request the normal
//serialization process, and do some custom writing and reading too.
//3. In this case we decided to write an extra int (the collar size) to the stream
//that's creating the serialized Dog. You can write extra stuff before and/or
//after you invoke defaultWriteObject(). BUT…when you read it back in,
//you have to read the extra stuff in the same order you wrote it.
//4. Again, we chose to handle rather than declare the exceptions.
//5. When it's time to deserialize, defaultReadObject() handles the normal
//deserialization you'd get if you didn't implement a readObject() method.
//6. Finally we build a new Collar object for the Dog using the collar size that we
//manually serialized. (We had to invoke readInt() after we invoked
//defaultReadObject() or the streamed data would be out of sync!)
//
//
//
//
//Which brings up another question—why wouldn't all Java classes be serializable?
//Why isn't class Object serializable? There are some things in Java that simply cannot
//be serialized because they are runtime specific. Things like streams, threads, runtime,
//etc. and even some GUI classes (which are connected to the underlying OS) cannot
//be serialized. What is and is not serializable in the Java API is NOT part of the exam,
//but you'll need to keep them in mind if you're serializing complex objects.
//
// */
