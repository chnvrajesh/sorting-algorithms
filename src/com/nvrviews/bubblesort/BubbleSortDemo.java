package com.nvrviews.bubblesort;

/**
 *  1. This sorting will work by repeatedly swapping adjacent elements if they are in wrong order
 *  2. Ex: 4, 1, 3, 2
 *      a. 4, 1, 3, 2 => 1, 4, 3, 2
 *      b. 1, 4, 3, 2 => 1, 3, 4, 2
 *      c. 1, 3, 4, 2 => 1, 3, 2, 4
 *      d. 1, 3, 2, 4 => 1, 3, 2, 4
 *      e. 1, 3, 2, 4 => 1, 2, 3, 4
 *  3. Time complexity O(n2)
 */

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        BubbleSortDemo bubbleSort = new BubbleSortDemo();
        int[] arr = {3,2,6,8,1,5,4,7};

        System.out.println(Arrays.toString(arr));
        System.out.println("Descending Order: " + Arrays.toString(bubbleSort.sort(arr, "DSC")));
        System.out.println("Ascending Order: " + Arrays.toString(bubbleSort.sort(arr, "ASC")));
    }

    public int[] sort(int[] array, String order){
        int[] sortedArray = array;
        int tempSpace = 0;

        if(SortOrder.contains(order)){
            for(int i = 0; i< array.length-1; i++){
                for(int j = 0; j < (array.length - 1 - i); j++){
                    if(order.equalsIgnoreCase(SortOrder.ASC.toString())){
                        if(array[j] > array[j+1]){
                            tempSpace = array[j+1];
                            array[j+1] = array[j];
                            array[j] = tempSpace;
                        }
                    } else if (order.equalsIgnoreCase(SortOrder.DESC.toString())) {
                        if(array[j] < array[j+1]){
                            tempSpace = array[j+1];
                            array[j+1] = array[j];
                            array[j] = tempSpace;
                        }
                    }
                }
            }
        } else {
            System.out.println("Provided sort order is not correct");
            return null;
        }

        return sortedArray;
    }
}
