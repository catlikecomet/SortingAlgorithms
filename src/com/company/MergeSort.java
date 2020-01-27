package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {

    public static void divide(int lowestIndex, int highestIndex, List<Integer> list, List<Integer> tempList) {

        //Using recursion to keep dividing the list until it contains only 1 element at any time
        if (lowestIndex < highestIndex) {
            int middleOfList = list.size() / 2;
            divide(lowestIndex, middleOfList, list, tempList);
            divide(middleOfList + 1, highestIndex, list, tempList);
            conquer(lowestIndex, middleOfList, highestIndex, list, tempList);
        }

    }

    //sorting and printing the list
    public static void print(List<Integer> list) {
        divide(0, list.size() - 1, list, new ArrayList<>(list));
        System.out.println(list);
    }

    public static void conquer(int lowestIndex, int middleOfList, int highestIndex, List<Integer> list, List<Integer> tempList) {

        int leftSide = lowestIndex;
        int rightSide = middleOfList + 1;

        for (int x = lowestIndex; x <= highestIndex; x++) {
            tempList.set(x, list.get(x));
        }

        //This while loop is comparing the two lists, the ? : operator is similar to an if so if the statement is true it returns the
        //object to the left of the : if false it returns to the right
        while (leftSide <= middleOfList && rightSide <= highestIndex) {
            list.set(lowestIndex++,
                    tempList.get(leftSide).compareTo(tempList.get(rightSide) < 0
                            ? tempList.get(leftSide++)
                            : tempList.get(rightSide++)));
        }

        while (leftSide <= middleOfList) {
            list.set(lowestIndex++, tempList.get(leftSide++));
        }
    }

        public static void main (String[]args){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                list.add((int) (Math.random() * 10));
            }
            System.out.println(list);
            print(list);
        }
    }

