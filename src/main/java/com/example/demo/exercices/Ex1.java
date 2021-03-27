package com.example.demo.exercices;

import java.util.*;

public class Ex1 {

    /*
     * This first method is using java collection api operations to filter the first duplicated Number
     * */

    /*
    public Integer findFirstDuplicatedNumber(Integer[] list) {
        Set<Integer> allItems = new HashSet<>();
        return Arrays.stream(list).filter(i -> !allItems.add(i)).findFirst().orElse(null);
    }*/

    /*
     * - This second method is using HashSet to find the first duplicated index (that has the minimal index)
     * - It return null if the provided list = null or if no duplicated value was found or if the list is empty
     * - It return a wrapper type Integer and not a primitive type
     * - The time complexity of this solution is O(n) because we iterate over an array once
     * - The space complexity of this solution is O(n) because we are using the HashSet data structure
     * */
    public Integer findFirstDuplicatedNumber(int[] list) {
        Set<Integer> aSet = new HashSet<>();
        if (list != null) {
            for (int value : list) {
                if (!aSet.add(value)) {
                    return value;
                }
            }
        }
        return null;
    }
}
