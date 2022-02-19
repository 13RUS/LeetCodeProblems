package com.company;

public class SolutionMergeSortedArray {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int nums1Copy[] = new int[nums1.length];
            for (int i = 0; i < m; i++) {
                nums1Copy[i] = nums1[i];
            }
            int p1 = 0, p2 = 0;

            for (int j = 0; j < m + n; j++) {
                if (p2 >= n || (p1 < m) && (nums1Copy[p1] < nums2[p2])) {
                    nums1[j] = nums1Copy[p1];
                    p1++;
                } else {
                    nums1[j] = nums2[p2];
                    p2++;
                }
            }
        }

        public void merge2(int[] nums1, int m, int[] nums2, int n) {
            int p1 = m-1, p2 = n-1;
            for (int p = m+n-1;  p >=0 ; p--){
                if (p2 < 0) break;

                if (p1>=0 && nums1[p1]>nums2[p2]){
                    nums1[p] = nums1[p1];
                    p1--;
                }
                else {
                    nums1[p] = nums2[p2];
                    p2--;
                }
            }
    }
}
