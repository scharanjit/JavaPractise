/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charanjit.singh
 */
public class abc {

    public static void main(String[] args) {

        int i = 5;
        try {
            int j = i / 0;

        } catch (Exception e) {
            meth(e);
        }

    }

    private static void meth(Exception e) {
        try {
            meth();
            throw e;

        } catch (Exception e1) {
            System.out.println("hiii");
        }
    }

    private static void meth() {

        int m = 20;
        int k = m + 1;
        System.out.println(k + "      ______________   " + m);
    }

}
