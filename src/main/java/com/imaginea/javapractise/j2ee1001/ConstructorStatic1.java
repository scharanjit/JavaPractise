package j2ee1001;

public class ConstructorStatic1 {

    static int p=10;
    static int q;
    
    static {
     System.out.println("Welcome");   
    }
    
    ConstructorStatic1() {
     q = p + 1;
    }
    
    
    public void print(int a) {
        System.out.println("p :"+p+" q :"+q+" a :"+a);
    }

    public static void main(String arags[]) {
    	ConstructorStatic1 obj1 = new ConstructorStatic1();
       obj1.print(25);
    }
}


