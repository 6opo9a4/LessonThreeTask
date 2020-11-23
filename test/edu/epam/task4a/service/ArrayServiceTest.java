package edu.epam.task4a.service;

import edu.epam.task4a.variables.NumbersArray;
import junit.framework.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ArrayServiceTest {
    @Test
    public void bubbleSortTest(){
        NumbersArray numbersArray = new NumbersArray(1,4,6,8,2,6);
        NumbersArray expectedArray = new NumbersArray(8,6,6,4,2,1);
        ArrayService arrayService = new ArrayService();
        NumbersArray actualArray = new NumbersArray(arrayService.bubbleSort(numbersArray.getNumbers()));
        Assert.assertEquals(expectedArray,actualArray);
    }

    @Test
    public void shuttleSortTest(){
        NumbersArray numbersArray = new NumbersArray(1,4,6,8,2,6);
        NumbersArray expectedArray = new NumbersArray(8,6,6,4,2,1);
        ArrayService arrayService = new ArrayService();
        NumbersArray actualArray = new NumbersArray(arrayService.shuttleSort(numbersArray.getNumbers()));
        Assert.assertEquals(expectedArray,actualArray);
    }

    @Test
    public void shellSortTest(){
        NumbersArray numbersArray = new NumbersArray(1,4,6,8,2,6);
        NumbersArray expectedArray = new NumbersArray(8,6,6,4,2,1);
        ArrayService arrayService = new ArrayService();
        NumbersArray actualArray = new NumbersArray(arrayService.shellSort(numbersArray.getNumbers()));
        Assert.assertEquals(expectedArray,actualArray);
    }

    @Test
    public void binarySearch(){
        NumbersArray numbersArray = new NumbersArray(1,4,6,8,2,6,12,0);
        int expectedNumber = 8;
        ArrayService arrayService = new ArrayService();
        int actualNumber = arrayService.binarySearch(numbersArray.getNumbers(),expectedNumber);
        Assert.assertEquals(expectedNumber,actualNumber);
    }

    @Test
    public void maxSearch(){
        NumbersArray numbersArray = new NumbersArray(1,4,6,8,2,6,12,0);
        int expectedNumber = 12;
        ArrayService arrayService = new ArrayService();
        int actualNumber = arrayService.maxSearch(numbersArray.getNumbers());
        Assert.assertEquals(expectedNumber,actualNumber);
    }

    @Test
    public void minSearch(){
        NumbersArray numbersArray = new NumbersArray(1,4,6,8,2,6,12,0);
        int expectedNumber = 0;
        ArrayService arrayService = new ArrayService();
        int actualNumber = arrayService.minSearch(numbersArray.getNumbers());
        Assert.assertEquals(expectedNumber,actualNumber);
    }
    @Test
    public void findPrime(){
        NumbersArray numbersArray = new NumbersArray(1,3,9,7,2,6,5,21,31);
        NumbersArray expectedArray = new NumbersArray(3,7,5,31);
        ArrayService arrayService = new ArrayService();
        NumbersArray actualArray = new NumbersArray(arrayService.isPrime(numbersArray.getNumbers()));
        Assert.assertEquals(expectedArray,actualArray);
    }

    @Test
    public void fibonacciNumbers(){
        NumbersArray numbersArray = new NumbersArray(1,3,9,7,2,6,5,21,31,8);
        NumbersArray expectedArray = new NumbersArray(1,3,2,5,21,8);
        ArrayService arrayService = new ArrayService();
        NumbersArray actualArray = new NumbersArray(arrayService.fibonacciNumbers(numbersArray.getNumbers()));
        Assert.assertEquals(expectedArray,actualArray);
    }

    @Test
    public void threeDigitWithoutRepeats(){
        NumbersArray numbersArray = new NumbersArray(100,3234,999,723,221,639,515,210,31,888);
        NumbersArray expectedArray = new NumbersArray(723,639,210);
        ArrayService arrayService = new ArrayService();
        NumbersArray actualArray = new NumbersArray(arrayService.threeDigitWithoutRepeats(numbersArray.getNumbers()));
        Assert.assertEquals(expectedArray,actualArray);
    }

    @Test
    public void writeReadFile() throws IOException {
        NumbersArray expectedArray = new NumbersArray(100,3234,998,723,221,639,515,210,31,888);
        ArrayService arrayService = new ArrayService();
        arrayService.writeToFile("numbers",expectedArray.getNumbers());
        NumbersArray actualArray = new NumbersArray(arrayService.readFromFile("numbers"));
        Assert.assertEquals(expectedArray,actualArray);
    }
}