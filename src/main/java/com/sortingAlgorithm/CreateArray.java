package com.sortingAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateArray {
    private Integer[] myArray;

    public CreateArray (int n) {
        myArray = new Integer[n];
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<n+1; i++) {
        list.add(i);
        }
        Collections.shuffle(list);
        myArray = list.toArray(new Integer[list.size()]);
    }
    public Integer[] getArray() {
        return myArray;
    }

    public static void insertSort(Integer[] array) {
        for(int i=0; i<array.length; i++) {
            int presentElem = array[i];
            int j = i;
            while(j > 0 && presentElem < array[j-1]) {
                array[j] = array[j-1];
                j=j-1;
            }
            array[j]=presentElem;
        }
    }

    public static void bubbleSort(Integer[] array) {
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length-1; j++) {
                int presentElem = array[j];
                int nextElem = array[j+1];
                if(array[j]>array[j+1]) {
                    array[j] = nextElem;
                    array[j+1] = presentElem;
                }
            }
        }
    }

    public static void displayArray(Integer[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
