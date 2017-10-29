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
        
        
        /*==================================*/
        /*Generate Data And Save It To Files*/
        /*==================================*/
        
        //define different dataSizes to be read from files to use on comparison
                                
        int dataSize_1 = 1500;
        int dataSize_2 = 1000;
        int dataSize_3 = 500;
        
        
        //create object to use methods in DataGenerator class 
        DataGenerator dg = new DataGenerator();
        
        int dataSize = dataSize_1;
        int dataRange = 9999;
        
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
        
        ReadData read = new ReadData(); // to access methods in ReadData class
        
        
        //read  the first size of random data from file 
        
        ArrayList<Integer> randomData_Size_1 =  new ArrayList<Integer>();
        
        randomData_Size_1 = read.readData("randomData" , dataSize_1); // read this size from this file
        
        //read  the second size of random data from file 
        
        ArrayList<Integer> randomData_Size_2 =  new ArrayList<Integer>();
        
        randomData_Size_2 = read.readData("randomData" , dataSize_2); // read this size from this file
        
        //read  the third size of random data from file 
        
        ArrayList<Integer> randomData_Size_3 =  new ArrayList<Integer>();
        
        randomData_Size_3 = read.readData("randomData" , dataSize_3); // read this size from this file
        
        /*******************************************************************************/
        //read  the first size of sorted data from file 
        
        ArrayList<Integer> sortedData_Size_1=  new ArrayList<Integer>();
        
        sortedData_Size_1 = read.readData("sortedData" , dataSize_1); // read this size from this file
        
        //read  the second size of sorted data from file
        
        ArrayList<Integer> sortedData_Size_2=  new ArrayList<Integer>();
        
        sortedData_Size_2 = read.readData("sortedData" , dataSize_2); // read this size from this file
        
        //read  the third size of sorted data from file
        
        ArrayList<Integer> sortedData_Size_3=  new ArrayList<Integer>();
        
        sortedData_Size_3 = read.readData("sortedData" , dataSize_3); // read this size from this file
        
        /********************************************************************************/
        //read the first size of inversely sorted data from file 
        
        ArrayList<Integer> inverselySortedData_Size_1 =  new ArrayList<Integer>();
        
        inverselySortedData_Size_1 = read.readData("inverselySortedData" , dataSize_1); // read this size from this file
        
        //read the second size of inversely sorted data from file 
        
        ArrayList<Integer> inverselySortedData_Size_2 =  new ArrayList<Integer>();
        
        inverselySortedData_Size_2 = read.readData("inverselySortedData" , dataSize_2); // read this size from this file
        
        //read the third size of inversely sorted data from file 
        
        ArrayList<Integer> inverselySortedData_Size_3 =  new ArrayList<Integer>();
        
        inverselySortedData_Size_3 = read.readData("inverselySortedData" , dataSize_3); // read this size from this file
        
        
                                /*===========*/
                                /* Sort Data */
                                /*===========*/
        
                            /*==========================*/
                            /*Sort Data with Linear Sort*/
                            /*==========================*/
        
        LinearSort l = new LinearSort(); // to access methods in LinearSort class

        /*=============*/
        /* Random Data */
        /*=============*/
        
        // sort the first size of random data with linear sort

        Result linearSortedData_Random_Size_1 = new Result(); // to hold all results returned from the sorting method
        
        linearSortedData_Random_Size_1 = l.linearSort(randomData_Size_1); //call linearSorting method
        
        // sort the second size of random data with linear sort

        Result linearSortedData_Random_Size_2 = new Result(); // to hold all results returned from the sorting method
        
        linearSortedData_Random_Size_2 = l.linearSort(randomData_Size_2); //call linearSorting method
        
        // sort the third size of random data with linear sort

        Result linearSortedData_Random_Size_3 = new Result(); // to hold all results returned from the sorting method
        
        linearSortedData_Random_Size_3 = l.linearSort(randomData_Size_3); //call linearSorting method
        
        
        /*=============*/
        /* Sorted Data */
        /*=============*/
        
        
        // sort the first size of sorted data with linear sort

        Result linearSortedData_Sorted_Size_1 = new Result(); // to hold all results returned from the sorting method
        
        linearSortedData_Sorted_Size_1 = l.linearSort(sortedData_Size_1); //call linearSorting method
        
        // sort the second size of sorted data with linear sort

        Result linearSortedData_Sorted_Size_2 = new Result(); // to hold all results returned from the sorting method
        
        linearSortedData_Sorted_Size_2 = l.linearSort(sortedData_Size_2); //call linearSorting method
        
        // sort the third size of sorted data with linear sort

        Result linearSortedData_Sorted_Size_3 = new Result(); // to hold all results returned from the sorting method
        
        linearSortedData_Sorted_Size_3 = l.linearSort(sortedData_Size_3); //call linearSorting method
        
        
        /************************************************************************************************/
