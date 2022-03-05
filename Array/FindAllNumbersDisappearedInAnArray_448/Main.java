package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] nums = {1,1,0,1,1,1};
        Solution solution = new Solution();
        //System.out.println(solution.findMaxConsecutiveOnes (nums));

        nums = new int [] {1,0,1,1,0,1};
        //System.out.println(solution.findMaxConsecutiveOnes (nums));

        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        nums = new int [] {4,-2,5,0,6,3,2};

        //SolutionDublicateZeros solutionDublicateZeros = new SolutionDublicateZeros();
        nums = new int [] {1,0,2,3,0,4,5,0};
        nums = new int [] {1,2,3};
        nums = new int [] {0,0,0,0,0,0,0};

        //solutionDublicateZeros.duplicateZeros(nums);

        SolutionMergeSortedArray solutionMergeSortedArray = new SolutionMergeSortedArray();

        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,3};
        int m = 3;
        int n = 2;

        solutionMergeSortedArray.merge(nums1, m, nums2, n);
        solutionMergeSortedArray.merge2(nums1, m, nums2, n);

        SolutionRemoveDuplicatesfromSortedArray solutionRemoveDuplicatesfromSortedArray = new SolutionRemoveDuplicatesfromSortedArray();

        nums = new int[] {0,0,1,1,2,2};
        nums = new int[] {0,1,2,3,4};
        //nums = new int[] {0,1,1,1,2,2,2,2,2,3,3,3,3};
        //nums = new int[] {0,0,0,0,0};

        //System.out.println(solutionRemoveDuplicatesfromSortedArray.removeDuplicates (nums));

        SolutionIfNandDoubleExist solutionIfNandDoubleExist = new SolutionIfNandDoubleExist();
        nums = new int [] {10,2,5,3};
        nums = new int [] {-2,0,10,-19,4,6,-8};

        //System.out.println(solutionIfNandDoubleExist.checkIfExist(nums));
        nums = new int [] {0,3,2,1};
        nums = new int [] {0,2,3,4,5,3,2,1,0};
        nums = new int [] {0,2,3,3,5,3,2,1,0};
        nums = new int [] {9,8,7,6,5,4,3,2,1,0};
        //nums = new int [] {0,1,2,3,4,5};
        //nums = new int [] {1,1,1,1};

        SolutionValidMountainArray solutionValidMountainArray = new SolutionValidMountainArray();

        //System.out.println(solutionValidMountainArray.validMountainArray(nums));

        SolutionReplaceElementsWithGreatestElementOnRightSide solutionReplaceElementsWithGreatestElementOnRightSide = new SolutionReplaceElementsWithGreatestElementOnRightSide();
        nums = new int [] {17,18,5,4,6,1};
        nums = new int [] {400,500,600,600};
        //solutionReplaceElementsWithGreatestElementOnRightSide.replaceElements(nums);

        SolutionMoveZeroes solutionMoveZeroes = new SolutionMoveZeroes();
        nums = new int [] {0,1,0,3,12};
        nums = new int [] {0};
        nums = new int [] {17,18,0,5,4,6,1,0};

        nums = new int [] {0,0,0,0,0,0};
        nums = new int [] {17,18,5,4,6,1};

       // solutionMoveZeroes.moveZeroes(nums);
       // solutionMoveZeroes.moveZeroes2(nums);
        nums = new int [] {3,1,2,4};
        nums = new int [] {17,18,5,4,6,1};
        nums = new int [] {0,0,0,0,0,0};
        nums = new int [] {0};
        nums = new int [] {2,4,4,1,1,1,2,5,6,};

        SolutionSortArrayByParity solutionSortArrayByParity = new SolutionSortArrayByParity();
        //solutionSortArrayByParity.sortArrayByParity(nums);

        SolutionHeightChecker solutionHeightChecker = new SolutionHeightChecker();
        nums = new int [] {1,1,4,2,1,3};
        //System.out.println(solutionHeightChecker.heightChecker(nums));

        SolutionMaxConsecutiveOnes2 solutionMaxConsecutiveOnes2 = new SolutionMaxConsecutiveOnes2();
        nums = new int [] {1,0,1,1,0};
        //nums = new int [] {1,0,1,1,0,1};
        //nums = new int [] {1,1,1,1,1,0};
        //nums = new int [] {1,0,0,0};
        //System.out.println(solutionMaxConsecutiveOnes2.findMaxConsecutiveOnes(nums));
        //System.out.println(solutionMaxConsecutiveOnes2.findMaxConsecutiveOnes2(nums));

        nums = new int [] {3,2,2,2,1,3,4,5,6,6};
        nums = new int [] {3,2,1,1};
        nums = new int [] {-1,1,-2};
        SolutionThirdMax solutionThirdMax = new SolutionThirdMax();
        //System.out.println(solutionThirdMax.thirdMax(nums));

        SolutionFindAllNumbersDisappearedInAnArray solutionFindAllNumbersDisappearedInAnArray = new SolutionFindAllNumbersDisappearedInAnArray();
        nums = new int [] {4,3,2,7,8,2,3,1};
        //nums = new int [] {1,1,1,1,1,2,3,5,7,9};
        //nums = new int [] {1,1};

        System.out.print(solutionFindAllNumbersDisappearedInAnArray.findDisappearedNumbers(nums));
    }
}
