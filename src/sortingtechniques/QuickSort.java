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
    
    public ArrayList<Integer> quickSort(ArrayList<Integer> data , int low , int high){
        
        ArrayList<Integer> sortedData = new ArrayList<Integer>();
        
        if(low< high) {
            int pivotIndex = low; // Assume first element is the pivot
            int pivot = data.get(low);// The pivot value
            data.set(pivotIndex, data.get(high));// Swap pivot with last item
            data.set(high, pivot);
            int i = low - 1;
            int j = high;
            
            do {                
                do {i++;} while (data.get(i)< pivot);
                
                System.out.println("");
                do {j--;} while (data.get(j)> pivot);
                if (i < j) {
                    int temp = data.get(i);
                    data.set(i, data.get(j));
                    data.set(j, temp);
                    
                }
                
            } while (i < j);
            
            data.set(high, data.get(i));  // Put the pivot back in the middle
            data.set(i, pivot);
            
            quickSort(data, low, i - 1);// Recursive sort left list
            quickSort(data, i + 1 ,high);// Recursive sort right list
        }
        
        sortedData = data;
        
        return sortedData ; 
    }
    
    
    
    
}
