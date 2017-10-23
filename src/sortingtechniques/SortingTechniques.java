/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtechniques;

import data.*;

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
        
        String[] randomData = new String[1500];
        randomData = dg.generateRandomData();
        
        String fileName = "randomData";
        dg.SaveDataToFile(randomData , fileName);
        
        
        
    }
    
}
