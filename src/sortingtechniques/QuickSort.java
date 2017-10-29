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
public class QuickSort {
    
    int comparisons =0;
    int swaps  = 0 ;
    long runTime ;
    
    public ArrayList<Integer> quickSort(ArrayList<Integer> data , int low , int high ){
        
        ArrayList<Integer> sortedData = new ArrayList<Integer>();
        
        //start calculating sorting runtime
        long startTime = System.nanoTime();
        
        if(low< high) {
            int pivotIndex = low; // Assume first element is the pivot
            int pivot = data.get(low);// The pivot value
            data.set(pivotIndex, data.get(high));// Swap pivot with last item
//            swaps ++ ; //not real swap 
            data.set(high, pivot);
            int i = low - 1;
            int j = high;
            
            
            do {                
                do {i++;} while (data.get(i)< pivot);
                do {j--;} while (j>=0 && data.get(j)> pivot);
                comparisons ++ ;
                if (i < j) {
                    int temp = data.get(i);
                    data.set(i, data.get(j));
                    swaps ++ ;
                    data.set(j, temp);
                    swaps ++ ;
                }  
            } while (i < j);
            
            data.set(high, data.get(i));  // Put the pivot back in the middle
            swaps ++ ;
            data.set(i, pivot);
            swaps ++ ;
            
            quickSort(data, low, i - 1 );// Recursive sort left list
            quickSort(data, i + 1 ,high );// Recursive sort right list
        }
        
        //the end time of sorting 
        long endTime = System.nanoTime();
        
        runTime = (endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds.
        
        
        sortedData = data;
        
        return sortedData ; 
    }
    
    public void result (){
        
        System.out.println("Quick S swaps :   " + swaps);
        System.out.println("Quick S comparisons :   " + comparisons);
        
        System.out.println("Quick S runTime:   " + runTime);

    }
    
    
}