//        System.out.println("randomData_Size_1 after linear sort " + randomData_Size_1); /*****??????? why is it changed to be sorted ??!! **/
//                                            //isn't java pass by copy ??!
        /************************************************************************************************/
        
        System.out.println("linearSort sorted data : " + linearSortedData_Random_Size_1.sortedData);
        System.out.println("linearSort run time : " + linearSortedData_Random_Size_1.runTimeResult);
        System.out.println("linearSort comparisons : " + linearSortedData_Random_Size_1.comparisonsResult);
        System.out.println("linearSort swaps : " + linearSortedData_Random_Size_1.swapsResult);
       
        
        /*=======================*/
        /* Inversely Sorted Data */
        /*=======================*/
        
        // sort the first size of inversely sorted data with linear sort

        Result linearSortedData_InverselySorted_Size_1 = new Result(); // to hold all results returned from the sorting method
        
        linearSortedData_InverselySorted_Size_1 = l.linearSort(inverselySortedData_Size_1); //call linearSorting method
        
        // sort the second size of inversely sorted data with linear sort

        Result linearSortedData_InverselySorted_Size_2 = new Result(); // to hold all results returned from the sorting method
        
        linearSortedData_InverselySorted_Size_2 = l.linearSort(inverselySortedData_Size_2); //call linearSorting method
        
        // sort the third size of inversely sorted data with linear sort

        Result linearSortedData_InverselySorted_Size_3 = new Result(); // to hold all results returned from the sorting method
        
        linearSortedData_InverselySorted_Size_3 = l.linearSort(inverselySortedData_Size_3); //call linearSorting method
        
        
        /************************************************************************************************/
