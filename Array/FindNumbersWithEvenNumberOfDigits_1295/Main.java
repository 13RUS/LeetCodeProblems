package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        int [] nums = {1,1,0,1,1,1};
        //System.out.println(solution.findMaxConsecutiveOnes (nums));

        nums = new int [] {1,0,1,1,0,1};
        //System.out.println(solution.findMaxConsecutiveOnes (nums));

        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        nums = new int [] {4,-2,5,0,6,3,2};

        SolutionNumbersWithEven solutionNumbersWithEven = new SolutionNumbersWithEven();

        nums = new int [] {12,345,2,6,7896};
        System.out.println(solutionNumbersWithEven.findNumbers (nums));

        nums = new int [] {555,901,482,1771};
        System.out.println(solutionNumbersWithEven.findNumbers (nums));

    }
}
