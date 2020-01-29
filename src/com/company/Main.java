package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<Integer> array = new ArrayList<>();
    List<Integer> sortedArray = new ArrayList<>();

        for (int i = 0; i < 200000; i++) {
            array.add((int) (Math.random() * 100));
        }

        System.out.println(array);
        System.out.println(9241 / 2451);

    InsertionSort(array, sortedArray);
    }

    public static void InsertionSort(List<Integer> unsortedArray, List<Integer> sortedArray) {
        long startTime = System.currentTimeMillis();
        sortedArray.add(unsortedArray.get(0));
        unsortedArray.remove(0);

            while (!unsortedArray.isEmpty()) {
                int nextUnsortedItem = unsortedArray.get(0);
                unsortedArray.remove(0);
                boolean addedToList = false;

                for (int j = sortedArray.size() - 1; j > -1; j--) {
                    int compareCurrentSorted = sortedArray.get(j);

                    if (nextUnsortedItem > compareCurrentSorted) {
                        sortedArray.add(j + 1, nextUnsortedItem);
                        addedToList = true;
                        break;
                    }
                }
                if (!addedToList) {
                    sortedArray.add(0, nextUnsortedItem);
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println(sortedArray);
            System.out.println("time taken: " + (endTime - startTime) + " milliseconds");
        }
    }