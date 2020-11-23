package edu.epam.task4b.service;

import com.sun.source.tree.PackageTree;
import edu.epam.task4b.service.ArrayService;
import edu.epam.task4b.variables.NumbersArray;
import junit.framework.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayServiceTest {

    @Test
    public void testBubbleSortBySumToMin() {
        int[][] startArray = {{1,2,3,4,5,6,7}, {169,120,150}, {12,23,67,32,76}};
        int[][] expected = {{169,120,150}, {12,23,67,32,76}, {1,2,3,4,5,6,7}};
        NumbersArray expectedArray = new NumbersArray(expected);
        ArrayService arrayService = new ArrayService();
        int[][] actual = arrayService.bubbleSortBySum(startArray);
        NumbersArray actualArray = new NumbersArray(actual);
        Assert.assertEquals(expectedArray,actualArray);
    }
    @Test
    public void testBubbleSortBySumToMax() {
        int[][] startArray = {{1,2,3,4,5,6,7}, {169,120,150}, {12,23,67,32,76}};
        int[][] expected = { {1,2,3,4,5,6,7}, {12,23,67,32,76},{169,120,150}};
        NumbersArray expectedArray = new NumbersArray(expected);
        ArrayService arrayService = new ArrayService();
        int[][] firstSort = arrayService.bubbleSortBySum(startArray);
        int[][] actual = arrayService.bubbleSortBySum(firstSort);
        NumbersArray actualArray = new NumbersArray(actual);
        Assert.assertEquals(expectedArray,actualArray);
    }

    @Test
    public void testBubbleSortMaxElement() {
        int[][] startArray = {{1,2,3,4,5,6,7}, {169,120,150}, {12,23,67,32,76}};
        int[][] expected = { {1,2,3,4,5,6,7}, {12,23,67,32,76},{169,120,150}};
        NumbersArray expectedArray = new NumbersArray(expected);
        ArrayService arrayService = new ArrayService();
        int[][] firstSort = arrayService.bubbleSortMax(startArray);
        int[][] actual = arrayService.bubbleSortMax(firstSort);
        NumbersArray actualArray = new NumbersArray(actual);
        Assert.assertEquals(expectedArray,actualArray);
    }

    @Test
    public void testBubbleSortMinElement() {
        int[][] startArray = {{1,2,3,4,5,6,7}, {169,120,150}, {12,23,67,32,76}};
        int[][] expected = { {1,2,3,4,5,6,7}, {12,23,67,32,76},{169,120,150}};
        NumbersArray expectedArray = new NumbersArray(expected);
        ArrayService arrayService = new ArrayService();
        int[][] firstSort = arrayService.bubbleSortMin(startArray);
        int[][] actual = arrayService.bubbleSortMin(firstSort);
        NumbersArray actualArray = new NumbersArray(actual);
        Assert.assertEquals(expectedArray,actualArray);
    }
}