package com.epam.homework4;

import java.util.Arrays;
import java.util.Objects;

public class IntegerArray {

    private static final int DEFAULT_SIZE = 10;

    private static final Integer[] EMPTY_ARRAY = {};

    private int size;

    private Integer[] array;

    public IntegerArray() {
        array = EMPTY_ARRAY;
    }

    public IntegerArray(int size) {
        if (size > 0) {
            array = new Integer[size];
        } else if (size == 0) {
            array = EMPTY_ARRAY;
        } else {
            throw new IllegalArgumentException("Illegal size: " + size);
        }
    }

    public void bubbleSort() {
        int buff;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    buff = array[i];
                    array[i] = array[j];
                    array[j] = buff;
                }
            }
        }
    }

    public void insertionSort() {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[i] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public void selectionSort() {
        for (int i = 0; i < array.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int tmp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tmp;
        }
    }

    public int binarySearch(int key){
        int index = -1;
        int low = 0;
        int high = array.length-1;

        while (low <= high){
            int mid = (low + high) /2;
            if(array[mid] < key){
                low = mid + 1;
            }else if(array[mid] > key){
                high = mid - 1;
            }else if(array[mid] == key){
                index = mid;
                break;
            }
        }

        return index;
    }

    public int max(){
        if(array.length == 0){
            throw new IllegalArgumentException("This array is  empty");
        }

        int max = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }

    public int min(){
        if(array.length == 0){
            throw new IllegalArgumentException("This array is  empty");
        }

        int min = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        return min;
    }

    public int[] simpleNumber(){
        int[] simpleNumbers = new int[array.length];
        boolean flag = true;
        int counter = 0;

        for(int i = 0; i< array.length; i++){
            for(int j = 2; j < array[i]; j++){
                if(array[i] % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                simpleNumbers[counter++] = array[i];
            }
            flag = true;
        }

        return simpleNumbers;
    }

    private int fibonachiNumber(int n){
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }

    public int[] fibonachiNumberInArray(){
        int m = 0;
        int fibNumbersInArray[] = new int[array.length];
        int counter = 0;

        while(m < array.length){
            int n = 0;
            int fibNumber;

            while(n <= array[m]){

                fibNumber = fibonachiNumber(n);

                if(array[m] == fibNumber){
                    fibNumbersInArray[counter++] = fibNumber;
                }
                n++;
            }
            m++;
        }

        return fibNumbersInArray;
    }

    public int[] numbersWithThreeDifferentDigits(){
        int[] numbers = new int[array.length];
        int counter = 0;
        int firstDigit;
        int secondDigit;
        int thirdDigit;

        for(int i = 0; i < array.length; i++){
            if(array[i] > 99 && array[i] < 1000){
                firstDigit = array[i] / 100;
                secondDigit = (array[i] / 10) - (firstDigit * 10);
                thirdDigit = array[i] % 10;

                if(firstDigit != secondDigit && firstDigit != thirdDigit && secondDigit != thirdDigit){
                    numbers[counter++] = array[i];
                }
            }
        }

        return numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerArray that = (IntegerArray) o;
        return size == that.size &&
                Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IntegerArray{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }
}
