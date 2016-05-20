/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imaginea.javapractise.JAVAPUZZLES2016;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author charanjits
 */
public class Gap {
    private static final int GAP_SIZE=10*1024;
    public static void main(String[] args) throws IOException {
        File tmp= File.createTempFile("gap", ".txt");
        FileOutputStream fos = new FileOutputStream(tmp);
        fos.write(1);
        fos.write(new byte[GAP_SIZE]);
        fos.write(2);
        fos.close();
        
        InputStream in = new BufferedInputStream(new FileInputStream(tmp));
        int first=in.read();
        in.skip(GAP_SIZE);
        int last=in.read();
        System.out.println(first+last);
        
        
    }
    
}
