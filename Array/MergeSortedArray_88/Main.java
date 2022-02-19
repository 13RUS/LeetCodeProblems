package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       
        SolutionMergeSortedArray solutionMergeSortedArray = new SolutionMergeSortedArray();

        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {};
        int m = 3;
        int n = 2;
       // solutionMergeSortedArray.merge(nums1, m, nums2, n);

        nums1 = new int [] {1,2,3,0,0,0,0};
        //nums2 = new int [] {2,5,6,7};
        m = 3;
        n = 4;

        nums1 = new int [] {1,2,0,0,0,0,0};
        //nums2 = new int [] {1,2,2,2,7};
        m = 2;
        n = 5;

        nums1 = new int [] {1};
        m = 1;
        //nums2 = [];
        n = 0;

        nums1 = new int [] {0};
        m = 0;
        nums2 = new int [] {1};
        n = 1;

        nums1 = new int [] {4,5,6,0,0,0};
        m = 3;
        nums2 = new int [] {1,2,3};
        n = 3;

        nums1 = new int [] {1,2,3,0,0,0};
        m = 3;
        nums2 = new int [] {2,5,6};
        n = 3;

        solutionMergeSortedArray.merge(nums1, m, nums2, n);
        solutionMergeSortedArray.merge2(nums1, m, nums2, n);
    }
}
