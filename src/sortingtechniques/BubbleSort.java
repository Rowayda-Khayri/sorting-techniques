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
        
        for(int pass = 0 ; pass< dataSize; pass++){
            
            for(int i = 0;i <dataSize -1; i++){
            
                if(data.get(i) > data.get( i + 1)){
                
                    int temp = data.get(i);
                    
                    data.set(i , data.get(i + 1));
                    data.set(i + 1, temp);
                    
                }
            }
        }
        
        return 
    }
    
    
    
    
    
}
