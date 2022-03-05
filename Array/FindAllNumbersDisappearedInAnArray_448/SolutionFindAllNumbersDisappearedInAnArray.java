package com.company;

import java.util.*;

public class SolutionFindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length);

        for (int i: nums) {
            list.add(Integer.valueOf(i));
        }

        Collections.sort(list);
        List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(list));

        if (listWithoutDuplicates.size() == 1) {
            listWithoutDuplicates.clear();
            for (int i: nums) {
                listWithoutDuplicates.add(Integer.valueOf(i));
            }
        }

        int indexlist = 0;
        int startInterval = 1;//listWithoutDuplicates.get(0);
        int endInterval = nums.length;
        int finallistsize =  endInterval - listWithoutDuplicates.size();

        List<Integer> finallist = new ArrayList<>(finallistsize);

        for (int i = startInterval; i <= endInterval; i++)
        {
            if (indexlist <= (listWithoutDuplicates.size()-1)) {
                if (i != listWithoutDuplicates.get(indexlist)) {
                    finallist.add(i);
                } else {
                    indexlist++;
                }
            } else {
                finallist.add(i);
            };
        }
        return finallist;
    }
}
