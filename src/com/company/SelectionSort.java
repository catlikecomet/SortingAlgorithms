package com.company;

import java.util.ArrayList;

public class SelectionSort {

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> list) {

        for (int x = 0; x < list.size() -1; x++) {
                if (list.get(x + 1) < list.get(x)) {
                    list.set(list.get(x), list.get(x + 1));
                    list.set(list.get(x + 1), list.get(x));
                    list.get(x++);
                }
            }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(1);
        System.out.println(list);
        System.out.println(selectionSort(list));



    }
}
