package com.company;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public void divide(int lowestIndex, int highestIndex, List<String> list, List<String> tempList) {

        int middleOfList = list.size()/2;
        divide(lowestIndex, middleOfList, list, tempList);
        divide(middleOfList + 1, highestIndex, list, tempList);
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> leftList = new ArrayList<>();
        ArrayList<String> rightList = new ArrayList<>();

        list.add("a");
        list.add("e");
        list.add("g");
        list.add("w");
        list.add("c");
        list.add("c");
        list.add("a");

        int middleOfList = list.size()/2;

        for (int x = 0; x < middleOfList; x++) {
            leftList.add(list.get(x));
        }
        for (int y = middleOfList; y < list.size(); y++) {
            rightList.add(list.get(y));
        }

        System.out.println(leftList);
        System.out.println(rightList);

    }
}
