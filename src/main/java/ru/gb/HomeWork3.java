package ru.gb;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class HomeWork3 {

    public static void main(String[] args) {
        changeElementsArray();
        arrayHundred();
        increaseElementsArray();
        doubleArray();

        int len = 5;
        int initialValue = 3;
        System.out.println(Arrays.toString(refundArray(len, initialValue)) + "\n");

        int array[] = new int[8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
        //System.out.println(Arrays.toString(array));
        System.out.println("minNum = "+ searchMinNum(array));
        System.out.println("maxNum = "+ searchMaxNum(array) + "\n");

        int n = 2;
        System.out.println(Arrays.toString(moveElementsArray(n)));
    }

    public static void changeElementsArray() {
        int array[] = {1, 1, 1, 0, 0, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array) + "\n");
    }

    public static void arrayHundred() {
        int orderArray[] = new int[100];
        for (int i = 0; i < orderArray.length; i++) {
            orderArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(orderArray) + "\n");
    }

    public static void increaseElementsArray(){
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr) + "\n");
    }

    public static void doubleArray(){
        int doubleArr[][] = new int[7][7];
        for (int i = 0; i < doubleArr.length; i++) {
            for (int j = 0; j < doubleArr[i].length; j++) {
                if(i == j || i + j == doubleArr.length -1){
                    doubleArr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(doubleArr[i]));
        }
        System.out.println();
    }

    public static int searchMinNum(int[] array){
        int minNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < minNum){
                minNum = array[i];
            }
        }
        return minNum;
    }

    public static int searchMaxNum(int[] array){
        int maxNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxNum){
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public static int[] refundArray(int len, int value){
        int arr[] =new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        // System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] moveElementsArray( int n){
        int[] moveArr = new int[5];
        Random random = new Random();
        for (int i = 0; i < moveArr.length; i++) {
            moveArr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(moveArr));
        int a = moveArr[moveArr.length - 1];
        int b = moveArr[moveArr.length - 2];
        for (int i = moveArr.length - 1- n; i >= 0; i--) {
            moveArr[i + n] = moveArr[i];
        }
        moveArr[1] = a;
        moveArr[0] = b;
        return moveArr;
    }
}
