package edu.epam.task4b.main;

import edu.epam.task4b.report.ResultsReport;
import edu.epam.task4b.service.ArrayService;
import edu.epam.task4b.variables.NumbersArray;

import java.io.IOException;

public class LogisticMain {
    public static void main(String[] args) throws IOException {
        NumbersArray numbersArray;
        ArrayService arrayService =  new ArrayService();
        numbersArray = new NumbersArray(arrayService.generateRandomArray(10));
        ResultsReport report = new ResultsReport();
        report.numbersArrayOut(numbersArray);
        NumbersArray numbersArray1 = new NumbersArray(arrayService.bubbleSortBySum(numbersArray.getNumbers()));
        report.numbersArrayOut(numbersArray1);
        NumbersArray numbersArray2 = new NumbersArray(arrayService.bubbleSortMax(numbersArray.getNumbers()));
        report.numbersArrayOut(numbersArray2);
        NumbersArray numbersArray3 = new NumbersArray(arrayService.bubbleSortMin(numbersArray.getNumbers()));
        report.numbersArrayOut(numbersArray3);
    }
}
