package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {

    public ArrayList<Integer> divide(ArrayList<Integer> list) {
        ArrayList<Integer> leftSide = new ArrayList<>();
        ArrayList<Integer> rightSide = new ArrayList<>();
        int middleOfList = list.size() / 2;

        if (list.size() == 1) {
            return list;
        } else {
            for (int x = 0; x < middleOfList; x++) {
                leftSide.add(list.get(x));
            }
            for (int y = middleOfList; y < list.size(); y++) {
                rightSide.add(list.get(y));
            }
            leftSide = divide(leftSide);
            rightSide = divide(rightSide);

        }
        return list;
    }

    public static void conquer(ArrayList<Integer> leftSide, ArrayList<Integer> rightSide, ArrayList<Integer> list) {

        int lowestIndex = 0;
        int highestIndex = 0;
        int listIndex = 0;

        while (lowestIndex < leftSide.size() && highestIndex < rightSide.size()) {
            list.set(lowestIndex++,
                    leftSide.get(lowestIndex).compareTo(rightSide.get(highestIndex)) < 0
                            ? leftSide.get(lowestIndex++)
                            : rightSide.get(highestIndex++));
        }
        listIndex++;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list = divide(list);
        for (int i = 0; i < 9; i++) {
            list.add((int) (Math.random() * 10));
        }

    }
}

