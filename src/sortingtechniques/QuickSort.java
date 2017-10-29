/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtechniques;

import java.util.ArrayList;

/**
 * Quick Sort Algorithm
 * @author row
 */
public class QuickSort {
    
    int comparisons =0;
    int swaps  = 0 ;
    long runTime ;
    
    
    /**
     * Sort the passed data with Quick Sort Algorithm
     * @author row
     * @return Object from Result class that contains run time (in milliseconds), # of comparisons and # of swaps
     */
    public Result quickSort(ArrayList<Integer> data , int low , int high ){
        
        ArrayList<Integer> sortedData = new ArrayList<Integer>();
        
        sortedData = data;
        
        //start calculating sorting runtime
        long startTime = System.nanoTime();
        
        if(low< high) {
            int pivotIndex = low; // Assume first element is the pivot
            int pivot = sortedData.get(low);// The pivot value
            sortedData.set(pivotIndex, sortedData.get(high));// Swap pivot with last item

            sortedData.set(high, pivot);
            int i = low - 1;
            int j = high;
            
            
            do {  
                comparisons ++ ;
                do {i++;comparisons ++ ;} while (sortedData.get(i)< pivot);
                do {j--;comparisons ++ ;} while (j>=0 && sortedData.get(j)> pivot);
                
                comparisons ++ ;
                if (i < j) {
                    int temp = sortedData.get(i);
                    data.set(i, sortedData.get(j));
                    swaps ++ ;
                    sortedData.set(j, temp);
                    swaps ++ ;
                }  
            } while (i < j);
            
            sortedData.set(high, sortedData.get(i));  // Put the pivot back in the middle
            swaps ++ ;
            sortedData.set(i, pivot);
            swaps ++ ;
            
            quickSort(sortedData, low, i - 1 );// Recursive sort left list
            quickSort(sortedData, i + 1 ,high );// Recursive sort right list
        }
        
        //the end time of sorting 
        long endTime = System.nanoTime();
        
        runTime = (endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds.
        
        
        
        // create Result instance to return all the required results
        
        Result result = new Result();
        
        result.comparisonsResult = comparisons;
        result.swapsResult = swaps;
        result.runTimeResult = runTime;
        result.sortedData = sortedData;
        
        return result;
        
    }
    
    public void result (){
        
        System.out.println("Quick S swaps :   " + swaps);
        System.out.println("Quick S comparisons :   " + comparisons);
        
        System.out.println("Quick S runTime:   " + runTime);

    }
    
    
}
