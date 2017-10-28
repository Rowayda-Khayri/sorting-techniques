/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.io.*;
import java.util.*;

/**
 *
 * @author row
 */
public class ReadData {
    
    public ArrayList<Integer> readData(String fileName , int size){
        
        ArrayList<Integer> data = new ArrayList<Integer>();
        
        // The name of the file to open.
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
                
//                data = append(data, line);
                data.add(Integer.parseInt(line));
//                System.out.println(line);
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
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
        
        
        return data;
    }
    
    
    
    
}
