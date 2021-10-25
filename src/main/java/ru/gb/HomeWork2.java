package ru.gb;

import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        boolean bln =false;
        Random random1 = new Random();
        int num1 = random1.nextInt(12);
        Random random2 = new Random();
        int num2 = random2.nextInt(12);
        System.out.println("10 <= " + (num1 + num2) + " <= 20: " + isSumNumbers(num1, num2, bln));

        Random positive = new Random();
        int randomNum = positive.nextInt(40) - 20;
        isPositiveNumbers(randomNum);
        System.out.println("randomNum = "+ randomNum);
        System.out.println(isNegativeNumbers(randomNum, bln));

        String word = "Hello, Java";
        int j = 4;
        lineOutput(word, j);

        System.out.print("Введите год: ");
        Scanner sc = new Scanner( System.in);
        int year;
        year = sc.nextInt();
        System.out.println(checkingLeapYear(year, bln));
    }

    public static boolean isSumNumbers(int num1, int num2, boolean bln){
        int sum = num1 + num2;
        if (sum>= 10 && sum<= 20){
            bln = true;
            System.out.println();
        }else{
            bln = false;
        }
        return bln;
    }

    public static int isPositiveNumbers(int number){
        if (number>= 0){
            System.out.print("Число положительное: ");
        }else{
            System.out.print("Число отрицательное: ");
        }
        return number;
    }

    public static boolean isNegativeNumbers( int number, boolean bln){
        if (number>= 0){
            bln= false;
            System.out.print(number + " число положительное: ");
        }else{
            bln = true;
            System.out.print(number + " число отрицательное: ");
        }
        return bln;
    }
    //

    public static String lineOutput(String word, int j) {
        for ( int i = 1; i <= j; i++) {
            System.out.println(word);
        }
        return word;
    }
    public static boolean checkingLeapYear( int year, boolean bln){
        if( year %4 ==0 && year %100 != 0){
            bln = true;
            System.out.print(year + " год високосный: ");
        }else if (year %400 ==0){
            bln = true;
            System.out.print(year + " год високосный: ");
        }else{
            bln = false;
            System.out.print(year + " год не високосный: ");
        }
        return bln;
    }
}

