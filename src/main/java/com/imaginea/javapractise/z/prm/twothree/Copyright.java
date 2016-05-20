/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package z.prm.twothree;

/**
 *
 * @author Charanjit.Singh
 */

//How to Create a Custom Annotations?
public @interface Copyright {
    String info() default "hi";
}
