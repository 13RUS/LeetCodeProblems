package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] nums = {1,1,0,1,1,1};
        
        nums = new int [] {-1,0,3,5,9,12};
        //nums = new int [] {2};


        SolutionBinarySearch solutionBinarySearch = new SolutionBinarySearch();
        System.out.println(solutionBinarySearch.search(nums, 9));


    }
}
