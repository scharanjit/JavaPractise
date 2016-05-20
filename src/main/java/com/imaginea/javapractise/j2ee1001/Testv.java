package j2ee1001;

 public class Testv {

    public String meth(String a) {
     return null;   
    }
    
    public static void main(String args[]) {
        Testv test = new Testv();
    	Object obj = test.meth("abc"); //No type casting is required here       
    }
}
