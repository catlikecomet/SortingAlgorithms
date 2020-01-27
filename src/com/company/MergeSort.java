package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {

    public static void divide(int lowestIndex, int highestIndex, List<Integer> list, List<Integer> tempList) {

        //Using recursion to keep dividing the list until it contains only 1 element at any time
        if (lowestIndex < highestIndex) {
            int middleOfList = list.size()/2;
            divide(lowestIndex, middleOfList, list, tempList);
            divide(middleOfList + 1, highestIndex, list, tempList);
        }

    }

    public static void print(List<Integer> list) {
        divide(0, list.size()-1, list, new ArrayList<Integer>(list));
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            list.add(random.nextInt());
        }
        System.out.println(list);
        print(list);

//        ArrayList<String> list = new ArrayList<>();
//        ArrayList<String> leftList = new ArrayList<>();
//        ArrayList<String> rightList = new ArrayList<>();
//
//        list.add("a");
//        list.add("e");
//        list.add("g");
//        list.add("w");
//        list.add("c");
//        list.add("c");
//        list.add("a");
//
//        int middleOfList = list.size()/2;
//
//        for (int x = 0; x < middleOfList; x++) {
//            leftList.add(list.get(x));
//        }
//        for (int y = middleOfList; y < list.size(); y++) {
//            rightList.add(list.get(y));
//        }
//
//        System.out.println(leftList);
//        System.out.println(rightList);

    }
}
