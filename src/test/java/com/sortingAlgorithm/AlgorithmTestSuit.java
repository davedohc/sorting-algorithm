package com.sortingAlgorithm;

import org.junit.*;

public class AlgorithmTestSuit {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testBubblesort() {
        //Given
        CreateArray myList = new CreateArray(100);
        Integer[] myArray = myList.getArray();
        int listSizeBeforeSorting = myArray.length;
        //When
        CreateArray.bubbleSort(myArray);
        int listSizeAfterSorting = myArray.length;
        System.out.println("Testing bubble sorting method on unsorted array");
        //Then
        Assert.assertTrue("Array after sorting is empty", listSizeAfterSorting != 0);
        Assert.assertTrue("Array after sorting has different elements quantity", listSizeBeforeSorting == listSizeAfterSorting);
        Assert.assertTrue("First element is not equal to 1", myArray[0] == 1);
        Assert.assertTrue("10th element is not equal to 10", myArray[9] == 10);
        Assert.assertTrue("21st element is not equal to 21", myArray[20] == 21);
        Assert.assertTrue("50th element is not equal to 21", myArray[49] == 50);
        Assert.assertTrue("99th element is not equal to 99", myArray[98] == 99);
    }
    @Test
    public void testInsertSort() {
        //Given
        CreateArray myList = new CreateArray(100);
        Integer[] myArray = myList.getArray();
        int listSizeBeforeSorting = myArray.length;
        //When
        CreateArray.insertSort(myArray);
        int listSizeAfterSorting = myArray.length;
        System.out.println("Testing insert sorting method on unsorted array");
        //Then
        Assert.assertTrue("Array after sorting is empty", listSizeAfterSorting != 0);
        Assert.assertTrue("Array after sorting has different elements quantity", listSizeBeforeSorting == listSizeAfterSorting);
        Assert.assertTrue("First element is not equal to 1", myArray[0] == 1);
        Assert.assertTrue("10th element is not equal to 10", myArray[9] == 10);
        Assert.assertTrue("21st element is not equal to 21", myArray[20] == 21);
        Assert.assertTrue("50th element is not equal to 21", myArray[49] == 50);
        Assert.assertTrue("99th element is not equal to 99", myArray[98] == 99);
    }
}
