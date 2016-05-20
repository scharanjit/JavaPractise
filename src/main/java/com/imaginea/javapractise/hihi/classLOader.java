package hihi;
// A class loader is an object that is responsible for loading classes. The class ClassLoader is an abstract class. 
//types of class loader :- bbotstrap, system & extension class loader

class classLOader11 extends ClassLoader {
    String host;
    int port;

    public Class findClass(String name) {
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassData(String name) {
		return null;
        // load the class data from the connection
        
    }
}