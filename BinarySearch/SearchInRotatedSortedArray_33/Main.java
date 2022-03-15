package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] nums = {1,1,0,1,1,1};
        
        SolutionSearchInRotatedSortedArray solutionSearchInRotatedSortedArray = new SolutionSearchInRotatedSortedArray();
        nums = new int [] {4,5,6,7,0,1,2};
        //nums = new int [] {4,5,6,7,0,1};

        //nums = new int [] {2,1};
        nums = new int [] {1,3};
        int target = 3;

        System.out.println(solutionSearchInRotatedSortedArray.search(nums, target));
    }
}
