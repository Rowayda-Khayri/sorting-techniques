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
        // TODO code application logic here
        
        System.out.println("Hello Java :)");
        
         DataGenerator d = new DataGenerator();
        
        String[] data = new String[1500];
        data = d.generateRandomData();
        
        
        
    }
    
}