//        System.out.println("randomData_Size_1 after linear sort " + randomData_Size_1); /*****??????? why is it changed to be sorted ??!! **/
//                                            //isn't java pass by copy ??!
        /************************************************************************************************/
        
        System.out.println("linearSort sorted data : " + linearSortedData_Random_Size_1.sortedData);
        System.out.println("linearSort run time : " + linearSortedData_Random_Size_1.runTimeResult);
        System.out.println("linearSort comparisons : " + linearSortedData_Random_Size_1.comparisonsResult);
        System.out.println("linearSort swaps : " + linearSortedData_Random_Size_1.swapsResult);
       
        /*===============================================================================*/
        /*===============================================================================*/
        
        /*******************************************************************************************************/
        /*read random data from file  to overwrite the old data in randomData_Size_1 that's sorted now for unknown reason*/ 
        /*******************************************************************************************************/
        
        //read  the first size of random data from file 
        randomData_Size_1 = read.readData("randomData" , dataSize_1); // read this size from this file
        
        //read  the second size of random data from file 
        randomData_Size_2 = read.readData("randomData" , dataSize_2); // read this size from this file
        
        //read  the third size of random data from file 
        randomData_Size_3 = read.readData("randomData" , dataSize_3); // read this size from this file
        
        /*==============================================================================*/
        /*==============================================================================*/
        
                                /*==========================*/
                                /*Sort Data with Bubble Sort*/
                                /*==========================*/
        
        BubbleSort b = new BubbleSort(); // to access methods in BubbleSort class
        
        /*=============*/
        /* Random Data */
        /*=============*/
        
        // sort the first size of random data with bubble sort
        
        Result bubbleSortedData_Random_Size_1 = new Result(); // to hold all results returned from the sorting method
        
        bubbleSortedData_Random_Size_1 = b.bubbleSort(randomData_Size_1); //call bubbleSorting method
        
        // sort the second size of random data with bubble sort
        
        Result bubbleSortedData_Random_Size_2 = new Result(); // to hold all results returned from the sorting method
        
        bubbleSortedData_Random_Size_2 = b.bubbleSort(randomData_Size_2); //call bubbleSorting method
        
        // sort the third size of random data with bubble sort
        
        Result bubbleSortedData_Random_Size_3 = new Result(); // to hold all results returned from the sorting method
        
        bubbleSortedData_Random_Size_3 = b.bubbleSort(randomData_Size_3); //call bubbleSorting method
        
        /*=============*/
        /* Sorted Data */
        /*=============*/
        
        // sort the first size of Sorted data with bubble sort
        
        Result bubbleSortedData_Sorted_Size_1 = new Result(); // to hold all results returned from the sorting method
        
        bubbleSortedData_Sorted_Size_1 = b.bubbleSort(sortedData_Size_1); //call bubbleSorting method
        
        // sort the second size of Sorted data with bubble sort
        
        Result bubbleSortedData_Sorted_Size_2 = new Result(); // to hold all results returned from the sorting method
        
        bubbleSortedData_Sorted_Size_2 = b.bubbleSort(sortedData_Size_2); //call bubbleSorting method
        
        // sort the third size of Sorted data with bubble sort
        
        Result bubbleSortedData_Sorted_Size_3 = new Result(); // to hold all results returned from the sorting method
        
        bubbleSortedData_Sorted_Size_3 = b.bubbleSort(sortedData_Size_3); //call bubbleSorting method
        
        /*=======================*/
        /* Inversely Sorted Data */
        /*=======================*/
        
        // sort the first size of InverselySorted data with bubble sort
        
        Result bubbleSortedData_InverselySorted_Size_1 = new Result(); // to hold all results returned from the sorting method
        
        bubbleSortedData_InverselySorted_Size_1 = b.bubbleSort(inverselySortedData_Size_1); //call bubbleSorting method
        
        // sort the second size of Inversely Sorted data with bubble sort
        
        Result bubbleSortedData_InverselySorted_Size_2 = new Result(); // to hold all results returned from the sorting method
        
        bubbleSortedData_InverselySorted_Size_2 = b.bubbleSort(inverselySortedData_Size_2); //call bubbleSorting method
        
        // sort the third size of Inversely Sorted data with bubble sort
        
        Result bubbleSortedData_InverselySorted_Size_3 = new Result(); // to hold all results returned from the sorting method
        
        bubbleSortedData_InverselySorted_Size_3 = b.bubbleSort(inverselySortedData_Size_3); //call bubbleSorting method
        
        
        System.out.println("bubbleSort sorted data : " + bubbleSortedData_Random_Size_1.sortedData);
        System.out.println("bubbleSort run time : " + bubbleSortedData_Random_Size_1.runTimeResult);
        System.out.println("bubbleSort comparisons : " + bubbleSortedData_Random_Size_1.comparisonsResult);
        System.out.println("bubbleSort swaps : " + bubbleSortedData_Random_Size_1.swapsResult);
        
        /*===============================================================================*/
        /*===============================================================================*/
        
        /*******************************************************************************************************/
        /*read random data from file  to overwrite the old data in randomData_Size_1 that's sorted now for unknown reason*/ 
        /*******************************************************************************************************/
        
        //read  the first size of random data from file 
        randomData_Size_1 = read.readData("randomData" , dataSize_1); // read this size from this file
        
        //read  the second size of random data from file 
        randomData_Size_2 = read.readData("randomData" , dataSize_2); // read this size from this file
        
        //read  the third size of random data from file 
        randomData_Size_3 = read.readData("randomData" , dataSize_3); // read this size from this file
        
        /*==============================================================================*/
        /*==============================================================================*/
        
        
                            /*=========================*/
                            /*Sort Data with Quick Sort*/
                            /*=========================*/
                            
        QuickSort q = new QuickSort(); // to access methods in QuickSort class
        int low = 0; // to use with all data ( random , sorted and inversely sorted )
        
        /*=============*/
        /* Random Data */
        /*=============*/
        
        // sort the first size of random data with quick sort
        
        Result quickSortedData_Random_Size_1 = new Result(); // to hold all results returned from the sorting method
        int high = randomData_Size_1.size() -1 ; //get the last element's index in the arraylist
        
        // call quickSort method
        quickSortedData_Random_Size_1 = q.quickSort(randomData_Size_1 ,low, high); // low is the first element's index and high is the last element's index in the arraylist
        
        /***********************************************************************************/
        
        // sort the second size of random data with quick sort
        
        Result quickSortedData_Random_Size_2 = new Result(); // to hold all results returned from the sorting method
        high = randomData_Size_2.size() -1 ; //get the last element's index in the arraylist
        
        // call quickSort method
        quickSortedData_Random_Size_2 = q.quickSort(randomData_Size_2 ,low, high); // low is the first element's index and high is the last element's index in the arraylist
        
        /************************************************************************************/
        
        // sort the third size of random data with quick sort
        
        Result quickSortedData_Random_Size_3  = new Result(); // to hold all results returned from the sorting method
        high = randomData_Size_3.size() -1 ; //get the last element's index in the arraylist
        
        // call quickSort method
        quickSortedData_Random_Size_3 = q.quickSort(randomData_Size_3 ,low, high); // low is the first element's index and high is the last element's index in the arraylist
        
        /*=============*/
        /* Sorted Data */
        /*=============*/
        
        // sort the first size of sorted data with quick sort
        
        Result quickSortedData_Sorted_Size_1 = new Result(); // to hold all results returned from the sorting method
        high = sortedData_Size_1.size() -1 ; //get the last element's index in the arraylist
        
        // call quickSort method
        quickSortedData_Sorted_Size_1 = q.quickSort(sortedData_Size_1 ,low, high); // low is the first element's index and high is the last element's index in the arraylist
        
        /***********************************************************************************/
        
        // sort the second size of sorted data with quick sort
        
        Result quickSortedData_Sorted_Size_2 = new Result(); // to hold all results returned from the sorting method
        high = sortedData_Size_2.size() -1 ; //get the last element's index in the arraylist
        
        // call quickSort method
        quickSortedData_Sorted_Size_2 = q.quickSort(sortedData_Size_2 ,low, high); // low is the first element's index and high is the last element's index in the arraylist
        
        /************************************************************************************/
        
        // sort the third size of sorted data with quick sort
        
        Result quickSortedData_Sorted_Size_3  = new Result(); // to hold all results returned from the sorting method
        high = sortedData_Size_3.size() -1 ; //get the last element's index in the arraylist
        
        // call quickSort method
        quickSortedData_Sorted_Size_3 = q.quickSort(sortedData_Size_3 ,low, high); // low is the first element's index and high is the last element's index in the arraylist
        
        
        /*=======================*/
        /* Inversely Sorted Data */
        /*=======================*/
        
        // sort the first size of inversely sorted data with quick sort
        
        Result quickSortedData_InverselySorted_Size_1 = new Result(); // to hold all results returned from the sorting method
        high = inverselySortedData_Size_1.size() -1 ; //get the last element's index in the arraylist
        
        // call quickSort method
        quickSortedData_InverselySorted_Size_1 = q.quickSort(inverselySortedData_Size_1,low, high); // low is the first element's index and high is the last element's index in the arraylist
        
        /***********************************************************************************/
        
        // sort the second size of inversely sorted data with quick sort
        
        Result quickSortedData_InverselySorted_Size_2 = new Result(); // to hold all results returned from the sorting method
        high = inverselySortedData_Size_2.size() -1 ; //get the last element's index in the arraylist
        
        // call quickSort method
        quickSortedData_InverselySorted_Size_2 = q.quickSort(inverselySortedData_Size_2 ,low, high); // low is the first element's index and high is the last element's index in the arraylist
        
        /************************************************************************************/
        
        // sort the third size of inversely sorted data with quick sort
        
        Result quickSortedData_InverselySorted_Size_3  = new Result(); // to hold all results returned from the sorting method
        high = inverselySortedData_Size_3.size() -1 ; //get the last element's index in the arraylist
        
        // call quickSort method
        quickSortedData_InverselySorted_Size_3 = q.quickSort(inverselySortedData_Size_3 ,low, high); // low is the first element's index and high is the last element's index in the arraylist
        
        
        System.out.println("quickSort sorted Data : " + quickSortedData_Random_Size_1.sortedData);
        System.out.println("quickSort run time : " + quickSortedData_Random_Size_1.runTimeResult);
        System.out.println("quickSort comparisons : " + quickSortedData_Random_Size_1.runTimeResult);
        System.out.println("quickSort swaps : " + quickSortedData_Random_Size_1.swapsResult);
        
        
    }
    
}
