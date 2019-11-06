package com.sortingAlgorithm;

public class Sorting {
    public static void main(String[] args){
        CreateArray newList = new CreateArray(100);
        Integer[] myArray = newList.getArray();
        System.out.println(myArray[0]);


        CreateArray.displayArray(newList.getArray());
        System.out.println("");

        System.out.println(newList.getArray().length);
        CreateArray.bubbleSort(newList.getArray());
        CreateArray.displayArray(newList.getArray());
        System.out.println("");
        System.out.println(newList.getArray().length);

    }
}
