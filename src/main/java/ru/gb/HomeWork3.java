package ru.gb;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class HomeWork3 {

    public static void main(String[] args) {
        changeElementsArray();
        arrayHundred();
        //increaseElementsArray();
       // doubleArray();

        int len = 5;
        int initialValue = 3;
        //System.out.println(Arrays.toString(refundArray(len, initialValue)));

        int array[] = new int[8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
        //System.out.println(Arrays.toString(array));
        //System.out.println(searchMinNum(array));
        //System.out.println(searchMaxNum(array));

        int n = 2;
        //System.out.println(Arrays.toString(moveElementsArray(n)));
    }

    public static void changeElementsArray(){
        int array[] = {1, 1, 1, 0, 0, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if(array[i] %2 == 0){
                array[i] = 1;
            }else{
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayHundred(){
        int orderArray[] = new int[100];
        for (int i = 0; i < orderArray.length; i++) {
            orderArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(orderArray));
    }

