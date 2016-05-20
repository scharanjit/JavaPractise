/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imaginea.javapractise.JAVAPUZZLES2016;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author charanjits
 */
public class puzzle2 {

    public static final String[] URL_NAMES = {
        "http://www.javapuzzlers.com/",//same IP
        "http://findbugs.sourceforge.net/",
        "https://www.google.co.in/",
        "http://cs.umd.edu/",
        "http://cs.umd.edu/",
        "http://www.javapuzzlers.com/",//same IP
        "http://www.javapuzzlers.com/",//same IP
        "http://apache2-snort.skybar.dreamhost.com/" //same IP

    };

    public static void main(String[] args) throws MalformedURLException {
        Set<URL> fav = new HashSet<URL>();
        for (String url : URL_NAMES) {
            fav.add(new URL(url));
        }
        System.out.println(fav.size());
        
        Set<URI> fav1 = new HashSet<URI>();
        for (String url : URL_NAMES) {
            fav1.add(URI.create(url));
        }
        System.out.println(fav1.size());
        
        //conclusion is URI is safe

    }

}
