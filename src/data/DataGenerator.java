/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.*;

/**
 *
 * @author row
 */
public class DataGenerator {
    
    
    public String[] generateRandomData(){
        
        int counter ;
        Random randomnum = new Random();
        
        //declare string obj to accept any data type
        
        String[] generatedData = new String[1500];
        
        //generate 1500 random numbers between 0 and 9999
        
        for (counter = 0; counter < 1500; counter++) {
            
            int rand  = randomnum.nextInt(9999);
        
            //convert int to string to be stored in string array 
            String convertedInt = new String();
            convertedInt = Integer.toString(rand);
            generatedData[counter]  = convertedInt;

        }
//        System.out.println(generatedData.length); //1500

       return generatedData; 

    } 
    
    
    
}
