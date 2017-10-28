/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtechniques;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author row
 */
public class LinearSort {
    
    
    public ArrayList<Integer> linearSort(ArrayList<Integer> data){
        
        
        int dataSize = data.size();
        ArrayList<Integer> sortedData = new ArrayList<Integer>();
        
        sortedData = data;
        
        ArrayList<Integer> Data2 = new ArrayList<Integer>();

        int outer, inner, min;
        
        int comparisons =0;
        
        int swaps = 0 ;
        
        for (outer = 0; outer < dataSize - 1; outer++) { // outer counts down 
        
        min = outer;
        
        for(inner = outer + 1; inner < dataSize; inner++){
        
        comparisons ++;
        
        if(sortedData.get(inner) < sortedData.get(min)){
        
        min = inner;
        }
        // Invariant: for all i, if outer <= i <= inner, then a[min] <= a[i]  
        }
        // a[min] is least among a[outer]..a[a.length - 1] 
       
        
        int temp = sortedData.get(outer);

        sortedData.set(outer, sortedData.get(min));

        sortedData.set(min, temp);
        
        swaps++;
        
        // Invariant: for all i <= outer, if i < j then a[i] <= a[j] 
        }        
//        System.out.println(sortedData);

//        System.out.println(sortedData);

        System.out.println("Linear S swaps :   " + swaps);
        System.out.println("Linear S comparisons :   " + comparisons);

        return sortedData;
    }
    
    
    
}


