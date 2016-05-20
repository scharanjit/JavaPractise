package OCJPChap7;

//some problem in code

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import HiHa.nextHighestNumber;

public class Z_13DVDMain{
	
	public static void main(String[] args) throws FileNotFoundException  {
		 ArrayList<Z_12DVDInfo>  dvdList= new ArrayList<Z_12DVDInfo>();
	        try{
	            populateList(dvdList);
	        }catch(Exception e){
	            System.out.println("Exception caught"+e.getMessage());
	        }
	        Collections.sort(dvdList);	
	        System.out.println(dvdList);  //based upon title the list get sorted
	        
	      	
	      
	    }

	 public static void populateList(List<Z_12DVDInfo> info) throws Exception {
         BufferedReader br = new BufferedReader(new FileReader(new File("D:\\JavaTest\\dvdInfo.txt")));
         //read each line of dvdInfo.txt below
          String line = null;
          while ((line = br.readLine()) != null)
          { //check line in loop
             String[] tokens = line.split("/");
             Z_12DVDInfo infoItem = new Z_12DVDInfo(tokens[0],tokens[1],tokens[2]);
             info.add(infoItem);      
         } 
       }

}
