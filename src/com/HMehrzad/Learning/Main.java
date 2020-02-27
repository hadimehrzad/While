package com.HMehrzad.Learning;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*int count = 1;
        while (count != 6) {
            System.out.println("Count is " + count);
            count++;
        }*/
        /*int count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);*/
        //
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;
        /*int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }*/
        //
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumberFound++;
            if (evenNumberFound >= 5) {
                break;
            }
            //System.out.println("Even number " + number);
        }
        System.out.println("Total even numbers found = " + evenNumberFound);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}