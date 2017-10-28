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
        int dataRange = 9999;
        
        
        //create integer arraylist to contain returned random data
        ArrayList<Integer> randomData = new ArrayList<Integer>();
        
        //generate 1500 random numbers between 0 and 9999
        randomData = dg.generateRandomData(dataSize,dataRange);
        
        
        
        //save randomData to file
        String fileName = "randomData";
        dg.SaveDataToFile(randomData , fileName);
        
        System.out.println(" randomData : " + randomData);
        
        //sort the random data
        ArrayList<Integer> sortedData = new ArrayList<Integer>();
        sortedData = dg.sortData(randomData);
        
        
        System.out.println("randomData after sorting " + randomData);
        
        //save sortedData to file
        fileName = "sortedData";
        dg.SaveDataToFile(sortedData , fileName);
        
        //inversely sort the random data
        ArrayList<Integer> inverselySortedData = new ArrayList<Integer>();
        inverselySortedData = dg.inverselySortData(randomData);
        
        //save inverselySortedData to file
        fileName = "inverselySortedData";
        dg.SaveDataToFile(inverselySortedData , fileName);
        
        
        
        //read random data from file 
        
        int dataSizeToRead = 1500;
        ArrayList<Integer> randomD =  new ArrayList<Integer>();
        
        ReadData read = new ReadData();
        
        fileName = "randomData";
        randomD = read.readData(fileName , dataSizeToRead);
        
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
