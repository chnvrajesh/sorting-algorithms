package com.nvrviews.selectionsort;

import com.nvrviews.bubblesort.SortOrder;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        SelectionSortDemo bubbleSort = new SelectionSortDemo();
        int[] arr = {3,2,6,8,1,5,4,7};

        System.out.println(Arrays.toString(arr));
        System.out.println("Descending Order: " + Arrays.toString(bubbleSort.sort(arr, "DESC")));
        System.out.println("Ascending Order: " + Arrays.toString(bubbleSort.sort(arr, "ASC")));
    }

    public int[] sort(int[] array, String order) {
        int[] sortedArray = array;
        int min_index = -1;
        int tempSpace = -1;

        if (SortOrder.contains(order)) {
            for (int i = 0; i < array.length -1; i++){
                min_index = i;

                for (int j = i+1; j < array.length; j++){
                    if(order.equalsIgnoreCase(SortOrder.ASC.toString())){
                        if(sortedArray[min_index] > sortedArray[j]){
                            min_index = j;
                        }
                    } else if (order.equalsIgnoreCase(SortOrder.DESC.toString())) {
                        if(sortedArray[min_index] < sortedArray[j]){
                            min_index = j;
                        }
                    }

                }
                tempSpace = sortedArray[min_index];
                sortedArray[min_index] = sortedArray[i];
                sortedArray[i] = tempSpace;
            }
        }

        return sortedArray;
    }
}
