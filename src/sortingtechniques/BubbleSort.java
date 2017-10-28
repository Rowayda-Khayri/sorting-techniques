/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtechniques;

import java.util.ArrayList;

/**
 *
 * @author row
 */
public class BubbleSort {
    
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> data){
           
        int dataSize = data.size();
        
        int comparisons =0;
        
        int swaps = 0 ;
        
        ArrayList<Integer> sortedData = new ArrayList<Integer>();
        
        
        sortedData = data;
        
        for(int pass = 0 ; pass< dataSize; pass++){
            
            for(int i = 0;i <dataSize -1; i++){
            
                comparisons ++ ;
                
                if(sortedData.get(i) > sortedData.get( i + 1)){
                
                    int temp = sortedData.get(i);
                    
                    sortedData.set(i , sortedData.get(i + 1));
                    sortedData.set(i + 1, temp);
                
                    swaps ++ ;
                    
                    
                }
            }
        }
        
        System.out.println("Bubble S swaps :   " + swaps);
        System.out.println("Bubble S comparisons :   " + comparisons);
        
        return sortedData;
    }
    
    
    
    
    
}
