package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] nums = {5,7,7,8,8,10};
        int target = 8;

        //nums = new int[] {};
        //target = 0 ;

        FindFirstAndLastPositionOfElementInSortedArray findFirstAndLastPositionOfElementInSortedArray = new FindFirstAndLastPositionOfElementInSortedArray();
        findFirstAndLastPositionOfElementInSortedArray.searchRange(nums, target);
    }
}
