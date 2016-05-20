package newProblems;

import java.lang.*;

public class finalModifier {
     private String name;

        public finalModifier (String s) {
            this.name = s;
        }

        public void setName(String s) {
            this.name = s;
        }
    

    private void test (final finalModifier n) {
        //n=new finalModifier("s");  --> it will show compilation error
        n.setName("test");
    }
    
    
    public static void main(String[] args) {
    String hi= "Hi";
        hi="Hi";
        
    
        
        System.out.println(hi.equals("Hi"));
    }
}
