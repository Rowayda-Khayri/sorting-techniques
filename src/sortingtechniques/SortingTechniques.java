/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtechniques;

import data.*;
import java.util.*;

/**
 *
 * @author row
 */
public class SortingTechniques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create object to use mehods in class 
        DataGenerator dg = new DataGenerator();
        
        int dataSize = 1500;
        //create int array to cintain returned random data
        String[] randomData = new String[dataSize];
        
        randomData = dg.generateRandomData();
        
        String fileName = "randomData";
        //save randomData to file
        dg.SaveDataToFile(randomData , fileName);
        
        String[] sortedData = new String[dataSize];
        
        //sort the random data
        sortedData = dg.sortData(randomData);
        
        fileName = "sortedData";
        
        //save sortedData to file
        dg.SaveDataToFile(sortedData , fileName);
        
        
        
    }
    
}
