package newProblems;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class colectionsss implements B1 {
    
    public void meth(List list)
    {
        
    }
    
    
    public void meth1(Collections c)
    {
        
    }
    
    
    public void meth2( A a)
    {
        
    }
    
    
    public void meth3( A1 a)
    {
        
    }
    
    
    public static void main(String[] args) {
        colectionsss c = new colectionsss();
        List l = new ArrayList();
        
        c.meth1((Collections) l);
        
        B b = new B();
        c.meth2(b);
        
        
        
    //    c.meth3(B1);
        
        
    }
}


class A{
    
}
    class B extends A
    {}
    
    
interface A1{}
interface B1 extends A1
{}