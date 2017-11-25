/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtechniques;

import java.io.IOException;
import java.util.*;

/**
 *  Linear Sort Algorithm
 * @author row
 */
public class LinearSort {
    
    /**
     * Sort the passed data with Linear Sort Algorithm
     * @author row
     * @return Object from Result class that contains run time (in milliseconds), # of comparisons and # of swaps
     */
    public Result linearSort(ArrayList<Integer> data){
        
        
        int dataSize = data.size();
        ArrayList<Integer> sortedData = new ArrayList<Integer>();
        
        sortedData = data;
        
        ArrayList<Integer> Data2 = new ArrayList<Integer>();

        int outer, inner, min;
        
        int comparisons =0;
        
        int swaps = 0 ;
        
        //start calculating sorting runtime
        long startTime = System.nanoTime();
        
        for (outer = 0; outer < dataSize - 1; outer++) { // outer counts down 
        
        min = outer;
        
        for(inner = outer + 1; inner < dataSize; inner++){
        
        comparisons ++;
        
        if(sortedData.get(inner) < sortedData.get(min)){
        
        min = inner;
        
        // Invariant: for all i, if outer <= i <= inner, then a[min] <= a[i]  
        
        // if value(outer) != value(min)  
        int temp = sortedData.get(outer);

        sortedData.set(outer, sortedData.get(min));
        swaps++;
        
        sortedData.set(min, temp);
        }
        
        }
        // a[min] is least among a[outer]..a[a.length - 1] 
       
      
        
    //    swaps++;
        
        // Invariant: for all i <= outer, if i < j then a[i] <= a[j] 
        }  
        //the end time of sorting 
        long endTime = System.nanoTime();
        
        long runTime = (endTime - startTime) ;  //divide by 1000000 to get milliseconds.
        

        // create Result instance to return all the required results
        
        Result result = new Result();
        
        result.comparisonsResult = comparisons;
        result.swapsResult = swaps;
        result.runTimeResult = runTime;
        result.sortedData = sortedData;
        
        return result;
        
    }
    
    
    
}


