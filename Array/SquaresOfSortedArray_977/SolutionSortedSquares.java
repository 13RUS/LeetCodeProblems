package com.company;

public class SolutionSortedSquares {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] squares = new int[n];

        int left = 0;
        int right = n - 1;
        int leftsquare, rightsquare;

        int highindex = n - 1;

        while (left <= right) {
            leftsquare = nums[left]*nums[left];
            rightsquare = nums[right]*nums[right];
            if (rightsquare > leftsquare) {
                squares[highindex] = rightsquare;
                right--;
                highindex--;
            } else {
                squares[highindex] = leftsquare;
                left++;
                highindex--;
            }
        }
        return squares;
    }
}
