/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.prm.twotwo;

import java.util.ArrayList;

/**
 *
 * @author Charanjit.Singh
 */
public class B extends A {

    public static void main(String[] args) {
        A ref = new B();

//        B ref1 = (B) new A();

        ArrayList names = new ArrayList();
        names.add("abcd"); //adding String
        names.add(1);   //adding Integer

        String name = (String) names.get(0); //OK
        try{
        name = (String) names.get(1); // throw ClassCastException because you can not convert
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
