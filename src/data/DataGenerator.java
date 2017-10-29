
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
    public ArrayList<Integer> generateRandomData(int size, int range){
        
        int counter ;
        Random randomnum = new Random();
        
        
        ArrayList<Integer> generatedData = new ArrayList<Integer>();
        
        for (counter = 0; counter < size  ; counter++) {
            
            int rand  = randomnum.nextInt(range);
        
            generatedData.add(rand);

        }
        
       return generatedData; 

    } 
    
    public void SaveDataToFile(ArrayList<Integer> data, String fileName){
        
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

            
            for(int i = 0;i<data.size();i++){
                
                //write value 
                bufferedWriter.write(data.get(i) + delimiter);
            }
            
            //  close file
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            
        }
    
        
        
    }
    
    public ArrayList<Integer> sortData(ArrayList<Integer> data){
        
//        int dataSize = data.length;
        
        ArrayList<Integer> sortedData = new ArrayList<Integer>() ;
        
        sortedData = data;
        
        //sort data
//        Arrays.sort(sortedData);
        Collections.sort(sortedData);
      
        
        
        return sortedData;
    }
    
    public ArrayList<Integer> inverselySortData(ArrayList<Integer> data){
        
//        int dataSize = data.length;
        
        ArrayList<Integer> inverselySortedData = new ArrayList<Integer>() ;
        
        inverselySortedData = data;
        
        //inversely sort data
        Collections.reverse(inverselySortedData);
        
        
        
        return inverselySortedData;
    }
    
    
}
