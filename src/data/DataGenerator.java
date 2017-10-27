/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author row
 */
public class DataGenerator {
    
    
//    public String[] generateRandomData(){
    public Integer[] generateRandomData(){
        
        int counter ;
        Random randomnum = new Random();
        
        Integer[] generatedData = new Integer[1500];
        
        //generate 1500 random numbers between 0 and 9999
        for (counter = 0; counter < 1500; counter++) {
            
            int rand  = randomnum.nextInt(9999);
        
            generatedData[counter]  = rand;

        }
        
       return generatedData; 

    } 
    
    public void SaveDataToFile(Integer[] data, String fileName){
        
        // The name of the file to create
        fileName = fileName + ".txt";
        
        String delimiter = new String();
        
        delimiter = "\n";

        //save to file
        try {
            // Assume default encoding
            FileWriter fileWriter =
                new FileWriter(fileName);

            //  wrap FileWriter in BufferedWriter
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            
            for(int i = 0;i<data.length;i++){
                
                //write value 
                bufferedWriter.write(data[i] + delimiter);
            }
            
            //  close file
            bufferedWriter.close();
            System.out.println("Saved");
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            
        }
    
        
        
    }
    
    public Integer[] sortData(Integer[] data){
        
        int dataSize = data.length;
        
        Integer[] sortedData = new Integer[dataSize] ;
        
        sortedData = data;
        
        //sort data
        Arrays.sort(sortedData);
      
        
        
        return sortedData;
    }
    
    public Integer[] inverselySortData(Integer[] data){
        
        int dataSize = data.length;
        
        Integer[] inverselySortedData = new Integer[dataSize] ;
        
        //inversely sort data
        Collections.reverse(Arrays.asList(data));
        
        inverselySortedData = data;
        
        return inverselySortedData;
    }
    
    
}
