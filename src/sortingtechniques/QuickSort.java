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
    
    public ArrayList<Integer> quickSort(ArrayList<Integer> data , int low , int high , int comparisons ,int swaps ){
        
        ArrayList<Integer> sortedData = new ArrayList<Integer>();
        
//        int comparisons =0 ;
//        int swaps = 0 ;
        
        if(low< high) {
            int pivotIndex = low; // Assume first element is the pivot
            int pivot = data.get(low);// The pivot value
            data.set(pivotIndex, data.get(high));// Swap pivot with last item
            swaps ++ ;
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
            
            quickSort(data, low, i - 1 , comparisons , swaps);// Recursive sort left list
            quickSort(data, i + 1 ,high ,comparisons , swaps);// Recursive sort right list
        }
        
        System.out.println("Quick S swaps :   " + swaps);
        System.out.println("Quick S comparisons :   " + comparisons);
        
        sortedData = data;
        
        return sortedData ; 
    }
    
    
    
    
}
