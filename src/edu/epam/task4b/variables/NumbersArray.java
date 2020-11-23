package edu.epam.task4b.variables;

import java.util.Arrays;

public class NumbersArray {
    private int[] numbers;

    public NumbersArray(int... numbers) {
        this.numbers = numbers;
    }

    public NumbersArray(int size) {
        this.numbers = new int[size];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getNumber(int numberOfNumber) {
        if(numbers.length > numberOfNumber){
            return numbers[numberOfNumber];
        }
        else {
            throw new IllegalArgumentException("Out of trains range");
        }
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setNumber(int number) {
        int newPosition = numbers.length;
        this.numbers[newPosition] = number;
    }

    public void setNumberToPosition(int number,int position) {
        if(numbers.length < position) {
            this.numbers[position] = number;
        }
    }

    @Override
    public int hashCode() {
        int code = 1;
        for(int i=0;i<numbers.length;i++) {
            code = 17 * code + numbers[i];
        }
        code = code*numbers.length;
        return code;
    }

    @Override
    public boolean equals(Object numbersArray) {
        if (this == numbersArray){
            return true;
        }
        if (numbersArray == null || getClass() != numbersArray.getClass()){
            return false;
        }
        NumbersArray arrayOfNumbers = (NumbersArray) numbersArray;
        int[] firstNumbers =  arrayOfNumbers.numbers;
        int[] secondNumbers = this.numbers;
        if(firstNumbers.length == secondNumbers.length) {
            for (int i = 0;i<firstNumbers.length;i++){
                if(firstNumbers[i]!=secondNumbers[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String forOut = String.format("Numbers(%s) - %s",numbers.hashCode() ,Arrays.toString(numbers));
        return forOut;
    }
}
