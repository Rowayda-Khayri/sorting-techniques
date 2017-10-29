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
        
        //create object to use methods in class 
        DataGenerator dg = new DataGenerator();
        
        int dataSize = 1500;
        int dataRange = 9999;
        
        /*==================================*/
        /*Generate Data And Save It To Files*/
        /*==================================*/
        
        //create integer arraylist to contain returned random data
        ArrayList<Integer> randomData = new ArrayList<Integer>();
        
        //generate 1500 random numbers between 0 and 9999
        randomData = dg.generateRandomData(dataSize,dataRange);
        
        //save randomData to file
        String fileName = "randomData";
        dg.SaveDataToFile(randomData , fileName);
        
        //sort the random data
        ArrayList<Integer> sortedData = new ArrayList<Integer>();
        sortedData = dg.sortData(randomData);
        
        
        //save sortedData to file
        fileName = "sortedData";
        dg.SaveDataToFile(sortedData , fileName);
        
        //inversely sort the random data
        ArrayList<Integer> inverselySortedData = new ArrayList<Integer>();
        inverselySortedData = dg.inverselySortData(randomData);
        
        //save inverselySortedData to file
        fileName = "inverselySortedData";
        dg.SaveDataToFile(inverselySortedData , fileName);
        
        /*====================*/
        /*Read Data From Files*/
        /*====================*/
        
        //read random data from file 
        
        int dataSizeToRead = 1500;
        ArrayList<Integer> randomD =  new ArrayList<Integer>();
        
        ReadData read = new ReadData();
        
        fileName = "randomData";
        randomD = read.readData(fileName , dataSizeToRead);
        
        //read sorted data from file 
        
        //read inversely sorted data from file 
        
        
        /*==========================*/
        /*Sort Data with Linear Sort*/
        /*==========================*/
        
        // sort random data with linear sort
        
        LinearSort l = new LinearSort(); // to access methods in LinearSort class
        
        Result linearSortedD = new Result(); // to hold all results returned from the sorting method
        
        linearSortedD = l.linearSort(randomD); //call linearSorting method
        
//        System.out.println("randomD after linear sort " + randomD); /*****??????? why is it changed to be sorted ??!! **/
//                                            //isn't java pass by copy ??!

        System.out.println("linearSort sorted data : " + linearSortedD.sortedData);
        System.out.println("linearSort run time : " + linearSortedD.runTimeResult);
        System.out.println("linearSort comparisons : " + linearSortedD.comparisonsResult);
        System.out.println("linearSort swaps : " + linearSortedD.swapsResult);
       
        /*******************************************************************************************************/
        /*read random data from file  to overwrite the old data in randomD that's sorted now for unknown reason*/ 
        /*******************************************************************************************************/
        
        dataSizeToRead = 1500;
        fileName = "randomData";
        randomD = read.readData(fileName , dataSizeToRead);
        
        
        /*==========================*/
        /*Sort Data with Bubble Sort*/
        /*==========================*/
        
        
        // sort random data with bubble sort
        
        BubbleSort b = new BubbleSort(); // to access methods in LinearSort class
        
        Result bubbleSortedD = new Result(); // to hold all results returned from the sorting method
        
        bubbleSortedD = b.bubbleSort(randomD); //call bubbleSorting method
        
        System.out.println("bubbleSort sorted data : " + bubbleSortedD.sortedData);
        System.out.println("bubbleSort run time : " + bubbleSortedD.runTimeResult);
        System.out.println("bubbleSort comparisons : " + bubbleSortedD.comparisonsResult);
        System.out.println("bubbleSort swaps : " + bubbleSortedD.swapsResult);
        
        /*******************************************************************************************************/
        /*read random data from file  to overwrite the old data in randomD that's sorted now for unknown reason*/ 
        /*******************************************************************************************************/
        
        dataSizeToRead = 1500;
        fileName = "randomData";
        randomD = read.readData(fileName , dataSizeToRead);
        
        
        /*=========================*/
        /*Sort Data with Quick Sort*/
        /*=========================*/
        
        // sort random data with quick sort
        
        QuickSort q = new QuickSort(); // to access methods in LinearSort class
        
        Result quickSortedD = new Result(); // to hold all results returned from the sorting method
        
        int low = 0;
        int high = randomD.size() -1 ; //get the last element's index in the arraylist
        
        // call quickSort method
        quickSortedD = q.quickSort(randomD ,low, high); // low is the first element's index and high is the last element's index in the arraylist
        
        
        System.out.println("quickSort sorted Data : " + quickSortedD.sortedData);
        System.out.println("quickSort run time : " + quickSortedD.runTimeResult);
        System.out.println("quickSort comparisons : " + quickSortedD.runTimeResult);
        System.out.println("quickSort swaps : " + quickSortedD.swapsResult);
        
        
    }
    
}
