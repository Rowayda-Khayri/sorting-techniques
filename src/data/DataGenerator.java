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
    
    public void SaveDataToFile(String[] data, String fileName){
        
        // The name of the file to create
        fileName = fileName + ".txt";
        
        char delimiter = ',';

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
    
    public String[] sortData(String[] data){
        
        int dataSize = data.length;
        
        String[] sortedData = new String[dataSize] ;
        
        sortedData = data;
        
        Arrays.sort(sortedData);
        
        return sortedData;
    }
    
    public String[] inverselySortData(String[] data){
        
        int dataSize = data.length;
        
        String[] inverselySortedData = new String[dataSize] ;
        
        inverselySortedData = data;
        
        Arrays.sort(inverselySortedData);
        
        return inverselySortedData;
    }
    
    
}
