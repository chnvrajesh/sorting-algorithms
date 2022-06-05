package com.nvrviews.bubblesort;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        BubbleSortDemo bubbleSort = new BubbleSortDemo();
        int[] arr = {3,2,6,8,1,5,4,7};

        System.out.println(Arrays.toString(arr));
        System.out.println("Descending Order: " + Arrays.toString(bubbleSort.sort(arr, "DSC")));
        System.out.println("Ascending Order: " + Arrays.toString(bubbleSort.sort(arr, "ASC")));

        //Arrays.stream(bubbleSort.sort(arr)).forEach(System.out::print);
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
