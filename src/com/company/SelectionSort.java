package com.company;

import java.util.ArrayList;

public class SelectionSort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int templist;
        for (int i = 0; i < 200000; i++) {
            list.add((int) (Math.random() * 10));
        }
        long startTime = System.currentTimeMillis();
        System.out.println(list);

        for (int x = 0; x < list.size(); x++) {
            for (int y = x + 1; y < list.size(); y++) {
                if (list.get(y) < list.get(x)) {
                    templist = list.get(x);
                    list.set(x, list.get(y));
                    //why is it that below this works but list.set(y, list.get(x)) doesn't?
                    list.set(y, templist);
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(list);
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}
