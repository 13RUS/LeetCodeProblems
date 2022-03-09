package com.company;

public class SolutionBinarySearch {

    public int search(int[] nums, int target) {

        int middle, left = 0, right = nums.length-1;

        while (left <= right) {
            middle = left + (right-left) / 2;
            if (nums[middle] == target) return middle;

            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }

        return -1;
    }
}
