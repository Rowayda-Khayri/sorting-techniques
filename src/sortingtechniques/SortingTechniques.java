/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtechniques;

import data.*;
import java.util.*;

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
        
        int dataSize = 1500;
        
        //create int array to contain returned random data
        Integer[] randomData = new Integer[dataSize];
        randomData = dg.generateRandomData();
        
        
        
        //save randomData to file
        String fileName = "randomData";
        dg.SaveDataToFile(randomData , fileName);
        
        System.out.println(" randomData : " + Arrays.toString(randomData));
        
        //sort the random data
        Integer[] sortedData = new Integer[dataSize];
        sortedData = dg.sortData(randomData);
        
        
        System.out.println("randomData after sorting " + Arrays.toString(randomData));
        
        //save sortedData to file
        fileName = "sortedData";
        dg.SaveDataToFile(sortedData , fileName);
        
        //inversely sort the random data
        Integer[] inverselySortedData = new Integer[dataSize];
        inverselySortedData = dg.inverselySortData(randomData);
        
        //save inverselySortedData to file
        fileName = "inverselySortedData";
        dg.SaveDataToFile(inverselySortedData , fileName);
        
        
        
        //read random data from file 
        
        ArrayList<Integer> randomD =  new ArrayList<Integer>();
        
        ReadData read = new ReadData();
        
        fileName = "randomData";
        randomD = read.readData(fileName);
        
        System.out.println("randomD" + randomD);
        
        
        // sort random data with linear sort
        
        LinearSort l = new LinearSort();
        
        ArrayList<Integer> linearSortedD = new ArrayList<Integer>();
        
        linearSortedD = l.linearSort(randomD);
        
//        System.out.println(randomD); /************?????????? why is it changed to be sorted ??!! 
                                            //isn't java pass by copy ??!
        System.out.println("linearSortedD" + linearSortedD);
        
        // sort random data with bubble sort
        
        BubbleSort b = new BubbleSort();
        
        ArrayList<Integer> bubbleSortedD = new ArrayList<Integer>();
        
        bubbleSortedD = b.bubbleSort(randomD);
        
        System.out.println("bubbleSortedD" + bubbleSortedD);
        
        // sort random data with quick sort
        
        QuickSort q = new QuickSort();
        
        ArrayList<Integer> quickSortedD = new ArrayList<Integer>();
        
        System.out.println("randomD before q s "+ randomD );
        int low = 0;
        int high = randomD.size() -1 ;
        
        System.out.println("high :  " + high);
        
        quickSortedD = q.quickSort(randomD ,low, high); // low is the first element and high is the last element in the arraylist
        
        System.out.println("quickSortedD" + quickSortedD);
        
        
        
        
    }
    
}
