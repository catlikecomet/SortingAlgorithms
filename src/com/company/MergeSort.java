package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSort {

    public ArrayList<Integer> wholeList;

    public MergeSort(ArrayList<Integer> list) {
        wholeList = list;
    }

    public void sortMethod() {
        wholeList = divide(wholeList);
    }
    public ArrayList<Integer> divide(ArrayList<Integer> list) {
        //Making empty array lists to be able to populate when splitting the lists.
        ArrayList<Integer> leftSide = new ArrayList<>();
        ArrayList<Integer> rightSide = new ArrayList<>();
        //To prevent a stack overflow like i had before i had to make sure
        //that the list size was more than 0. if it is greater than 1, then
        //it splits the list in half and keeps doing so until it does = 1.
        if (list.size() == 1) {
            return list;
        } else {
            int middleOfList = list.size() / 2;
            for (int x = 0; x < middleOfList; x++) {
                leftSide.add(list.get(x));
            }
            for (int y = middleOfList; y < list.size(); y++) {
                rightSide.add(list.get(y));
            }
            leftSide = divide(leftSide);
            rightSide = divide(rightSide);
            //Below merges all of the lists back together.
            conquer(leftSide, rightSide, list);

        }
        return list;
    }

    public static void conquer(ArrayList<Integer> leftSide, ArrayList<Integer> rightSide, ArrayList<Integer> list) {

        int lowestIndex = 0;
        int highestIndex = 0;
        int listIndex = 0;

        while (lowestIndex < leftSide.size() && highestIndex < rightSide.size()) {
            list.set(listIndex,
                    leftSide.get(lowestIndex).compareTo(rightSide.get(highestIndex)) < 0
                            ? leftSide.get(lowestIndex++)
                            : rightSide.get(highestIndex++));
            listIndex++;
        }
        ArrayList<Integer> leftOvers;
        int index;

        if (lowestIndex >= leftSide.size()) {
            leftOvers = rightSide;
            index = highestIndex;
        } else {
            leftOvers = leftSide;
            index = lowestIndex;
        }
        for (int i = index; i < leftOvers.size(); i++) {
            list.set(listIndex, leftOvers.get(i));
            listIndex++;
        }
    }

    public void print() {
        for (int z = 0; z < wholeList.size(); z++) {
            System.out.print(wholeList.get(z));
        }
        System.out.println();

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);
        MergeSort mergeSort = new MergeSort(list);
        mergeSort.sortMethod();
        long endTime = System.currentTimeMillis();
        mergeSort.print();
        System.out.println("time taken: " + (endTime - startTime) + " milliseconds");
    }
}