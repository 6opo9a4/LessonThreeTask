package edu.epam.task4a.service;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayService {

    public int[] bubbleSort(int[] numbers){
        if(numbers.length<2) {
            throw new IllegalArgumentException("you must add more numbers to sort");
        }
        else {
            int number1 = numbers[0];
            int number2 = numbers[1];
            boolean needIteration = true;
            if(number1<number2) {
                while (needIteration) {
                    needIteration = false;
                    for (int i = 1; i < numbers.length; i++) {
                        number1 = numbers[i];
                        number2 = numbers[i - 1];
                        if (number1 > number2) {
                            int tmp = number1;
                            numbers[i] = number2;
                            numbers[i-1] = tmp;
                            needIteration = true;
                        }
                    }
                }
            }
            else{
                while (needIteration) {
                    needIteration = false;
                    for (int i = 1; i < numbers.length; i++) {
                        number1 = numbers[i];
                        number2 = numbers[i - 1];
                        if (number1 < number2) {
                            int tmp = number1;
                            numbers[i] = number2;
                            numbers[i-1] = tmp;
                            needIteration = true;
                        }
                    }
                }
            }
            return numbers;
        }
    }

    public int[] shuttleSort(int[] numbers){
        if(numbers.length<2) {
            throw new IllegalArgumentException("you must add more numbers to sort");
        }
        else {
            int number1 = numbers[0];
            int numbre2 = numbers[1];
            if(number1 < numbre2) {
                for (int i = 1; i < numbers.length; i++) {
                    number1 = numbers[i];
                    numbre2 = numbers[i - 1];
                    if (number1 > numbre2) {
                        int tmp = number1;
                        numbers[i] = numbre2;
                        numbers[i-1] = tmp;
                        for (int z = i - 1; (z - 1) >= 0; z--) {
                            number1 = numbers[z];
                            numbre2 = numbers[z - 1];
                            if (number1 > numbre2) {
                                tmp = number1;
                                numbers[z] = numbre2;
                                numbers[z-1] = tmp;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            else{
                for (int i = 1; i < numbers.length; i++) {
                    number1 = numbers[i];
                    numbre2 = numbers[i - 1];
                    if (number1 < numbre2) {
                        int tmp = number1;
                        numbers[i] = numbre2;
                        numbers[i-1] = tmp;
                        for (int z = i - 1; (z - 1) >= 0; z--) {
                            number1 = numbers[z];
                            numbre2 = numbers[z - 1];
                            if (number1 < numbre2) {
                                tmp = number1;
                                numbers[z] = numbre2;
                                numbers[z-1] = tmp;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            return numbers;
        }
    }
    public int[] shellSort(int[] numbers){
        if(numbers.length<2) {
            throw new IllegalArgumentException("you must add more numbers to sort");
        }
        else {
            int number1= numbers[0];
            int number2 = numbers[1];
            if(number1 > number2) {
                int gap = numbers.length / 2;
                while (gap >= 1) {
                    for (int right = 0; right < numbers.length; right++) {
                        for (int c = right - gap; c >= 0; c -= gap) {
                            number1 = numbers[c];
                            number2 = numbers[c+gap];
                            if (numbers[c] > numbers[c + gap]) {
                                int tmp = number1;
                                numbers[c] = number2;
                                numbers[c+gap] = tmp;
                            }
                        }
                    }
                    gap = gap / 2;
                }
            }
            else{
                int gap = numbers.length / 2;
                while (gap >= 1) {
                    for (int right = 0; right < numbers.length; right++) {
                        for (int c = right - gap; c >= 0; c -= gap) {
                            number1 = numbers[c];
                            number2 = numbers[c+gap];
                            if (numbers[c] < numbers[c + gap]) {
                                int tmp = number1;
                                numbers[c] = number2;
                                numbers[c+gap] = tmp;
                            }
                        }
                    }
                    gap = gap / 2;
                }
            }
            return numbers;
        }
    }

    public int binarySearch(int numbers[], int elementToSearch) {
        int firstPoint = 0;
        int lastPoint = numbers.length - 1;
        while(firstPoint <= lastPoint) {
            int middlePoint = (firstPoint + lastPoint) / 2;
            if (numbers[middlePoint] == elementToSearch) {
                return numbers[middlePoint];
            }
            if (numbers[middlePoint] < elementToSearch){
                firstPoint = middlePoint + 1;
            }
            if (numbers[middlePoint] > elementToSearch){
                lastPoint = middlePoint - 1;
            }
        }
        throw new IllegalArgumentException("No such element in array");
    }

    public int minSearch(int[] numbers){
        int min;
        if(numbers.length == 0){
            throw new IllegalArgumentException("Your array is empty");
        }
        else {
            min = numbers[0];
            for (int i = 0;i<numbers.length;i++)
            {
                if(min>numbers[i]){
                    min = numbers[i];
                }
            }
        }
        return min;
    }

    public int maxSearch(int[] numbers){
        int max;
        if(numbers.length == 0){
            throw new IllegalArgumentException("Your array is empty");
        }
        else {
            max = numbers[0];
            for (int i = 0;i<numbers.length;i++)
            {
                if(max<numbers[i]){
                    max = numbers[i];
                }
            }
        }
        return max;
    }

    public int[] isPrime(int[] numbers) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        if(numbers.length == 0){
            throw new IllegalArgumentException("Your array is empty");
        }
        else {
            for(int z = 0;z<numbers.length;z++)
            {
                if (numbers[z]%2!=0){
                    for(int i=3;i<=numbers[z];i+=2) {
                        if (numbers[z] % i != 0 || numbers[z] == i) {
                            primeNumbers.add(numbers[z]);
                        }
                        break;
                    }
                }
            }
        }
        int[] primeResult = fromArray(primeNumbers);
        return primeResult;
    }

    public int[] fibonacciNumbers(int[] numbers){
        if(numbers.length == 0){
            throw new IllegalArgumentException("Your array is empty");
        }
        int maxElement = maxSearch(numbers);
        ArrayList<Integer> fibonacci =  new ArrayList<>();
        ArrayList<Integer> fibonacciFromNumbers = new ArrayList<>();
        int n0 = 1;
        int n1 = 1;
        int n2=1;
        fibonacci.add(n0);
        do{
            n2=n0+n1;
            fibonacci.add(n2);
            n0=n1;
            n1=n2;
        } while (n2<maxElement);
        for (int i=0;i<numbers.length;i++){
            for(int z = 0;z<fibonacci.size();z++){
                if(numbers[i]==fibonacci.get(z)){
                    fibonacciFromNumbers.add(numbers[i]);
                }
            }
        }
        int[] fibonacciResult = fromArray(fibonacciFromNumbers);
        return fibonacciResult;
    }

    public int[] threeDigitWithoutRepeats(int[] numbers){
        if(numbers.length == 0){
            throw new IllegalArgumentException("Your array is empty");
        }
        ArrayList<Integer> resultList =  new ArrayList<>();
        int[] result;
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]/100>0 && numbers[i]/100<10){
                String number = Integer.toString(numbers[i]);
                char[] digitsOfNumber = number.toCharArray();
                if(digitsOfNumber[0]!=digitsOfNumber[1] && digitsOfNumber[0]!=digitsOfNumber[2] && digitsOfNumber[1]!=digitsOfNumber[2]){
                    resultList.add(numbers[i]);
                }
            }
        }
        result = fromArray(resultList);
        return result;
    }

    public int[] generateRandomArray(){
        int size = (int) ( Math.random() * 101);
        int[] generatedArray = new int[size];
        for (int i = 0;i<size;i++){
            int number = (int) ( Math.random() * 10000);
            generatedArray[i] = number;
        }
        return generatedArray;
    }

    public int[] takeArrayFromKeyboard(){
        int[] tookArray;
        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        tookArray =new int[in.nextInt()];
        for (int element : tookArray)
        {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            tookArray[i] = in.nextInt();
            System.out.println(tookArray[i] + ";");
            i++;
        }
        return tookArray;
    }

    public void writeToFile (String filename,int[] numbers) throws IOException {
        BufferedWriter outputWriter;
        outputWriter = new BufferedWriter(new FileWriter(filename+".txt"));
        outputWriter.write("");
        for (int i = 0; i < numbers.length; i++) {
            outputWriter.write(Integer.toString(numbers[i]));
            outputWriter.newLine();
        }
        outputWriter.flush();
        outputWriter.close();
    }

    public int[] readFromFile(String filename) throws FileNotFoundException {
        Scanner s = new Scanner(new File(filename + ".txt"));
        int[] numbers;
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();
        while (s.hasNext()){
           arrayOfNumbers.add(s.nextInt());
        }
        numbers = fromArray(arrayOfNumbers);
        return numbers;
    }

    private int[] fromArray(ArrayList<Integer> initNumbers){
        int[] intResult = new int[initNumbers.size()];
        for(int i = 0; i < initNumbers.size(); i++) {
            if (initNumbers.get(i) != null) {
                intResult[i] = initNumbers.get(i);
            }
        }
        return intResult;
    }
}
