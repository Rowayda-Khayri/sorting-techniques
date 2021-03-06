/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.io.*;
import java.util.*;

/**
 *Read data from files
 * @author row
 */
public class ReadData {
    
    /**
     *Read specific data size from the given file
     * @author row
     */
    public ArrayList<Integer> readData(String fileName , int size){
        
        ArrayList<Integer> data = new ArrayList<Integer>();
        
        // The name of the file to open
        fileName = fileName + ".txt";

        // This will reference one line at a time
        String line = null ;

        
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                
                data.add(Integer.parseInt(line));
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            
        }
        
        List<Integer> specificSizeList = new ArrayList<Integer>(data.subList(0,size)); ///not size - 1

        ArrayList<Integer> specificSizeArrayList = new ArrayList<Integer>(specificSizeList);
        
        
        return specificSizeArrayList;
    }
    
    
    
    
}
