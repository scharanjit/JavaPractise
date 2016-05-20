/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentService;

import parentServiceChild.persistence;

/**
 *
 * @author charanjit.singh
 */
public class usage {

    persistence p = new persistence();

    public static void main(String[] args) {
        usage u = new usage();
        u.call();

    }

    private void call() {
        try {
            p.save();
        } catch (Exception e) {

        e.printStackTrace();

        }

    }

}
