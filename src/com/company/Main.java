package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<Integer> array = new ArrayList<>();
    List<Integer> sortedArray = new ArrayList<>();

    array.add(9);
    array.add(1);
    array.add(4);
    array.add(3);
    array.add(2);

    InsertionSort(array, sortedArray);
    }

    public static void InsertionSort(List<Integer> unsortedArray, List<Integer> sortedArray) {
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
            System.out.println(sortedArray);
        }
    }