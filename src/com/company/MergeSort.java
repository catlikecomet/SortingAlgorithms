package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {

    public ArrayList<Integer> divide(ArrayList<Integer> list) {
        ArrayList<Integer> leftSide = new ArrayList<>();
        ArrayList<Integer> rightSide = new ArrayList<>();
        int  middleOfList = list.size()/2;

        if (list.size() == 1) {
            return list;
        } else {
            for(int x = 0; x < middleOfList; x++) {
                leftSide.add(list.get(x));
            }
            for(int y = middleOfList; y < list.size(); y++) {
                rightSide.add(list.get(y));
            }
            leftSide = divide(leftSide);
            rightSide = divide(rightSide);

        }
        return list;
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
            ArrayList<Integer> list = new ArrayList<>();
            list = divide(list);
            for (int i = 0; i < 9; i++) {
                list.add((int) (Math.random() * 10));
            }

        }
    }

